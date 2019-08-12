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

import pageObjects.HomePage;

public class Login {
	
	private WebDriver driver;

	@Before
	public void preConditions(){
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	
	@Test
	public void testThatACurrentUserCanLogin() throws IOException{
		HomePage.usernameField(driver).sendKeys(DataFile.username1);
		UsefulMethods.takeScreenshot(driver, "Picture one");
		HomePage.passwordField(driver).sendKeys(DataFile.newPassword);
		UsefulMethods.takeScreenshot(driver, "Picture two");
		HomePage.loginButton(driver).click();
		assertEquals("Hello Rogue" , HomePage.welcomeMessage(driver).getText());
	}
}
