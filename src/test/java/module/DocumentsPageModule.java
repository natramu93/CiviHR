package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import pageObject.DocumentsPage;
import pageObject.Form;
import utility.Data;

public class DocumentsPageModule {
public WebDriver driver;
public WebDriverWait sync;
public DocumentsPage DP;
public Form F;
public DocumentsPageModule(WebDriver webdriver,WebDriverWait webdriverwait)
{	super();
	this.driver = webdriver;
	this.sync = webdriverwait;
	DP = new DocumentsPage(driver,sync);
	F = new Form(driver,sync);
}
	public void AddDocument()
	{
		try
		{
			DP.AddDocument_link().click();
			Reporter.log("Add Document Link Clicked");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with AddDocument link");
		}
		try
		{
			F.TargetContact_Input().sendKeys(Data.New_TargetContact);
			F.TargetContact_Select().click();
			Reporter.log("Target Contact Updated");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with target contact element");
		}
		try
		{
			F.Select_DocType().selectByVisibleText(Data.New_DocumentType);
			Reporter.log("Document type selected");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Selecting Document Type");
		}
		try
		{
			F.DueDate_Input().clear();
			F.DueDate_Input().sendKeys(Data.New_DueDate);
			Reporter.log("Due Date Updated");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Due Date Element");
		}
		try
		{
			F.AddAssignee_Input().sendKeys(Data.New_Assignee);
			F.AddAssignee_Select().click();
			Reporter.log("Assignee Added");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Add Assignee Link");
		}
		try
		{
			F.Save_Btn().click();
			Reporter.log("Form Saved");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Save Button");
		}
	}
	public void Verify_New_Document()
	{
		try
		{
			DP.New_Document_DueDate();
			Reporter.log("The new document is updated successfully");
		}
		catch(Exception e)
		{
			Assert.fail("The new Document is not updated");
		}
	}
	public void EditDocument()
	{
		try
		{
			DP.Edit_Menu().click();
			DP.Edit_Link().click();
			Reporter.log("Edit Document Link Clicked");
		}
		catch(Exception e)
		{
			Assert.fail("The edit menu is not available");
		}
		try
		{
			F.TargetContact_Input().sendKeys(Data.Edit_TargetContact);
			F.TargetContact_Select().click();
			Reporter.log("Target Contact Updated");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with target contact element");
		}
		try
		{
			F.Select_DocType().selectByVisibleText(Data.Edit_DocumentType);
			Reporter.log("Document type selected");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Selecting Document Type");
		}
		try
		{
			F.DueDate_Input().clear();
			F.DueDate_Input().sendKeys(Data.Edit_DueDate);
			Reporter.log("Due Date Updated");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Due Date Element");
		}
		try
		{
			F.EditAssignee_Input().sendKeys(Data.Edit_Assignee);
			F.AddAssignee_Select().click();
			Reporter.log("Assignee Added");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Add Assignee Link");
		}
		try
		{
			F.Save_Btn().click();
			Reporter.log("Form Updated");
		}
		catch(Exception e)
		{
			Assert.fail("Issue with Save Button");
		}
	}
	public void Verify_Edit_Document()
	{
		try
		{
			DP.Edit_Document_DueDate();
			Reporter.log("The new document is updated successfully");
		}
		catch(Exception e)
		{
			Assert.fail("The new Document is not updated");
		}
	}
}
