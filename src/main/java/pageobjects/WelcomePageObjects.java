package pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by arun on 06/07/2018.
 */
public class WelcomePageObjects {

    @AndroidFindBy(id="com.daft.ie:id/homeLoginButton")
    public MobileElement loginBtn;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Search']")
    public MobileElement searchBtn;

    @AndroidFindBy(id = "com.daft.ie:id/homeWelcomeTitle")
    public MobileElement welcomeHeader;

}
