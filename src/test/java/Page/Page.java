package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.SeleniumUtils;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.parameters;

public abstract class Page {


    protected WebDriver driver;


    public Page(WebDriver driver){
        this.driver=driver;
    }

    public void navigateTo(String url){
        driver.get(url);
    }

    public void printURL() {
        System.out.println(Driver.getDriver());

    }
    public void printTittle(){
        System.out.println(Driver.getDriver());
    }

    public void logout() {
        WebElement profile = driver.findElement(By.xpath("// i [@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
        WebElement logout = driver.findElement(By.linkText("Logout"));

        SeleniumUtils.click(driver, profile);
        logout.click();
    }

    public abstract void search(String ... paramaters);
//    String employeeName = parameters[0];
//


}


