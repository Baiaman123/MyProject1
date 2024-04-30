package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Objects;

import static net.bytebuddy.asm.Advice.OffsetMapping.Sort.ENTER;

public class Practice {
//    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        PIMPage pimPage = new PIMPage();
        CommonPage commonPage = new CommonPage();
        WebDriver driver = Driver.getDriver();
@BeforeMethod
        public void before(){
    driver.get("https://opensource-demo.orangehrmlive.com/");
    loginPage.login("Admin","admin123");
        }
        @Test
    public void test1(){
            SeleniumUtils.click(driver,commonPage.dashboard);
            SeleniumUtils.click(driver, commonPage.pimTab);
            SeleniumUtils.click(driver, commonPage.leaveTab);
    }
}
