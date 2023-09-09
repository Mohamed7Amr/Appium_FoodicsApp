package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IntroPage {

    /****************************************************GLOBAL_VARIABLES*****************************************************/
    AppiumDriver driver;

    /****************************************************CONSTRUCTORS*****************************************************/
    public IntroPage(AppiumDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /****************************************************MOBILE-ELEMENTS*****************************************************/

    @FindBy(xpath = "//android.widget.Button[@resource-id='com.foodicsjordan.android:id/proceed']")
    WebElement proceedBtn;

    @FindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    WebElement continueBtn1;

    @FindBy(id = "com.foodicsjordan.android:id/proceed")
    WebElement continueBtn2;



    /****************************************************METHODS*****************************************************/

    public void clickProceedBtns()
    {
//            driver.findElement(AppiumBy.id("com.foodicsjordan.android:id/proceed")).click();
//        driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.foodicsjordan.android:id/proceed']")).click();
//        driver.findElement(AppiumBy.id("com.foodicsjordan.android:id/proceed")).click();
        proceedBtn.click();
        continueBtn1.click();
        continueBtn2.click();


        String expectedResult = "MENU";
        String actualResult = driver.findElement(AppiumBy.id("com.foodicsjordan.android:id/title")).getText();
        Assert.assertEquals(actualResult,expectedResult,"Menu page assertion");

    }

}
