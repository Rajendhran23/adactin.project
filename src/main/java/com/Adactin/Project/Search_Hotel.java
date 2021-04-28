package com.Adactin.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnos;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datepickin;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement datepickout;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement Submit;
	
	
	
	
	
}
