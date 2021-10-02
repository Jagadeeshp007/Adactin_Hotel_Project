Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: Login Page

Given user Launch The Adactin Application
When user Enter The "<Username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click The Login Button To Navigate The Search Hotel Page

Examples:
	
	|Username|password|
	|Test1|pass1|
	|Test2|pass2|
	|jagadeesh007|Jaga@007|
	|vinilakumar|vinila@123|

@sanityTest
Scenario: Search Hotel Page

When user Select The Hotel "New York"
And user Select The "Hotel Sunshine"
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date 
And User Enter The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click The Search Button To Navigate The Select Hotel Page

@sanityTest
Scenario: Select Hotel Page

When user Click To Select The Hotel
Then user Click The Continue Button To Navigate The BooK Hotel

@sanityTest
Scenario: Book Hotel Page

When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Address In Address Field
And user Enter The Credit Card No IN Credit Card Field
And user Select The Card Type
And user Select The Expiry Month
And user Select The Expiry Year
And user Enter The Cvv Number In Cvv Field
Then user Click The Book Now Button To Navigate The Booking Confirm Page

@sanityTest
Scenario: Booking Confirm Page

Then user Click The My Itinerary Button To Navigate Booked Itinerary Page

@regressionTest
Scenario: Booked Itinerary Page

Then user Click The Logout Button To Logout The Our Account