package com.bablic.pages;

import org.openqa.selenium.By;
import org.testng.SkipException;

import com.bablic.base.Page;
import com.bablic.pages.Dashboard.AddNewSite;
import com.bablic.utility.CommonUtilities;

public class Login_Form extends Page{
	
	
	

	
	public AddNewSite enter_credentials(String Email, String Password) throws InterruptedException {
		
	if(!CommonUtilities.isTestRunnable("enter_credentials", excel)){{
			
			throw new SkipException("Run Mode set to NO for TestCase Name : enter_credentials");
		}
			
		

		Thread.sleep(20L);

		driver.findElement(
				By.cssSelector(OR.getProperty("click_login")))
				.click();

		driver.findElement(
				By.cssSelector(OR.getProperty("email")))
				.sendKeys(Email);
		driver.findElement(By.cssSelector(OR.getProperty("password")))
				.sendKeys(Password);
		driver.findElement(By.cssSelector(OR.getProperty("login_submit")))
				.click();
		
		Thread.sleep(30L);
		
		return new AddNewSite();

	}

}
