package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pageObject.LoginPage;
import utility.Data;

public class LoginPageModule {
public WebDriver driver;
public WebDriverWait sync;
public LoginPage LP;
public LoginPageModule(WebDriver webdriver,WebDriverWait webdriverwait)
{
	super();
	this.driver = webdriver;
	this.sync = webdriverwait;
	LP = new LoginPage(driver,sync);
}
	public void Verify_Page(){
	String expected = "CiviHR DEMO";
		try
		{
			String actual = LP.Header_Text().getText();
			Assert.assertEquals(expected, actual);
			Reporter.log("Page load successful");
		}
		catch(Exception e)
		{
			Assert.fail("Login Page Load Error");
		}
	}
	public void Login(){
		try
		{
			LP.UserName_Input().clear();
			LP.UserName_Input().sendKeys(Data.Username);
			LP.Password_Input().clear();
			LP.Password_Input().sendKeys(Data.Password);
			LP.Login_Btn().click();
			String expected = "Dashboard | CiviHR 1.5 Demo";
			String actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Login Functionality");
		}
	}
}
