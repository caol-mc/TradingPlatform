package com.fdmgroup.tradingplatform.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;

import pageObjects.ConfirmPasswordResetPage;
import pageObjects.HomePage;
import pageObjects.ResetPasswordPage;

public class ResetPassword {
	
	private WebDriver driver;
	
	@Before
	public void preConditions(){
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get(DataFile.homePage);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void resetPassword(){
		HomePage.resetPassword(driver).click();
		assertEquals(DataFile.resetPasswordHeading, ResetPasswordPage.pageMessage(driver).getText());
		ResetPasswordPage.username(driver).sendKeys(DataFile.username1);
		ResetPasswordPage.question(driver).sendKeys(DataFile.securityQuestion);
		ResetPasswordPage.answer(driver).sendKeys(DataFile.answer);
		ResetPasswordPage.submitButton(driver).click();
		assertEquals(DataFile.confirmPasswordChangeScreen, ConfirmPasswordResetPage.pageMessage(driver).getText());
		String newPassword = ConfirmPasswordResetPage.newPassword(driver).getText().substring(14);
		
		if(newPassword.length() == 10){
			DataFile.newPassword = newPassword;
		}
		assertTrue(newPassword.length() == 10);
		ConfirmPasswordResetPage.homeButton(driver).click();
		assertEquals(DataFile.homePageMessage, HomePage.pageMessage(driver).getText());
		HomePage.usernameField(driver).sendKeys(DataFile.username1);
		HomePage.passwordField(driver).sendKeys(DataFile.newPassword);
		HomePage.loginButton(driver).click();
		assertEquals(DataFile.welcomeMessageRogue, HomePage.welcomeMessage(driver).getText());
	}

}
