package com.orangelive.demo.pages;

import com.orangelive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "txtUsername")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(id = "logInPanelHeading")
    WebElement loginPanel;

    public void enterTheUsernameInTheUsernameField(String username){
        pmSendTextToElement(userName, username );
    }

    public void enterThePasswordInThePasswordField(String passWord){
        pmSendTextToElement(password, passWord );
    }

    public void clickOnTheLoginButton(){
        pmClickOnElement(loginButton);
    }

    public void verifyTheLoginPanelText(String expectedMessage){
        doVerifyElementsJU("Login Panel Text is displayed incorrectly",expectedMessage,loginPanel.getText());

    }

}
