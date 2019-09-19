package com.salesforce.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.salesforce.pageobject.LoginPage;
import com.salesforce.utilities.BrowserFactory;
import com.salesforce.utilities.ExcelDataProvider;
import com.salesforce.utilities.Helper;

public class TC_LoginTest_01 extends BaseClass 
{
	@Test
	public void loginApp() 
	{
		logger= report.createTest("Login to Salesforce");
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		logger.info("Initializing the Application");
		loginPage.loginToSalesforce(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		logger.pass("logged-in Successfully");
	}
	
	@Test
	public void loginApp1() 
	{
		logger= report.createTest("Logout to Salesforce");
		logger.fail("logged-out failed");
	}
	
	
}
