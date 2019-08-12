package stepDefinitionFiles;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddNewAccountPage;
import pageObjects.CheckBalancePage;
import pageObjects.HomePage;

public class CheckBalanceStepDefinition {

	private WebDriver driver;
	
	@Given("^the browser is opened$")
	public void the_browser_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get("http://unxbtn001/TradingPlatform_CLEAN/");
	}

	@Given("^the user is at the check balance page$")
	public void the_user_is_at_the_check_balance_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.usernameField(driver).sendKeys("tttt");
		HomePage.passwordField(driver).sendKeys("tttt");
		HomePage.loginButton(driver).click();
		HomePage.checkBalance(driver).click();
	}

	@When("^the user clicks on add new account$")
	public void the_user_clicks_on_add_new_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CheckBalancePage.addNewAccount(driver).click();
	}

	@When("^the user selects a new account to add$")
	public void the_user_selects_a_new_account_to_add(String currency) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AddNewAccountPage.availableAccounts(driver).sendKeys(currency);
	}

	@When("^the user clicks the on the add account button$")
	public void the_user_clicks_the_on_the_add_account_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AddNewAccountPage.addAccount(driver).click();
	}

	@Then("^the current balance screen appears$")
	public void the_current_balance_screen_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.currentBalance, CheckBalancePage.pageMessage(driver).getText());
	}

	@When("^the user clicks on add balance to the new account$")
	public void the_user_clicks_on_add_balance_to_the_new_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CheckBalancePage.addFundsToNewAccount(driver).click();
	}

	@When("^the user waits for the confirm button to appea$")
	public void the_user_waits_for_the_confirm_button_to_appea() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	}

	@When("^the user enters an ammount they wish to add$")
	public void the_user_enters_an_ammount_they_wish_to_add() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CheckBalancePage.addFundsField(driver).sendKeys(DataFile.fiftyThousand);
	}

	@Then("^the user will see their new account with funds$")
	public void the_user_will_see_their_new_account_with_funds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.fiftyThousand, CheckBalancePage.addFundsField(driver).getAttribute("value"));
	}

	@Then("^the user selects the confirm button$")
	public void the_user_selects_the_confirm_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CheckBalancePage.confirmFundsButton(driver).click();
	}

	@Then("^close the browser down$")
	public void close_the_browser_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
	
}
