package stepDefinitionFiles;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class LoginStepDefinition {

	private WebDriver driver;
	
	@Given("^that the browser is open$")
	public void that_the_browser_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
	}

	@Given("^the user is on the home page$")
	public void the_user_is_on_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/");
	}

	@When("^the user enters their username$")
	public void the_user_enters_their_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.usernameField(driver).sendKeys("deeep");
	}

	@When("^the user enters their password$")
	public void the_user_enters_their_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.passwordField(driver).sendKeys("deeep");
	}

	@When("^the user clicks the submit button$")
	public void the_user_clicks_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.loginButton(driver).click();
	}

	@Then("^the user is directed to the logged in homepage with the correct message$")
	public void the_user_is_directed_to_the_logged_in_homepage_with_the_correct_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Hello "+"deeep" , HomePage.welcomeMessage(driver).getText());
	}
	
	@Then("^close$")
	public void close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
