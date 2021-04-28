Feature: Hotel Booking In Adactin Application

Scenario: 

Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigates To The Select Hotel Page

Scenario:

When user Select The Location Of The Hotel
And user Need To Select The Hotel Name
And user Need To Select The Room Type
And user Need To Select The Number Of Rooms
And user Need To Select The Check In Date Of Hotel
And user Need To Select The Check Out Date Of Hotel
And user Need To Select How Many Adults Per Room In Hotel
And user Need To Select How Many Childrens Per Room In Hotel
Then user Click On The Search Button And It Navigates To The Select Hotel Page


Scenario:

When user Click The Selected Hotel
Then user Click On The Continue Button And It  Navigates To Book A Hotel Page


Scenario:

When user Need To Enter The First Name
And user Need To Enter The Last Name
And user Need To Enter The Billing Address
And user Need To Enter Credit Card No
And user Need To Select The Credit Card Type
And user Need To Select The Expiry Month 
And user Need To Select The Expiry Year
And user Need To Enter The Cvv Number
Then user Click On The Book Now Button And It Navigates To Booking Confirmation Page

Scenario:

Then user Click On The Logout Button And It Navigates To Home Page
