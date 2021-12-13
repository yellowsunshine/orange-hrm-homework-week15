package com.orangelive.demo.cucumber.steps;

import com.orangelive.demo.pages.HomePage;
import com.orangelive.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {
    @Given("^user enters \"([^\"]*)\" username in the username field$")
    public void userEntersUsernameInTheUsernameField(String username)  {
        new LoginPage().enterTheUsernameInTheUsernameField(username);

    }

    @And("^enters \"([^\"]*)\" password in the password field$")
    public void entersPasswordInThePasswordField(String password)  {
        new LoginPage().enterThePasswordInThePasswordField(password);

    }

    @Then("^clicks on the login button$")
    public void clicksOnTheLoginButton() {
        new LoginPage().clickOnTheLoginButton();
    }


    @When("^user will verify the welcome message \"([^\"]*)\"$")
    public void userWillVerifyTheWelcomeMessage(String expectedMessage)  {
        new HomePage().verifyTheWelcomeMessage(expectedMessage);
    }

    @When("^I will verify the Logo is displayed correctly$")
    public void iWillVerifyTheLogoIsDisplayedCorrectly() {
        new HomePage().verifyTheOrangeHRMLogo();
    }

    @When("^I click on the user profile logo$")
    public void iClickOnTheUserProfileLogo() {
        new HomePage().clickOnTheUserProfileLogo();
    }

    @And("^I hover on Logout and click$")
    public void iHoverOnLogoutAndClick() {
        new HomePage().mouseHoverOnLogoutAndClick();
    }


    @Then("^I verify that the login panel is displayed \"([^\"]*)\"$")
    public void iVerifyThatTheLoginPanelIsDisplayed(String expectedMessage)  {
        new LoginPage().verifyTheLoginPanelText(expectedMessage);

    }
}
