Feature: Login Functionality
  User should be able to login successfully

  Background: User Should be on the homepage
    Given user enters "Admin" username in the username field
    And enters "admin123" password in the password field
    Then clicks on the login button

  @Smoke @Regression
  Scenario: verify that user should login successfully
    When user will verify the welcome message "Welcome Paul"

  @Sanity @Regression
  Scenario: verify that the logo is displayed on the HomePage correctly
    When I will verify the Logo is displayed correctly

  @Regression
    Scenario: verify that user should be able to log out successfully
      When I click on the user profile logo
      And I hover on Logout and click
      Then I verify that the login panel is displayed "LOGIN Panel"
