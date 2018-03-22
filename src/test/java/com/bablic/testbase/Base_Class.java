package com.bablic.testbase;

import org.testng.annotations.AfterSuite;

import com.bablic.base.Page;

public class Base_Class {
	
	
	
	@AfterSuite
	
	public void tearDown(){
		
		Page.quit_browser();
		
		
		
		
		
		
	}
	}


