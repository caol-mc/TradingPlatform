package com.fdmgroup.TestSuite;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.driverutilities.DriverUtilities;

public class Snake {
	
	WebDriver driver;
	Random r = new Random();
	int x =  r.nextInt(500);

	@Before
	public void preConditions(){
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("http://patorjk.com/games/snake/");
	}
	
	@After
	public void tearDown(){
		//driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sbWelcome0\"]/button")).click();
		WebElement board = driver.findElement(By.id("playingField"));
		board.click();
		Thread.sleep(2000);
		WebElement move = driver.findElement(By.id("game-area"));
		move.sendKeys("d");
		Thread.sleep(1000);
		randomMove(move);
	}
	
	
	
	
	
	
	
	
	

	private void randomMove(WebElement move) throws InterruptedException {
		while(true) {
		move.sendKeys("s");		
		move.sendKeys("s");		
		Thread.sleep(x);
		move.sendKeys("a");
		Thread.sleep(x);
		move.sendKeys("w");
		move.sendKeys("w");
		Thread.sleep(x);
		move.sendKeys("d");
		Thread.sleep(x);
		move.sendKeys("w");		
		move.sendKeys("w");		
		Thread.sleep(x);
		move.sendKeys("d");
		Thread.sleep(x);
		move.sendKeys("s");
		move.sendKeys("s");
		Thread.sleep(x);
		move.sendKeys("a");
		Thread.sleep(x);
		}
	}

}
