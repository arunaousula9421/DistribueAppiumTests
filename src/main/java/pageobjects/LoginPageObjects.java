package pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by arun on 06/07/2018.
 */
public class LoginPageObjects {

    @AndroidFindBy(id = "com.daft.ie:id/login_username")
    public MobileElement userName;

    @AndroidFindBy(id = "com.daft.ie:id/login_password")
    public MobileElement passWord;

    @AndroidFindBy(id = "com.daft.ie:id/login_button")
    public MobileElement signIn;


}
