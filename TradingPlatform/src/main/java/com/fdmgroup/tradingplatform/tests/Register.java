package com.fdmgroup.tradingplatform.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class Register {
	
	private WebDriver driver;
	private Random r = new Random();
	int x =  r.nextInt(10000);

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
	public void registerSuccess() throws IOException{
		HomePage.registerLink(driver).click();
		assertEquals(DataFile.registerHeading, driver.findElement(By.tagName("h3")).getText());
		RegisterPage.title(driver).sendKeys("Mr");
		RegisterPage.firstnameField(driver).sendKeys("Caol");
		RegisterPage.surnameField(driver).sendKeys("McNamara");
		RegisterPage.emailField(driver).sendKeys("caol"+ x +"@test.com");
		RegisterPage.usernameField(driver).sendKeys("caol"+x);
		RegisterPage.passwordField(driver).sendKeys("Password1");
		RegisterPage.confirmPasswordField(driver).sendKeys("Password1");
		RegisterPage.securityQuestion(driver).sendKeys("Who is your favourite left handed person");
		RegisterPage.securityAnswer(driver).sendKeys("Caol");
		RegisterPage.confirmsecurityAnswer(driver).sendKeys("Caol");
		RegisterPage.submitbutton(driver).click();
		assertEquals("caol"+x, RegisterPage.confirmAccount(driver).getText().substring(17));
	}
}
