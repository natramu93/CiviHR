package execution;

import org.testng.annotations.Test;

import module.DocumentsPageModule;
import module.LoginPageModule;
import utility.Data;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TestSuite {
public static WebDriver driver;
public static WebDriverWait sync;
public static LoginPageModule LPM;
public static DocumentsPageModule DPM;
	@Test(priority = 1,enabled = true)
	public void New_Document() {
		DPM.AddDocument();
		DPM.Verify_New_Document();
	}
	@Test(priority = 2,enabled = true)
	public void Edit_Document(){
		DPM.EditDocument();
		DPM.Verify_Edit_Document();
	}
	@BeforeMethod
	public void beforeClass() {
	  try
	  {
		  driver = new FirefoxDriver();
		  Reporter.log("Working with Firefox");
	  }
	  catch(Exception e)
	  {
		  System.setProperty("phantomjs.binary.path", "phantomjs.exe");
		  driver = new PhantomJSDriver();
		  Reporter.log("Working with PhantomJS Headless Browser");
	  }
	  driver.get(Data.URL);
	  sync = new WebDriverWait(driver,30);
	  driver.manage().window().maximize();
	  LPM = new LoginPageModule(driver,sync);
	  LPM.Login();
	  driver.navigate().to(Data.Documents_URL);
	  DPM = new DocumentsPageModule(driver,sync);
	}

	@AfterMethod
	public void afterClass() {
		driver.quit();
	}

}
