package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.DashboardPage;
import pages.HomePage;

public class AdminTest extends TestBase {
	HomePage home;
	DashboardPage dash;
	AdminPage admin;
	
	String myEmpName="Ryan  Anderson";
	String myUserName="Admin500";
	String myPassword = "admin123";
	
	@Test
	public void addMyAdmin() throws InterruptedException
	{
		home = new HomePage(driver);
		dash = new DashboardPage(driver);
		admin = new AdminPage(driver);
		dash.clickOnAdminButton();
		admin.getNumberOfRecords();
		admin.addNewAdmin(myEmpName, myUserName, myPassword);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		admin.searchUser(myUserName);
		admin.deleteNewAdmin();
		Assert.assertTrue(admin.userSearchText.isDisplayed());
	}

}
