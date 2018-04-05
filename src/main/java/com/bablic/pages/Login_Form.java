package com.bablic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;

import com.bablic.base.Locators;
import com.bablic.base.Page;
import com.bablic.pages.Dashboard.AddNewSite;
import com.bablic.utility.CommonUtilities;
import com.gargoylesoftware.htmlunit.javascript.host.css.CSS;

public class Login_Form extends Page{
	
	public Locators cssLocators;
	
	
	
	public Login_Form(){
		
		this.cssLocators=new Locators();
		PageFactory.initElements(driver, this.cssLocators);
		
		
		
		
		
	}
	
	
	

	
	public void enter_credentials(String Email, String Password) throws InterruptedException {
		
	

		Thread.sleep(20L);
		
		cssLocators.clicking_Login.click();
		cssLocators.entering_email.sendKeys(Email);
		cssLocators.entering_password.sendKeys(Password);
		cssLocators.submit.click();
		
	

	/*driver.findElement(
				//By.cssSelector(OR.getProperty("click_login")))
				//.click();

		driver.findElement(
				By.cssSelector(OR.getProperty("email")))
				.sendKeys(Email);
		driver.findElement(By.cssSelector(OR.getProperty("password")))
				.sendKeys(Password);
		driver.findElement(By.cssSelector(OR.getProperty("login_submit")))
				.click();
		
		Thread.sleep(30L);
		
		return new AddNewSite();

	*/
	}
}
