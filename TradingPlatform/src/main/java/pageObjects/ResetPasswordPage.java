package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}

	public static WebElement question(WebDriver driver) {
		return driver.findElement(By.name("question"));
	}

	public static WebElement answer(WebDriver driver) {
		return driver.findElement(By.name("answer"));
	}

	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.name("submit"));
	}

	public static WebElement homeButton(WebDriver driver) {
		return driver.findElement(By.linkText("Home"));
	}

	public static WebElement pageMessage(WebDriver driver) {
		
		return driver.findElement(By.tagName("h3"));
	}

}
