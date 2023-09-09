package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegistrationPage {

    /****************************************************GLOBAL_VARIABLES*****************************************************/
    AppiumDriver driver;
    static SoftAssert sa = new SoftAssert();

    /****************************************************CONSTRUCTORS*****************************************************/
    public RegistrationPage(AppiumDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /****************************************************MOBILE-ELEMENTS*****************************************************/

    @FindBy(id = "com.foodicsjordan.android:id/first_name")
    static WebElement fullNameTxt;

    @FindBy(id = "com.foodicsjordan.android:id/phone_number")
    static WebElement phoneNumberTxt;

    @FindBy(id = "com.foodicsjordan.android:id/username")
    static WebElement emailAddressTxt;

    @FindBy(id = "com.foodicsjordan.android:id/password")
    static WebElement passwordTxt;


    /****************************************************METHODS*****************************************************/

    static public void writeFullName(String fullName)
    {
        fullNameTxt.sendKeys(fullName);
    }
    static public void writePhoneNumber(String phoneNumber)
    {
        phoneNumberTxt.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        phoneNumberTxt.sendKeys(phoneNumber);
        if(phoneNumber.matches(".*[a-zA-Z]+.*"))
        {
            String expectedResult = "";
            String actualResult = phoneNumberTxt.getText();
            System.out.println(phoneNumberTxt.getText());
            Assert.assertEquals(actualResult,expectedResult,"phone number text box takes text Assertion");
        }
        else {}

    }
    static public void writeEmailAddress(String emailAddress)
    {
        emailAddressTxt.sendKeys(emailAddress);
    }
    static public void writePassword(String password)
    {
        passwordTxt.sendKeys(password);
    }

    public void userRegistration(String fullName, String phoneNumber, String emailAddress, String password)
    {
        writeFullName(fullName);
        writePhoneNumber(phoneNumber);
        writeEmailAddress(emailAddress);
        writePassword(password);
    }
}
