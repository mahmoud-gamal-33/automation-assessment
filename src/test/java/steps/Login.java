package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.HomePage;
import tests.TestBase;

public class Login extends TestBase {
	@Given("user in homepage")
	public void user_in_homepage() {
        HomePage home= new HomePage(driver);

	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
        HomePage home= new HomePage(driver);
        DashboardPage dash = new DashboardPage(driver);
		Assert.assertTrue(dash.adminButton.isDisplayed());	   
		throw new io.cucumber.java.PendingException();
	}
	@When("click on login button")
	public void click_on_login_button() {
        HomePage home= new HomePage(driver);
        DashboardPage dash = new DashboardPage(driver);
		throw new io.cucumber.java.PendingException();
	}
	@Then("user is logged in now")
	public void user_is_logged_in_now() {
        HomePage home= new HomePage(driver);
        DashboardPage dash = new DashboardPage(driver);
		Assert.assertTrue(dash.adminButton.isDisplayed());	  
	    throw new io.cucumber.java.PendingException();
	}

}
