package com.fdmgroup.tradingplatform.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;
import com.fdmgroup.selenium.usefulmethods.UsefulMethods;

import pageObjects.BuyStockPage;
import pageObjects.BuyingSharePage;
import pageObjects.HomePage;
import pageObjects.TransactionConfirmationPage;

public class BuyStock {

	private WebDriver driver;

	@Before
	public void preConditions() throws IOException{
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/");
		HomePage.usernameField(driver).sendKeys(DataFile.testUser);
		HomePage.passwordField(driver).sendKeys(DataFile.testUser);
		HomePage.loginButton(driver).click();
		HomePage.buyStock(driver).click();
	}

	@After
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void testThatAUserCanBuyStock() throws IOException, InterruptedException{
		assertEquals(DataFile.buyStockMessage, BuyStockPage.pageMessage(driver).getText());
		BuyStockPage.clickGFilter(driver).click();

		WebElement table = BuyStockPage.tableData(driver);
		List <WebElement> rowsInTable = table.findElements(By.tagName("tr"));
		for (WebElement row: rowsInTable){
			System.out.println(row.getText());
			if(BuyStockPage.tableData(driver).getText().contains(DataFile.glencore)){
				System.out.println("Company " + DataFile.glencore + " is available");
				BuyStockPage.addCompany(driver).click();
				BuyStockPage.buyButton(driver).click();
				assertEquals(DataFile.glencore, BuyingSharePage.companyName(driver).getText());
				BuyingSharePage.numberToBuyField(driver).sendKeys(DataFile.amountToBuy);
				BuyingSharePage.calculateButton(driver).click();
				UsefulMethods.takeScreenshot(driver, "Glencore summary screen");
				Thread.sleep(3000);
				BuyingSharePage.confirmButton(driver).click();
				TransactionConfirmationPage.homeButton(driver).click();
				HomePage.transactionHistoryButton(driver).click();
				assertEquals(DataFile.transactionHistory, TransactionHistoryPage.pageMessage(driver).getText());
				assertEquals(DataFile.todayDate, TransactionHistoryPage.latestTransaction(driver).getText().substring(0, 11));
				assertEquals(DataFile.glencore, TransactionHistoryPage.latestTransactionName(driver).getText());
				break;
			}else{
				System.out.println("Company " + DataFile.glencore + " is not available");
				UsefulMethods.takeScreenshot(driver, "No glencore stock available");
			}
		}


	}
}






