package com.fdmgroup.tradingplatform.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionHistoryPage {

	public static WebElement pageMessage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='main']/h3"));
	}

	public static WebElement latestTransaction(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='transaction_history']/tbody/tr[1]/td[7]"));
	}

	public static WebElement latestTransactionName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='transaction_history']/tbody/tr[1]/td[1]"));
	}

}
