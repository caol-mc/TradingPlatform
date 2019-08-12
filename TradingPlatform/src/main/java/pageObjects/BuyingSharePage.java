package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyingSharePage {

	public static WebElement companyName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='number_shares']/table/tbody/tr[1]/td"));
	}

	public static WebElement numberToBuyField(WebDriver driver) {
		return driver.findElement(By.name("amount"));
	}

	public static WebElement calculateButton(WebDriver driver) {
		return driver.findElement(By.id("calcBtn"));
	}

	public static WebElement confirmButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='transaction_summary']/form/input[3]"));
	}

	public static WebElement insufficientFunds(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='transaction_summary']/form/p"));
	}

}
