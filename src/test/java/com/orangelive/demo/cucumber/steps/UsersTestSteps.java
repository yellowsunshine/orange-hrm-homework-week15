package com.orangelive.demo.cucumber.steps;

import com.orangelive.demo.pages.AddUserPage;
import com.orangelive.demo.pages.AdminPage;
import com.orangelive.demo.pages.HomePage;
import com.orangelive.demo.pages.ViewSystemUsersPage;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersTestSteps {
    @When("^admin clicks on the Admin tab$")
    public void adminClicksOnTheAdminTab() {
        new HomePage().clickOnAdminTabFromHomePage();
    }

    @And("^verifies the system users text \"([^\"]*)\"$")
    public void verifiesTheSystemUsersText(String exp) {
        new ViewSystemUsersPage().verifySystemUsersText(exp);

    }

    @And("^clicks on the add button$")
    public void clicksOnTheAddButton() {
        new ViewSystemUsersPage().clickOnTheAddButton();
    }

    @And("^verifies the add user text \"([^\"]*)\"$")
    public void verifiesTheAddUserText(String expected) {
        new AddUserPage().verifyAddUsersText(expected);

    }

    @And("^selects the user role as \"([^\"]*)\"$")
    public void selectsTheUserRoleAs(String role) {
        new AddUserPage().selectUserRole(role);

    }

    @And("^enter Employee Name \"([^\"]*)\"$")
    public void enterEmployeeName(String name) {
        new AddUserPage().putEmployeeNameInTheEmployeeNameField(name);
    }

    @And("^enters the username \"([^\"]*)\"$")
    public void entersTheUsername(String uname) {
        new AddUserPage().putUserNameInTheUserNameField(uname);

    }

    @And("^selects Status as \"([^\"]*)\"$")
    public void selectsStatusAs(String status) {
       new AddUserPage().selectUserStatus(status);

    }

    @And("^enters the password \"([^\"]*)\"$")
    public void entersThePassword(String pw) {
        new AddUserPage().enterPasswordInThePasswordField(pw);


    }

    @And("^enters the confirmation password \"([^\"]*)\"$")
    public void entersTheConfirmationPassword(String cpw) {
        new AddUserPage().enterConfirmationPassword(cpw);

    }

    @And("^clicks on the save button$")
    public void clicksOnTheSaveButton() {
        new AddUserPage().clickOnTheSaveButton();
    }

    @Then("^he verifies the message \"([^\"]*)\"$")
    public void heVerifiesTheMessage(String emessage) {
        new AddUserPage().verifySuccessfullySavedText(emessage);

    }

    @And("^enters the username in the search user field\"([^\"]*)\"$")
    public void entersTheUsernameInTheSearchUserField(String uname) {
        new ViewSystemUsersPage().enterEmployeeUserNameInTheSearchUsernameField(uname);

    }

    @And("^clicks on the search button$")
    public void clicksOnTheSearchButton() {
        new ViewSystemUsersPage().clickOnTheSearchButton();
    }

    @Then("^verifies the result list text \"([^\"]*)\"$")
    public void verifiesTheResultListText(String text)  {
        new ViewSystemUsersPage().verifyUsersNameIsInTheResultsTable(text);

    }

    @And("^selects the user role in the search user field as \"([^\"]*)\"$")
    public void selectsTheUserRoleInTheSearchUserFieldAs(String role)  {
        new ViewSystemUsersPage().selectUserRole(role);


    }

    @And("^selects Status in the search user field as \"([^\"]*)\"$")
    public void selectsStatusInTheSearchUserFieldAs(String status)  {
        new ViewSystemUsersPage().selectUserStatus(status);

    }

    @And("^clicks on the checkbox$")
    public void clicksOnTheCheckbox() {
        new ViewSystemUsersPage().clickOnTheCheckBox();
    }

    @And("^clicks on the delete button$")
    public void clicksOnTheDeleteButton() {
        new ViewSystemUsersPage().clickOnTheDeleteButton();
    }

    @And("^clicks on the OK button on popup$")
    public void clicksOnTheOKButtonOnPopup() throws InterruptedException {
        new ViewSystemUsersPage().clickOnOKButtonOfPopUp();
    }

    @Then("^verifies the message successfully deleted message \"([^\"]*)\"$")
    public void verifiesTheMessageSuccessfullyDeletedMessage(String arg0)  {

    }

    @Then("^verifies the user deleted message \"([^\"]*)\"$")
    public void verifiesTheUserDeletedMessage(String message) {
        new ViewSystemUsersPage().verifyTheNoRecordsFoundMessage(message);


    }
}
