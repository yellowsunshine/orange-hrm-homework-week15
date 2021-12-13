package com.orangelive.demo.pages;

import com.orangelive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement orangeHRMLogo;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Admin']")
    WebElement admin;

    @CacheLookup
    @FindBy()
    WebElement pIM;

    @CacheLookup
    @FindBy()
    WebElement leave;

    @CacheLookup
    @FindBy()
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOut;

    public void verifyTheWelcomeMessage(String expected) {
        String s1 = expected;
        String expectedMessage = s1.substring(0, 6);
        String s2 = pmGetTextFromElement(welcomeText);
        String actualMessage = s2.substring(0, 6);
        doVerifyElementsJU("Welcome Message is displayed incorrectly",expectedMessage, actualMessage);
        log.info("verifying the welcome message : " + welcomeText.toString());

    }

    public void verifyTheOrangeHRMLogo(){
        boolean logoPresent = orangeHRMLogo.isDisplayed();
        Assert.assertTrue(logoPresent);
        log.info("verifying the logo : " + orangeHRMLogo.toString());
    }

    public void clickOnTheUserProfileLogo(){
        pmClickOnElement(welcomeText);
        log.info("Clicking on the user profile logo : " + welcomeText.toString());

    }

    public void mouseHoverOnLogoutAndClick(){
        pmWaitUntilVisibilityOfElementLocated(By.xpath("//a[normalize-space()='Logout']"), 50);
        pmMouseHoverAndClick(logOut);
        log.info("click on logout: " + logOut.toString());

    }

    public void clickOnAdminTabFromHomePage(){
        pmClickOnElement(admin);
        log.info("click on admin tab : " + admin.toString());
    }
}
