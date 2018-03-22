package com.bablic.pages.Dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bablic.base.Page;
import com.bablic.pages.OnBoarding_Wizard;

public class AddNewSite extends Page {

	public OnBoarding_Wizard new_Site() {

		driver.findElement(By.cssSelector(OR.getProperty("add_new_site"))).sendKeys("lemonberry.com");

		driver.findElement(By.cssSelector(OR.getProperty("register"))).click();
		
		return new OnBoarding_Wizard();

	}

	
	public void click_VisualEditor() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30L);

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				".css5.select5.adminpanel-body #adminPanel>.left_menu>ul.topics>a:nth-child( 7 )>li>div:nth-child(2).topic")));

		driver.findElement(By.cssSelector(
				".css5.select5.adminpanel-body #adminPanel>.left_menu>ul.topics>a:nth-child( 7 )>li>div:nth-child(2).topic"))
				.click();

	}

	public void settings() {
	}

	public void pages() {

	}

	public void click_lang() {
		// TODO Auto-generated method stub

	}

}
