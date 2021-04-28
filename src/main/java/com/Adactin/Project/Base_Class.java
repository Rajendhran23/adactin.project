package com.Adactin.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
public static WebDriver driver;


       //Browser Launch	

public static WebDriver getbrowser(String type) {
	if (type.equalsIgnoreCase("chrome")) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	} else if (type.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	
	}
	driver.manage().window().maximize();
	return driver;
				
		}
		
		//close
		public static void close() {
        driver.close();
		
		}
		
		//Quit
		
	     public static void quit() {
         driver.quit();
		}
		
		//Get
		
		public static void get(String value) {
        driver.get(value);
		}
		
		//Click
		
		public static void clickOnElement(WebElement element) {
               element.click();
		}
		
		//Sendkeys
		
		public static void ValueOnElement(WebElement element, String value) {
			element.sendKeys(value);
			
		}
		// GetUrl
		
	public static void getUrl(String url) {
    driver.get(url);
	}	
		//dropdown
	
	public static void dropdownSelect(WebElement element, String value, String type) {
		try {
			Select sc = new Select(element);
			if (type.equalsIgnoreCase("byvalue")) {
				sc.selectByValue(value);
			} else if (type.equalsIgnoreCase("byvisibletext")) {
				sc.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byindex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

