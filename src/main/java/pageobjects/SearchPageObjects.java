package pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by arun on 06/07/2018.
 */
public class SearchPageObjects {

    @AndroidFindBy(id = "com.daft.ie:id/create_search_submit")
    public MobileElement searchBtn;

    @AndroidFindBy(id = "com.daft.ie:id/create_search_category")
    public MobileElement category;

}
