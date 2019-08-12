package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionConfirmationPage {

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='transaction_summary']/h3"));
	}

	public static WebElement transactionHistoryButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='tabs25']/ul/li[6]/a"));
	}

	public static WebElement latestTransaction(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='transaction_history']/tbody/tr[1]/td[7]"));
	}

	public static WebElement homeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='main']/a"));
	}

}
