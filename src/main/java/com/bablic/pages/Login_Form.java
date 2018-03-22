package com.bablic.pages;

import org.openqa.selenium.By;

import com.bablic.base.Page;
import com.bablic.pages.Dashboard.AddNewSite;

public class Login_Form extends Page{

	
	public AddNewSite enter_credentials(String Email, String Password) throws InterruptedException {

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
