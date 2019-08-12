package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmPasswordResetPage {

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.tagName("h3"));
	}

	public static WebElement homeButton(WebDriver driver) {
		return driver.findElement(By.linkText("Home"));
	}

	public static WebElement newPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*/p[1]"));
	}

}
