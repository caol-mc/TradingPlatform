package stepDefinitionFiles;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ConfirmPasswordResetPage;
import pageObjects.HomePage;
import pageObjects.ResetPasswordPage;

public class ResetPasswordStepDefinition {

	private WebDriver driver;
	
	@Given("^that the browser is open on google$")
	public void that_the_browser_is_open_on_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
	}

	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(DataFile.homePage);
	}

	@When("^the user clicks on the forgotten password link$")
	public void the_user_clicks_on_the_forgotten_password_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.resetPassword(driver).click();
	}

	@Then("^the user is directed to the forgotten password screen$")
	public void the_user_is_directed_to_the_forgotten_password_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.resetPasswordHeading, ResetPasswordPage.pageMessage(driver).getText());
	}

	@When("^the user enters their username into the field$")
	public void the_user_enters_their_username_into_the_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ResetPasswordPage.username(driver).sendKeys(DataFile.username1);
	}

	@When("^the user selects their security question$")
	public void the_user_selects_their_security_question() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ResetPasswordPage.question(driver).sendKeys(DataFile.securityQuestion);
	}

	@When("^the user enters their security answer$")
	public void the_user_enters_their_security_answer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ResetPasswordPage.answer(driver).sendKeys(DataFile.answer);
	}

	@When("^the user clicks the reset password button$")
	public void the_user_clicks_the_reset_password_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ResetPasswordPage.submitButton(driver).click();
	}

	@Then("^the user is directed to the password reset screen with their new password$")
	public void the_user_is_directed_to_the_password_reset_screen_with_their_new_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.confirmPasswordChangeScreen, ConfirmPasswordResetPage.pageMessage(driver).getText());
	}

	@When("^the user clicks on the home link$")
	public void the_user_clicks_on_the_home_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ConfirmPasswordResetPage.homeButton(driver).click();
	}

	@Then("^the user is directed to the home page$")
	public void the_user_is_directed_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.homePageMessage, HomePage.pageMessage(driver).getText());
	}

	@Then("^the user enters their username into the login$")
	public void the_user_enters_their_username_into_the_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.usernameField(driver).sendKeys(DataFile.testUser);
	}

	@Then("^the user selects their password into the field$")
	public void the_user_selects_their_password_into_the_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.passwordField(driver).sendKeys(DataFile.testUser);
	}

	@Then("^the user clicks the submit button to login$")
	public void the_user_clicks_the_submit_button_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.loginButton(driver).click();
	}

	@Then("^the user is directed to the logged in page$")
	public void the_user_is_directed_to_the_logged_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.welcomeMessagetestUser, HomePage.welcomeMessage(driver).getText());
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
