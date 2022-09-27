Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: user Login In The Web Application
Given user Launch The Adactin Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Examples:
|Username|Password|
|karthid|12345|
|kartik3|12345678|
|karthik322|Q3M0P0|
@sanityTest
Scenario: user  Search The Hotel In Search Hotel Page 
When user Select The Location In Select Location Dropdown List
And user Select The Hotel In Select Hotels Dropdown List
And  user Select The Room Type In Select Room Type Dropdown List
And  user Select The Number of Rooms In Dropdown List
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field
And user Select The Adults Per Room In Dropdown List
And user Select The Children Per Room In Dropdown List
Then user Click The Search Hotel Button And It Navigates To Select Hotel Page

@sanityTest
Scenario: user Select The Hotel In Select The Hotel Page
When user Click The Radio Button To Select The Hotel
Then user Click The Continue Button And Navigates To Book A Hotel Page

@regressionest
Scenario: user  Book A Hotel In Book Hotel Page
When user Enter The First Name  In First Name Field
And   user Enter The Last Name  In Last Name Field
And user Enter The Billing Address In Address Field
And user Enter The Credit Card Number In The Number Field
And user Select The Credit Card Type In Dropdown List
And user Select The Expiry Date In Select Month And Select Year Dropdown List
And user Enter The Ccv Number In Ccv Number Field
Then user Click The Book Now Button And It Navigates To Booking Confirmation Page

@regressionTest
Scenario: user Get The Booking Confirmation		
When user Get The Booking Confirmation And Take The Screenshot 
Then user Click The Logout Button And It Navigates To Logout Page
