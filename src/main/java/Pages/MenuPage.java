package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    /****************************************************GLOBAL_VARIABLES*****************************************************/
    AppiumDriver driver;

    /****************************************************CONSTRUCTORS*****************************************************/
    public MenuPage(AppiumDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /****************************************************MOBILE-ELEMENTS*****************************************************/

    @FindBy(id = "com.foodicsjordan.android:id/menu")
    WebElement ddlAccountSet;

    @FindBy(id = "com.foodicsjordan.android:id/register")
    WebElement registerBtn;


    /****************************************************METHODS*****************************************************/

    public void DDLAccountSettings()
    {
//        driver.findElement(AppiumBy.id("com.foodicsjordan.android:id/menu")).click();
        ddlAccountSet.click();
    }

    public void clickRegister()
    {
//        driver.findElement(AppiumBy.id("com.foodicsjordan.android:id/register")).click();
        registerBtn.click();
    }
}
