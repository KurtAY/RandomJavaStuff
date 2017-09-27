package thePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionPage {

	@FindBy(css = "body > div > center > table > tbody > tr:nth-child(2) "
			+ "> td > div > center > table > tbody > tr > td:nth-child(2) "
			+ "> p > small > a:nth-child(6)")
	WebElement addUserLink;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div "
			+ "> center > table > tbody > tr > td:nth-child(1) > div > center "
			+ "> table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	WebElement addUserUN;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div "
			+ "> center > table > tbody > tr > td:nth-child(1) > div > center "
			+ "> table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	WebElement addUserPW;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div "
			+ "> center > table > tbody > tr > td:nth-child(1) > div > center"
			+ " > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
	WebElement saveButton;
	
	@FindBy(css = "body > div > center > table > tbody > tr:nth-child(2) > td "
			+ "> div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")
	WebElement toLogin;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center"
			+ " > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1)"
			+ " > td:nth-child(2) > p > input")
	WebElement loginUN;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center"
			+ " > table > tbody > tr > td:nth-child(1) > table > tbody "
			+ "> tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	WebElement loginPW;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center"
			+ " > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) "
			+ "> td:nth-child(2) > p > input[type=\"button\"]")
	WebElement loginButton;
	
	public void clickAddUserLink() {
		addUserLink.click();
	}
	
	public void typeUserUN(String userName) {
		addUserUN.click();
		addUserUN.sendKeys(userName);; // in the test page remember to sendkeys to this method of the username variable
	}
	
	public void addUserPW(String passWord) {
		addUserPW.click();
		addUserPW.sendKeys(passWord);// same as above method. Sendkeys of variable password
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void clickToLogin() {
		toLogin.click();
	}
	
	public void typeLoginUN(String userName) {
		loginUN.sendKeys(userName);
	}
	
	public void typeLoginPW(String passWord) {
		loginPW.sendKeys(passWord);
	}
	
	public void clickLoginBtn() {
		loginButton.click();
	}
}