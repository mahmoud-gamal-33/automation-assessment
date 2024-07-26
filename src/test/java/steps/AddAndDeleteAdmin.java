package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;
import pages.DashboardPage;
import pages.HomePage;
import tests.TestBase;

public class AddAndDeleteAdmin extends TestBase {
	@Given("user loged in")
	public void user_loged_in() {
        HomePage home= new HomePage(driver);
        DashboardPage dash = new DashboardPage(driver);
		Assert.assertTrue(dash.adminButton.isDisplayed());
	    throw new io.cucumber.java.PendingException();
	}
	@When("user click on add new admin")
	public void user_click_on_add_new_admin() {
		DashboardPage dash = new DashboardPage(driver);
		dash.clickOnAdminButton();
	    throw new io.cucumber.java.PendingException();
	}
	@When("input {string} ,{string},{string} , {string},{string},{string}")
	public void input(String userRole, String empName, String status, String userName, String password, String confirmPassword) {
		AdminPage admin = new AdminPage(driver);
		admin.clickOnAddButton();
		admin.addNewAdmin(empName, password, confirmPassword);
	    throw new io.cucumber.java.PendingException();
	}
	@When("user click on delete icon")
	public void user_click_on_delete_icon() {
		AdminPage admin = new AdminPage(driver);
		admin.deleteNewAdmin();
	    throw new io.cucumber.java.PendingException();
	}
	@Then("new added admin deleted successfully")
	public void new_added_admin_deleted_successfully() {
		AdminPage admin = new AdminPage(driver);
		admin.deleteNewAdmin();
	    throw new io.cucumber.java.PendingException();
	}

}
