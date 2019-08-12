package com.fdmgroup.tradingplatform.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;
import com.fdmgroup.selenium.usefulmethods.UsefulMethods;

import pageObjects.AddNewAccountPage;
import pageObjects.CheckBalancePage;
import pageObjects.HomePage;

public class CheckBalance {

	private WebDriver driver;

	@Before
	public void preConditions() throws IOException{
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/");
		HomePage.usernameField(driver).sendKeys("pppp");
		HomePage.passwordField(driver).sendKeys("pppp");
		HomePage.loginButton(driver).click();
		HomePage.checkBalance(driver).click();
	}

	@After
	public void tearDown(){
		//driver.quit();
	}


	@Test
	public void addANewAccountAndAddFiftyThousand() throws IOException, InterruptedException{
		for(int i = 1; i<7; i++){
			CheckBalancePage.addNewAccount(driver).click();
			assertEquals(DataFile.addNewAccountMessage, AddNewAccountPage.pageMessage(driver).getText());
			if(AddNewAccountPage.availableAccounts(driver).getText().contains(" ")){
				AddNewAccountPage.availableAccounts(driver).sendKeys(DataFile.usd);
				AddNewAccountPage.addAccount(driver).click();
				assertEquals(DataFile.currentBalance, CheckBalancePage.pageMessage(driver).getText());
				CheckBalancePage.addFundsToNewAccount(driver).click();
				Thread.sleep(3000);
				CheckBalancePage.addFundsField(driver).sendKeys(DataFile.fiftyThousand);
				assertEquals(DataFile.fiftyThousand, CheckBalancePage.addFundsField(driver).getAttribute("value"));
				CheckBalancePage.confirmFundsButton(driver).click();
				UsefulMethods.takeScreenshot(driver, "Updated accounts");
				assertEquals(DataFile.currentBalance, CheckBalancePage.pageMessage(driver).getText());
			}else{
				System.out.println("New currency account is not available");
				UsefulMethods.takeScreenshot(driver, "No New account available");
				AddNewAccountPage.backLink(driver).click();
			}
		}
	}
}
