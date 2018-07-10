package com.android.tests;

import com.appium.manager.AppiumDriverManager;
import org.testng.annotations.Test;
import pages.WelcomePage;


/**
 * Created by arun on 06/07/2018.
 */
public class SearchTest {

    WelcomePage welcomePage;

    @Test
    public void performSearch(){
        welcomePage = new WelcomePage(AppiumDriverManager.getDriver());

        welcomePage.clickSearchBtn()
                .clickCategoryField()
                .selectCategory("To Rent")
                .clickSearchBtn();
    }
}
