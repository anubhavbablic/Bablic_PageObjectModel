package com.bablic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bablic.base.Page;

public class OnBoarding_Wizard extends Page {

	public void onBoarding_Wizard() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 50L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(OR.getProperty("select_language"))));

		WebElement languages = driver.findElement(By.cssSelector(OR.getProperty("select_language")));

		languages.click();

		String[] list = driver.findElement(By.cssSelector(OR.getProperty("language_box"))).getText().split("\n");

		System.out.println("Total number of languages in a list is: " + list.length);

		System.out.println("---------Selecting Language-----------");

		driver.findElement(By.cssSelector(OR.getProperty("select_language"))).click();

		WebDriverWait wait1 = new WebDriverWait(driver, 50L);
		wait1.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector(OR.getProperty("next"))));

		driver.findElement(By.cssSelector(OR.getProperty("next_button")))
				.click();

		Thread.sleep(20L);
		System.out.println("---------Selecting Widget Type-----------");
		driver.findElement(By.cssSelector(OR.getProperty("widget_type"))).click();

		Thread.sleep(5L);
		driver.findElement(By.cssSelector(OR.getProperty("next_button"))).click();

		System.out.println("---------Selecting Machine Translation-----------");
		driver.findElement(By.cssSelector(OR.getProperty("select_machine_translation"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("next_button"))).click();

		Thread.sleep(5L);
		driver.findElement(By.cssSelector(OR.getProperty("next_button"))).click();
		
		
	}

}
