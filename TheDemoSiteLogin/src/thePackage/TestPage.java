package thePackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPage {

	String web = "http:\\TheDemoSite.co.uk";
	WebDriver webDriver;
	ActionPage actionPage;
	String userName = "user";
	String passWord = "pass";
	
	@Before
	public void before() {
		webDriver = new ChromeDriver();
		actionPage = PageFactory.initElements(webDriver, ActionPage.class);
	}
	
	@Test
	public void test() {
		webDriver.manage().window().maximize(); // full screen the ting
		webDriver.navigate().to(web); // actually get to desired page
		
		//Add user page
		actionPage.clickAddUserLink();
		waiter();
		actionPage.typeUserUN(userName);
		waiter();
		actionPage.addUserPW(passWord);
		waiter();
		actionPage.clickSaveButton();
		waiter();
		
		// login page
		actionPage.clickToLogin();
		waiter();
		actionPage.typeLoginUN(userName);
		waiter();
		actionPage.typeLoginPW(passWord);
		waiter();
		actionPage.clickLoginBtn();
		waiter();
		
		WebElement message = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > "
				+ "blockquote > font > center > b")); //store success message as a variable
		
		assertEquals("unsuccessful login", "**Successful Login**", message.getText());
	}
	
	@After
	public void after() {
		//tear down
		webDriver.quit();
	}
	
	//Method to wait
	public void waiter() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
