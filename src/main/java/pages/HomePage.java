package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath = "//input[@name='username']")
	WebElement usernameTextbox;
	
	@FindBy (xpath = "//input[@name='password']")
	WebElement passwordTextbox;
	
	@FindBy (css  = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
	WebElement loginButton;
	
	public void login (String username, String password)
	{
		sendText(usernameTextbox, username);
		sendText(passwordTextbox, password);
		clickButton(loginButton);
	}
	

}
