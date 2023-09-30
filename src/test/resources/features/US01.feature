Feature: Bing search functionality
  Agile story:As a user, when I am on the homepage
  I should be able to main page and after that "Sign Up" button is should be clickable and work
  @US01 @ui
  Scenario: Search result title verification
    Given user is on the homepage
    When user click to Sign Up button
    When user verify the register page returned
    When user entering the email address
    #coming from properties file
    When user click the Submit button
    And  user verify the subscription page returned
    Then user verify the "Become a Member" text is rendered
    #coming from as a string here

