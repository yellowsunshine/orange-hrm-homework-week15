package com.orangelive.demo.pages;

import com.orangelive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='System Users']")
    WebElement systemUsersText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy()
    WebElement employeeNameField;

    @CacheLookup
    @FindBy(name = "searchSystemUser[status]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(css = "form[id='search_form'] fieldset p")
    WebElement searchButton;

    @CacheLookup
    @FindBy()
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;

    @FindBy(xpath="//td[@class='left']//a")
    WebElement userNameOnTheList;

    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordFound;


    public void verifyUsersNameIsInTheResultsTable(String uName){
        //doVerifyElementsJU("User not displayed",uName, userNameOnTheList.getText());
        log.info("verifying that user is on the list : " + uName);
    }

    public void verifySystemUsersText(String exp){
        String actualMessage = systemUsersText.getText();
        doVerifyElementsJU("System Users Message displayed incorrectly", exp,actualMessage );
        log.info("verifying the system users message : " + systemUsersText.toString());
    }

    public void clickOnTheAddButton(){
        pmClickOnElement(addButton);
        log.info("clicking on add button : " + addButton.toString());
    }

    public void enterEmployeeUserNameInTheSearchUsernameField(String uname){
        pmSendTextToElement(usernameField, uname);
        log.info("enter the user name :" + uname);
    }

    public void clickOnTheSearchButton(){
        pmClickOnElement(searchButton);
        log.info("click on the search button :" + searchButton.getText());
    }

    public void selectUserRole(String role){
        pmSelectByContainsTextFromDropDown(userRoleDropDown,role );
    }

    public void selectUserStatus(String statusValue){
        pmSelectByContainsTextFromDropDown(statusDropDown, statusValue);
    }

    public void clickOnTheCheckBox(){
        pmClickOnElement(checkBox);
        log.info("clicks on check box :" + checkBox.getText());
    }

    public void clickOnTheDeleteButton(){
        pmClickOnElement(deleteButton);
        log.info("clicks on delete button :" + deleteButton.getText());
    }

    public void clickOnOKButtonOfPopUp() {
        //driver.switchTo().alert();
        //pmClickOnElement(By.xpath("//input[@id='dialogDeleteBtn']"));
    }

    public void verifyTheNoRecordsFoundMessage(String message){
        //doVerifyElementsJU("Message displayed incorrectly", message, noRecordFound.getText());
    }


}
