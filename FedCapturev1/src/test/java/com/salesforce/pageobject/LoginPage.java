package com.salesforce.pageobject;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	 WebDriver driver;
	 
	 //This is new commit from Prajwal
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//*[@type='email']") WebElement uname;
	@FindBy(xpath="//*[@type='password']") WebElement pass;
	@FindBy(name="Login") WebElement loginButton;
	
	public void loginToSalesforce(String applicationUsername, String applicationPassword)  
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
					
		}
		uname.sendKeys(applicationUsername);
		pass.sendKeys(applicationPassword);
		loginButton.click();	
	}
	}
	
	
	

