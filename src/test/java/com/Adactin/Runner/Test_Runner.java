package com.Adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Project.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Adactin//feature",glue="com.Adactin.Stepdefinition")

public class Test_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
    driver=Base_Class.getbrowser("chrome");
	}
	/*
    @AfterClass
	public static void tearDown() {
    driver.close();
	}	
		*/
	}
	
	
	
	
	

