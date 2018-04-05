package com.bablic.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bablic.utility.ExcelReader;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Page {
	
	
	public static WebDriver driver;
	//public static Properties OR = new Properties();
	//public static Properties Config = new Properties();
	//public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Data.xlsx");
	
	
	
	public static void initConfiguration(){
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("windows-maximised");
		
		
		
		WebDriver driver=new ChromeDriver(options); 
		
		driver.get(Constants.testsiteURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implicit, TimeUnit.SECONDS);
		
			
		
		
		
	
	}
			public static void quit_browser(){
				
				driver.quit();
			}
		
	}

