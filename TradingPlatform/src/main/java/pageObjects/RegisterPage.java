package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	public static WebElement title(WebDriver driver) {
		return driver.findElement(By.name("title"));
	}
	
	public static WebElement firstnameField(WebDriver driver){		
		return driver.findElement(By.id("firstName"));
	}
	
	public static WebElement surnameField(WebDriver driver){		
		return driver.findElement(By.id("lastName"));
	}
	
	public static WebElement emailField(WebDriver driver){		
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement usernameField(WebDriver driver){		
		return driver.findElement(By.id("username"));
	}

	public static WebElement passwordField(WebDriver driver){		
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement confirmPasswordField(WebDriver driver){		
		return driver.findElement(By.id("confirmPassword"));
	}
	
	public static WebElement securityQuestion(WebDriver driver){		
		return driver.findElement(By.name("question"));
	}
	
	public static WebElement securityAnswer(WebDriver driver){		
		return driver.findElement(By.name("answer"));
	}
	
	public static WebElement confirmsecurityAnswer(WebDriver driver){		
		return driver.findElement(By.name("confirmAnswer"));
	}

	public static WebElement submitbutton(WebDriver driver){		
		return driver.findElement(By.xpath("//*/table/tbody/tr[11]/td[2]/input[1]"));
	}

	public static WebElement confirmAccount(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='main']/p[1]"));
	}
}
