package com.Adactin.Project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fname;
	

	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcExpMon() {
		return ccExpMon;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCVVNo() {
		return CVVNo;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement addrs;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccno;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement ccExpMon;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
    private WebElement ccExpYear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement CVVNo;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement Booknow;
	
	
	
	
	
	
	
	
}
