package com.android.tests;

import com.appium.manager.AppiumDriverManager;
import org.testng.annotations.Test;
import pages.WelcomePage;


/**
 * Created by arun on 06/07/2018.
 */
public class LoginTest {

    WelcomePage welcomePage;

    @Test
    public void validLoginTest(){
        welcomePage = new WelcomePage(AppiumDriverManager.getDriver());

        welcomePage.clickLoginBtn()
                .enterUserCredentials()
                .validateUser();
    }
}
