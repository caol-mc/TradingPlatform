package com.fdmgroup.selenium.usefulmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.selenium.datafile.DataFile;

import pageObjects.HomePage;

public class UsefulMethods {
	
	private static WebDriver driver;
	
	public static void takeScreenshot(WebDriver driver, String name) throws IOException{
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("C:\\Users\\caol.mcnamara\\Pictures\\"+ name +".png"));
	}
	
	public static void login(){
		HomePage.usernameField(driver).sendKeys(DataFile.username1);
		HomePage.passwordField(driver).sendKeys(DataFile.newPassword);
		HomePage.loginButton(driver).click();
	}

}	
