package com.bablic.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators extends Page {
	
	@FindBy(css=".section1.section.withVideo #header.header .account-header a.login:nth-child(2)")
	public WebElement clicking_Login;
	
	
	@FindBy(css="#signupPopup.active form .split_section .left .field label .input_field.sub_input[type='email']")
	public WebElement entering_email;
	
	
	@FindBy(css="#signupPopup.active form .split_section .left .field label .input_field.sub_input[type='password']")
	public WebElement entering_password;
	
	@FindBy(css="#signupPopup.active form .button_wrapper.signupButton .bablic_button.action_button[type='submit']")
	public WebElement submit;


}
