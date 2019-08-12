package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBalancePage {

	public static WebElement addNewAccount(WebDriver driver) {
		return driver.findElement(By.linkText("Add New Account"));
	}

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='main']/h3"));
	}

	public static WebElement addFundsToNewAccount(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='main']/table/tbody/tr[3]/td[4]/form/input[4]"));
	}

	public static WebElement addFundsFieldTitle(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='updateForm']/form/b"));
	}

	public static WebElement addFundsField(WebDriver driver) {
		return driver.findElement(By.name("credit"));
	}

	public static WebElement confirmFundsButton(WebDriver driver) {
		return driver.findElement(By.id("submitBtn"));
	}

	public static WebElement getBalanceForUSDAccount(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='main']/table/tbody/tr[3]/td[3]"));
	}

}
