package com.orangelive.demo.pages;

import com.orangelive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='successDataModal']//child::div[3]")
    WebElement successfullySavedText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;

    @CacheLookup
    @FindBy(name = "systemUser[status]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "(//form[@id='frmSystemUser'])[1]//child::p//child::input[1]")
    WebElement saveButton;

    @CacheLookup
    @FindBy()
    WebElement cancelButton;

    public void verifyAddUsersText(String exp){
        String actualMessage = addUserText.getText();
        doVerifyElementsJU("System Users Message displayed incorrectly", exp,actualMessage );
        log.info("verifying the add users message : " + addUserText.toString());
    }

    public void selectUserRole(String role){
        pmSelectByVisibleTextFromDropDown(userRoleDropDown,role);
        log.info("selecting user role : " + "Admin");

    }

    public void putEmployeeNameInTheEmployeeNameField(String employeename){
        pmSendTextToElement(employeeName, employeename);
        log.info("enter the employee name : " + employeename);
    }

    public void putUserNameInTheUserNameField(String uname){
        pmSendTextToElement(userName, uname);
        log.info("enter the employee username : " + uname);
    }

    public void selectUserStatus(String statusValue){
        pmSelectByVisibleTextFromDropDown(statusDropDown, statusValue);
        log.info("selecting user status : " + statusValue);
    }

    public void enterPasswordInThePasswordField(String passWord){
        pmSendTextToElement(password, passWord);
        log.info("Enter password" + password.toString());
    }
    public void enterConfirmationPassword(String confirmationPassWord){
        pmSendTextToElement(confirmPassword, confirmationPassWord);
        log.info("Enter confirmation password" + confirmPassword.toString());
    }

    public void clickOnTheSaveButton(){
        pmClickOnElement(saveButton);
        log.info("Click on the save Button : " + saveButton.toString());
    }

    public void verifySuccessfullySavedText(String text){
        String actualMessage = successfullySavedText.getText();
        doVerifyElementsJU("System Users Message displayed incorrectly", "",actualMessage );
        log.info("verifying the add users message : " + text);
    }
}
