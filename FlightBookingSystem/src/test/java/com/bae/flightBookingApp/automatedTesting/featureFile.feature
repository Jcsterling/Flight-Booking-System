Feature: Searching a passenger's flight details
As a user 
I want to search a user by name
So that I can see their flight information

   Scenario Outline: 
   Given I navigate to Flight Booking App
   When I fill out the email field with "<name>"
   Then I should see "<name>"
   
Examples:
    | website  | name |
    | file:///C:/Users/J%20Sterling/Desktop/startbootstrap-sb-admin-gh-pages/index.html | Tiger Nixon |
  