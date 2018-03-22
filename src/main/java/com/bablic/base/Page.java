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

public class Page {
	
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Data.xlsx");

	public Page()  {

		if (driver == null) {

			try {
				fis = new FileInputStream(
						"D:\\Selenium_WebDriver\\Page_Object_Model\\src\\test\\resources\\properties\\CONFIG.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try{
			fis = new FileInputStream(
					"D:\\Selenium_WebDriver\\Page_Object_Model\\src\\test\\resources\\properties\\OR.properties");
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
			try {
			OR.load(fis);
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// If driver is null, then create object of
			// chromedriver and stick to it.

			ChromeOptions options = new ChromeOptions();
			options.addArguments("windows-maximized");
			options.addArguments("disable-infobars");

			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium_WebDriver\\Page_Object_Model\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver(options);

			driver.manage().window().maximize();
			driver.get(Config.getProperty("testsiteurl"));

			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		}
	}	
			public static void quit_browser(){
				
				driver.quit();
			}
		
	}

