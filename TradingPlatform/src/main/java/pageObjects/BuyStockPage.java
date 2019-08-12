package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyStockPage {

	public static WebElement clickGFilter(WebDriver driver) {
		return driver.findElement(By.linkText("G"));
	}

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.tagName("h3"));
	}

	public static WebElement tableData(WebDriver driver) {
		return driver.findElement(By.xpath("//div/form/table/tbody"));
	}

	public static WebElement availableCompanies(WebDriver driver) {
		return driver.findElement(By.tagName("tr"));
	}

	public static WebElement addCompany(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='GLEN.L']/td[4]/input"));
	}

	public static WebElement buyButton(WebDriver driver) {
		return driver.findElement(By.id("submitBtn"));
	}

}
