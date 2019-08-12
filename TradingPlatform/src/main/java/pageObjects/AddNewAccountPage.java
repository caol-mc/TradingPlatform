package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewAccountPage {

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.tagName("h3"));
	}

	public static WebElement availableAccounts(WebDriver driver) {
		return driver.findElement(By.name("currency"));
	}

	public static WebElement addAccount(WebDriver driver) {
		return driver.findElement(By.xpath("//*/table/tbody/tr/td[3]/input"));
	}

	public static WebElement backLink(WebDriver driver) {
		return driver.findElement(By.linkText("Back"));
	}

}
