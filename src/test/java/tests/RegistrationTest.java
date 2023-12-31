package tests;

import Pages.IntroPage;
import Pages.MenuPage;
import Pages.RegistrationPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{

    IntroPage ip;
    MenuPage mp;
    RegistrationPage rp;

    @DataProvider(name = "TestData")
    public static Object[][] dataSet()
    {
        Object[][] data = new Object[][]
                {
        {"Mohamed Amr","rgrgrg","Amr@foodics.com","Foodics77"},
        {"Ahmed Tarek","987654321","Mohamed@foodics.com","FoDiCs78"}
                 };
        return data;
    }

    @Test(dataProvider = "TestData", groups = {"Regression"})
    public void userRegister(String fullName, String phoneNumber, String emailAddress, String pass) {

        ip = new IntroPage(driver);
        mp = new MenuPage(driver);
        rp = new RegistrationPage(driver);

        ip.clickProceedBtns();
        mp.DDLAccountSettings();
        mp.clickRegister();
        rp.userRegistration(fullName, phoneNumber, emailAddress, pass);

    }
}
