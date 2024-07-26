package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.HomePage;

public class HomeTest extends TestBase {
	HomePage home;
	DashboardPage dash;
	String myUserName="Admin";
	String myPassword="admin123";
	
	@Test
	public void loginToMyAdmin()
	{
		home = new HomePage(driver);
		dash = new DashboardPage(driver);
		home.login(myUserName, myPassword);
		Assert.assertTrue(dash.adminButton.isDisplayed());
	}

}
