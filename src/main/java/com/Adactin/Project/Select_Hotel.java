package com.Adactin.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
public WebDriver driver;
	


	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement selectbtn;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	@FindBy(id = "continue")
	private WebElement continuebtn;


	}

	
	

