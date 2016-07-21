package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Data;

public class DocumentsPage {
public WebDriver driver;
public WebDriverWait sync;
public WebElement element;
public By locator;	
public DocumentsPage(WebDriver webdriver,WebDriverWait webdriverwait)
{
	super();
	this.driver=webdriver;
	this.sync=webdriverwait;
}
	public WebElement AddDocument_link(){
		locator = By.partialLinkText("Add Document");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement New_Document_DueDate(){
		locator = By.xpath("//td[contains(text(),'"+Data.New_DueDate+"')]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement Edit_Menu(){
		locator = By.xpath("//div[@class='dropdown']");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		List<WebElement> dropdown = driver.findElements(locator);
		element = dropdown.get(dropdown.size()-1);
		return element;
	}
	public WebElement Edit_Link(){
		locator = By.partialLinkText("Edit");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		sync.until(ExpectedConditions.elementToBeClickable(locator));
		element = driver.findElement(locator);
		return element;
	}
	public WebElement Edit_Document_DueDate(){
		locator = By.xpath("//td[contains(text(),'"+Data.Edit_DueDate+"')]");
		sync.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		return element;
	}
}
