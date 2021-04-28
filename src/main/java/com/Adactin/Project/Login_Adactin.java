package com.Adactin.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Adactin {

public WebDriver driver;

@FindBy(id="username")
public WebElement username;

public Login_Adactin(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

@FindBy(id="password")
	public WebElement password;
@FindBy(id="login")
public WebElement login_btn;

public WebElement getLogin_btn() {
	return login_btn;
}

public void setLogin_btn(WebElement login_btn) {
	this.login_btn = login_btn;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

