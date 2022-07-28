package PageObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import qaUtil.TestBase;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ToolsQAValidateTextBox extends TestBase {

    WebDriver driver;


        By FullName = By.id("userName");

    By Email = By.id("userEmail");

    By CurrentAddress = By.id("currentAddress");

    By Submit = By.id("submit");

    By fullNameLabel = By.id("userName-label");




        //Constructor to access Webdriver and pass driver as a parameter. parameter driver comes from step definition when object of this '
    // class is created.
    public ToolsQAValidateTextBox(WebDriver driver){
        this.driver = driver;
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public WebElement enterFullName(){
        return driver.findElement(FullName);


    }
    public void enterCurrentaddress(){
        driver.findElement(CurrentAddress).sendKeys("1234");

    }
    public void clicksubmit(){
      driver.findElement(Submit).click();
    }

    public void validateLabel(){

        driver.findElement(fullNameLabel);
        String ExpectedFullName = "Full Name";
        String ActualFullNAME = driver.findElement(fullNameLabel).getText();
        System.out.println(ActualFullNAME);
        Assert.assertEquals(ActualFullNAME,ExpectedFullName);

    }


}
