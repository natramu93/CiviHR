package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
public WebDriver driver;
public WebDriverWait sync;
public WebElement element;
public By locator;
public LoginPage(WebDriver webdriver,WebDriverWait webdriverwait)
{
	super();
	this.driver=webdriver;
	this.sync=webdriverwait;
}
	public WebElement Header_Text(){
		locator = By.tagName("h1");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement UserName_Input(){
		locator = By.id("edit-name");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement Password_Input(){
		locator = By.id("edit-pass");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement Login_Btn(){
		locator = By.id("edit-submit");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
}
