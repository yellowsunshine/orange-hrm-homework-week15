Feature: Users Test Functionality
  I want to check that the users test functionality works appropriately

  Background: User Should be on the homepage
    Given user enters "Admin" username in the username field
    And enters "admin123" password in the password field
    Then clicks on the login button

  @Smoke @Regression
  Scenario: Admin should be able to add user successfully
    When admin clicks on the Admin tab
    And verifies the system users text "System Users"
    And clicks on the add button
    And verifies the add user text "Add User"
    And selects the user role as "Admin"
    And enter Employee Name "Ananya Dash"
    And enters the username "AnanyaDash200"
    And selects Status as "Disabled"
    And enters the password "aabcdf1235435"
    And enters the confirmation password "aabcdf1235435"
    And clicks on the save button
    Then he verifies the message "Successfully Saved"

  @Sanity @Regression
  Scenario: Search the user created and verify it
    When admin clicks on the Admin tab
    And verifies the system users text "System Users"
    And enters the username in the search user field"AnanyaDash200"
    And selects the user role in the search user field as "Admin"
    And selects Status in the search user field as "Disabled"
    And clicks on the search button
    Then verifies the result list text "AnanyaDash200"

  @Sanity @Regression
  Scenario: verify that admin should delete the user successfully
    When admin clicks on the Admin tab
    And verifies the system users text "System Users"
    And enters the username in the search user field"AnanyaDash200"
    And selects the user role in the search user field as "Admin"
    And selects Status in the search user field as "Disabled"
    And clicks on the search button
    And verifies the result list text "AnanyaDash200"
    And clicks on the checkbox
    And clicks on the delete button
    And clicks on the OK button on popup
    Then verifies the message successfully deleted message "Successfully Deleted"

  @Regression
  Scenario: search the deleted user and verify the message no record found
    When admin clicks on the Admin tab
    And verifies the system users text "System Users"
    And enters the username in the search user field"AnanyaDash200"
    And selects the user role in the search user field as "Admin"
    And selects Status in the search user field as "Disabled"
    And clicks on the search button
    Then verifies the user deleted message "No Records Found"








