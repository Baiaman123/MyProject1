package tests;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import Page.LoginPage;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void before(){
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage();
    }


    @Test
    public void testSuccessfulLogin(){
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void testUnsuccessfulLogin(){
        loginPage.login("Admin", "fwefe");
        Assert.assertTrue(loginPage.invalidLoginMessage.isDisplayed());
    }

}