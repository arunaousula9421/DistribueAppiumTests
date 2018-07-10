package pages;


import CommonUtils.CommonAppiumTest;
import io.appium.java_client.MobileElement;
import pageobjects.SearchPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by arun on 06/07/2018.
 */
public class SearchPage extends CommonAppiumTest{


    SearchPageObjects searchPageObjects = new SearchPageObjects();

    public SearchPage(AppiumDriver<MobileElement> driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), searchPageObjects);
    }


    public void clickSearchBtn(){
        searchPageObjects.searchBtn.click();
    }

    public SearchPage clickCategoryField(){
        searchPageObjects.category.click();
        return this;
    }

    public SearchPage selectCategory(String category){

        String xpath = "//android.widget.TextView[@text = '"+ category +"']";
        waitForElementToAppear(xpath);
        driver.findElement(By.xpath(xpath)).click();
        return this;
    }

}
