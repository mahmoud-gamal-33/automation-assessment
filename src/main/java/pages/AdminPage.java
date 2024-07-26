package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends PageBase {

	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//div[@role='table']")
	WebElement recordsTable;
	
	@FindBy (xpath = "//div[@role='row']")
	List<WebElement> tableRows;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addButton;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement userRoleDropDownList;
	
	@FindBy (xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	WebElement empNameText;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement statusDropDownList;
	
	@FindBy (css = "input.oxd-input.oxd-input--active.oxd-input--error")
	WebElement userNameText;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement passwordText;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement confirmPasswordText;
	
	@FindBy (css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement saveButton;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement userSearchText;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchButton;
	
	@FindBy (css = "i.oxd-icon.bi-trash")
	WebElement deleteIcon;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement confirmDeleteButton;
	
	
	public void getNumberOfRecords()
	{
		int noOfRecords= tableRows.size()-1; 
		System.out.println("the number of records found"+ noOfRecords);
	}
	
	public void clickOnAddButton()
	{
		clickButton(addButton);
	}
	
	public void addNewAdmin(String empName, String UN, String pass)
	{
		select = new Select(userRoleDropDownList);
		select.selectByIndex(0);
		sendText(empNameText, empName);
		select = new Select(userRoleDropDownList);
		select.selectByIndex(0);
		sendText(userNameText, UN);
		sendText(passwordText, pass);
		sendText(confirmPasswordText, pass);
		clickButton(saveButton);
		int noOfRecords= tableRows.size()-1; 
		System.out.println("the number of records found"+ noOfRecords);
		System.out.println(" that the number of records increased by 1");
	}
	
	public void searchUser(String userNm)
	{
		sendText(userSearchText, userNm);
		clickButton(searchButton);
	}
	
	public void deleteNewAdmin()
	{
		clickButton(deleteIcon);
		clickButton(confirmDeleteButton);
		int noOfRecords= tableRows.size()-1; 
		System.out.println("the number of records found"+ noOfRecords);
		System.out.println(" that the number of records decreased by 1");
	}

}
