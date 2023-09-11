package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestBase {
    AppiumDriverLocalService service;
    UiAutomator2Options options;
    AppiumDriver driver;

    @BeforeMethod(groups = {"Regression"})
    public void setUpEnvironment() throws MalformedURLException {

        /**
         * these commented desiredCapabilities are set using .setCapability method that exists in DesiredCapabilities class
         * and UiAutomator2Options class, but there are specific methods that exist only in the later class(UiAutomator2)
         * which can take the values of the capabilities directly without mentioning the name of each capability
         */

//        service = new AppiumServiceBuilder()
//                .withAppiumJS(new File("C:\\Users\\moham\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();//127.0.0.1   localhost
//        service.start();
        options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("11.0");
        options.setDeviceName("AmrEmulator");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.foodicsjordan.android");
        options.setAppActivity("com.skylinedynamics.splash.SplashActivity");
        driver = new AndroidDriver(new URL("http://localhost:4723"),options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod(groups = {"Regression"})
    public void clearUpEnvironment()
    {
        driver.quit();
    }
}
