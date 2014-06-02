Feature: Sample Temple  //The Title
    As a User        //Narrative
    I want to login
    So that I can make a bet

Scenario: User logs in with Invalid Credentials
    // Setting up the system to a known state
    Given I am on the Login Page
    // Exercising an event
    When I type in username
    And password
    //Verifying an outcome
    Then I should see an error page

