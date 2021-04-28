package com.Adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin.Project.Base_Class;
import com.Adactin.Project.Book_Hotel;
import com.Adactin.Project.Booked_Itinerary;
import com.Adactin.Project.Booking_Confirmation;
import com.Adactin.Project.Login_Adactin;
import com.Adactin.Project.Search_Hotel;
import com.Adactin.Project.Select_Hotel;
import com.Adactin.Runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	public static Login_Adactin  login = new Login_Adactin(driver);
	public static Search_Hotel search = new Search_Hotel(driver);
	public static Select_Hotel select = new Select_Hotel(driver);
	public static Book_Hotel book = new Book_Hotel(driver);
	public static Booking_Confirmation booking = new Booking_Confirmation(driver);
	
			
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		ValueOnElement(login.getUsername(), "Rajeshselenium");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		ValueOnElement(login.getPassword(),"good2selenium");
	}

	@Then("^user Click On The Login Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(login.login_btn);
	}
	@When("^user Select The Location Of The Hotel$")
	public void user_Select_The_Location_Of_The_Hotel() throws Throwable {
		dropdownSelect(search.getLocation(), "Melbourne", "byvisibletext");
}

	@When("^user Need To Select The Hotel Name$")
	public void user_Need_To_Select_The_Hotel_Name() throws Throwable {
		dropdownSelect(search.getHotels(), "Hotel Sunshine", "byvisibletext");
	}

	@When("^user Need To Select The Room Type$")
	public void user_Need_To_Select_The_Room_Type() throws Throwable {
		dropdownSelect(search.getRoomtype(), "Standard", "byvisibletext");
		
	}

	@When("^user Need To Select The Number Of Rooms$")
	public void user_Need_To_Select_The_Number_Of_Rooms() throws Throwable {
		dropdownSelect(search.getRoomnos(), "1", "byvalue");
	}

	@When("^user Need To Select The Check In Date Of Hotel$")
	public void user_Need_To_Select_The_Check_In_Date_Of_Hotel() throws Throwable {
		ValueOnElement(search.getDatepickin(), "28/04/2021");
	}

	@When("^user Need To Select The Check Out Date Of Hotel$")
	public void user_Need_To_Select_The_Check_Out_Date_Of_Hotel() throws Throwable {
		ValueOnElement(search.getDatepickout(), "29/04/2021");
	}

	@When("^user Need To Select How Many Adults Per Room In Hotel$")
	public void user_Need_To_Select_How_Many_Adults_Per_Room_In_Hotel() throws Throwable {
		dropdownSelect(search.getAdultroom(), "2", "byvalue");
	}

	@When("^user Need To Select How Many Childrens Per Room In Hotel$")
	public void user_Need_To_Select_How_Many_Childrens_Per_Room_In_Hotel() throws Throwable {
		dropdownSelect(search.getChildroom(), "0","byindex");
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(search.getSubmit());
	}
	
	@When("^user Click The Selected Hotel$")
	public void user_Click_The_Selected_Hotel() throws Throwable {
		clickOnElement(select.getSelectbtn());
		
	}

	@Then("^user Click On The Continue Button And It  Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(select.getContinuebtn());
}
	@When("^user Need To Enter The First Name$")
	public void user_Need_To_Enter_The_First_Name() throws Throwable {
		ValueOnElement(book.getFname(), "Rajendhran");
		
	}

	@When("^user Need To Enter The Last Name$")
	public void user_Need_To_Enter_The_Last_Name() throws Throwable {
		ValueOnElement(book.getLname(),"A");
	}

	@When("^user Need To Enter The Billing Address$")
	public void user_Need_To_Enter_The_Billing_Address() throws Throwable {
		ValueOnElement(book.getAddrs(), "alwarthirunagar");
	}

	@When("^user Need To Enter Credit Card No$")
	public void user_Need_To_Enter_Credit_Card_No() throws Throwable {
		ValueOnElement(book.getCcno(), "9876543212345678");
	}

	@When("^user Need To Select The Credit Card Type$")
	public void user_Need_To_Select_The_Credit_Card_Type() throws Throwable {
		dropdownSelect(book.getCctype(), "VISA", "byvisibletext");
	}

	@When("^user Need To Select The Expiry Month$")
	public void user_Need_To_Select_The_Expiry_Month() throws Throwable {
		dropdownSelect(book.getCcExpMon(), "3", "byvalue");
	}

	@When("^user Need To Select The Expiry Year$")
	public void user_Need_To_Select_The_Expiry_Year() throws Throwable {
		dropdownSelect(book.getCcExpYear(), "2022", "byvalue");
	}

	@When("^user Need To Enter The Cvv Number$")
	public void user_Need_To_Enter_The_Cvv_Number() throws Throwable {
		ValueOnElement(book.getCVVNo(), "255");
	}

	@Then("^user Click On The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(book.getBooknow());
	}
	@Then("^user Click On The Logout Button And It Navigates To Home Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_Home_Page() throws Throwable {
		clickOnElement(booking.getLogout());
	}
}	
	

