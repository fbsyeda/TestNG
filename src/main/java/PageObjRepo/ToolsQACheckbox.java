package PageObjRepo;

import Stepdefinition.ToolsQACheckboxstepdef;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qaUtil.TestBase;



public class ToolsQACheckbox extends TestBase {

    WebDriver driver;

    By Checkbox = (By.xpath("//div[@class='element-list collapse show']/ul/li[2]"));

    By homechckbox = (By.xpath("//div[@class ='col-12 mt-4 col-md-6']/div[2]/div/ol/li/span/label/span"));

    public ToolsQACheckbox(WebDriver driver) {
        this.driver = driver;


    }

    public void selectcheckbox(){
        driver.findElement(Checkbox).getText();
        driver.findElement(Checkbox).click();
        WebElement UserForm = driver.findElement(By.xpath("//div[@class ='col-12 mt-4 col-md-6']/div[2]/div/ol/li/span/label"));
        Actions userform = new Actions(driver);
        userform.moveToElement(UserForm);


    }

    public void selecthomecheckbox(){
        driver.findElement(homechckbox).click();
    }

}
