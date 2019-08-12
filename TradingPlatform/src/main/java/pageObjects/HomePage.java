package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement registerLink(WebDriver driver){		
		return driver.findElement(By.linkText("Register"));
	}
	
	public static WebElement usernameField(WebDriver driver) {
		return driver.findElement(By.name("j_username"));
	}

	public static WebElement passwordField(WebDriver driver) {
		return driver.findElement(By.xpath("//*/form/table/tbody/tr[2]/td[2]/input"));
	}

	public static WebElement loginButton(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*/form/table/tbody/tr[3]/td/input"));
	}

	public static WebElement resetPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*/p/a"));
	}

	public static WebElement welcomeMessage(WebDriver driver) {
		return driver.findElement(By.tagName("h3"));
	}

	public static WebElement checkBalance(WebDriver driver) {
		return driver.findElement(By.linkText("Check Balance"));
	}

	public static WebElement buyStock(WebDriver driver) {
		return driver.findElement(By.linkText("Buy Stock"));
	}

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='login']/h3"));
	}

	public static WebElement transactionHistoryButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='welcome_table']/tbody/tr[3]/td[1]/a"));
	}

}
