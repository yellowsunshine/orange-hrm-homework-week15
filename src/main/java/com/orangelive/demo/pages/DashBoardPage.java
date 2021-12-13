package com.orangelive.demo.pages;

import com.orangelive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashBoardPage.class.getName());

    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy()
    WebElement dashboardText;
}
