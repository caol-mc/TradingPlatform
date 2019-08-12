package stepDefinitionFiles;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.driverutilities.DriverUtilities;
import com.fdmgroup.selenium.datafile.DataFile;
import com.fdmgroup.tradingplatform.tests.TransactionHistoryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BuyStockPage;
import pageObjects.BuyingSharePage;
import pageObjects.HomePage;
import pageObjects.TransactionConfirmationPage;

public class BuyStockDefinition {

	private WebDriver driver;
	
	@Given("^the browser is open$")
	public void the_browser_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
	}

	@Given("^the user is at the buy stock page$")
	public void the_user_is_at_the_buy_stock_page() throws Throwable {
		driver.get(DataFile.homePage);
		HomePage.usernameField(driver).sendKeys(DataFile.testUser);
		HomePage.passwordField(driver).sendKeys(DataFile.testUser);
		HomePage.loginButton(driver).click();
		HomePage.buyStock(driver).click();
	}

	@When("^the user clicks on G$")
	public void the_user_clicks_on_G() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BuyStockPage.clickGFilter(driver).click();
	}

	@When("^the user clicks on the radio button for Glencore Intl$")
	public void the_user_clicks_on_the_radio_button_for_Glencore_Intl() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BuyStockPage.addCompany(driver).click();
	}
	
	@When("^the user waits for the confirm button to appear$")
	public void the_user_waits_for_the_confirm_button_to_appear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	}

	@When("^the user clicks the buy button$")
	public void the_user_clicks_the_buy_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BuyStockPage.buyButton(driver).click();
	}

	@Then("^the transaction summary message appears$")
	public void the_transaction_summary_message_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.glencore, BuyingSharePage.companyName(driver).getText());
	}

	@When("^the user enters the amount of shares they wish to buy$")
	public void the_user_enters_the_amount_of_shares_they_wish_to_buy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BuyingSharePage.numberToBuyField(driver).sendKeys(DataFile.amountToBuy);
	}

	@When("^the user clicks on the calculate button$")
	public void the_user_clicks_on_the_calculate_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BuyingSharePage.calculateButton(driver).click();
	}

	@When("^the user clicks on the confirm button$")
	public void the_user_clicks_on_the_confirm_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BuyingSharePage.confirmButton(driver).click();
	}

	@When("^the user clicks to return to the home page$")
	public void the_user_clicks_to_return_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TransactionConfirmationPage.homeButton(driver).click();
	}

	@When("^the user clicks to navigate to the transaction history page$")
	public void the_user_clicks_to_navigate_to_the_transaction_history_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.transactionHistoryButton(driver).click();
	}

	@Then("^the user will see their recent transaction$")
	public void the_user_will_see_their_recent_transaction() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(DataFile.transactionHistory, TransactionHistoryPage.pageMessage(driver).getText());
		assertEquals(DataFile.todayDate, TransactionConfirmationPage.latestTransaction(driver).getText().substring(0, 11));
		assertEquals(DataFile.glencore, TransactionHistoryPage.latestTransactionName(driver).getText());
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
