package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
public WebDriver driver;
public WebDriverWait sync;
public WebElement element;
public By locator;	
public Form(WebDriver webdriver,WebDriverWait webdriverwait)
{
	super();
	this.driver=webdriver;
	this.sync=webdriverwait;
}
	public WebElement TargetContact_Input(){
		locator = By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[1]/div/div[1]/div/div/span");
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
		locator = By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[1]/div/div[1]/div/input[1]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		element.clear();
		return element;
	}
	public WebElement AddAssignee_Input(){
		locator = By.linkText("Add Assignee");
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
		locator = By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/div/span");
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
		locator = By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/input[1]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		element.clear();
		return element;
	}
	public WebElement EditAssignee_Input(){
		locator = By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/div/span");
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
		locator = By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/input[1]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		element.clear();
		return element;
	}
	public WebElement TargetContact_Select(){
		locator = By.xpath("//form[@name='documentForm']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[4]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement AddAssignee_Select(){
		locator = By.xpath("//form[@name='documentForm']/div[2]/div[1]/div[4]/div[2]/div[1]/ul[1]/li/div[3]/a");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		element = driver.findElement(locator);
		return element;
	}
	public Select Select_DocType(){
		locator = By.xpath("//form[@name='documentForm']/div[2]/div[1]/div[1]/div[1]/div[1]/select");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		Select sel = new Select(element);
		return sel;
	}
	public WebElement DueDate_Input(){
		locator = By.xpath("//form[@name='documentForm']/div[2]/div[1]/div[2]/div[1]/input");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement Save_Btn(){
		locator = By.xpath("//form[@name='documentForm']/div[3]/button[3]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
}
