package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageBase {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath  = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	public WebElement adminButton;
	
	public void clickOnAdminButton()
	{
		clickButton(adminButton);
	}

}
