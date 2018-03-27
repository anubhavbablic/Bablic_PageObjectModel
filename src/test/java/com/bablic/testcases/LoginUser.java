package com.bablic.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.bablic.base.Page;
import com.bablic.pages.Login_Form;
import com.bablic.pages.Dashboard.AddNewSite;
import com.bablic.utility.CommonUtilities;

@Guice
public class LoginUser extends Page{
	
	
	@Test(dataProviderClass= CommonUtilities.class,dataProvider="dp")
	
	public void loginuser(Hashtable<String, String> data) throws InterruptedException{
		
		if(!CommonUtilities.isTestRunnable("loginuser", excel)){
			throw new SkipException("Run Mode set to NO");
			}
				
			
		
		Login_Form lf=new Login_Form();
		AddNewSite add=lf.enter_credentials(data.get("Email"),data.get("Password"));
		
		
	}

}
