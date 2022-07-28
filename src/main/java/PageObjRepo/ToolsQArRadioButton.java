package PageObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qaUtil.TestBase;

public class ToolsQArRadioButton extends TestBase {
//Constructor
    WebDriver driver;
    public ToolsQArRadioButton(WebDriver driver) {
        this.driver = driver;
    }



//Locators
    By RadioButton = By.xpath("//div[@class='element-list collapse show']/ul/li[3]");
    By moveto = By.xpath("//div[@class ='col-12 mt-4 col-md-6']/div[2]/div[@class='mb-3']");
    By pretext = By.xpath("//div[@class='mb-3' and text() = 'Do you like the site?']");
    By YesRadio = By.xpath("//*[@id='yesRadio']");

            //By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/input[@class ='custom-control-input']");
    By ImpressiveRadio = By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[2]/div[3]/input");
    By No = By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[2]/div[4]/input");
    By aftertext = By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[2]/p");

    public void clickonRadiobutton(){

        driver.findElement(RadioButton).click();
        Actions moveto1 = new Actions(driver);
        moveto1.moveToElement(driver.findElement(moveto));


    }

    public void validateBeforetext(){
        driver.findElement(pretext).getText();
    }

    public void validateButtonEnabled(){
        System.out.println(driver.findElement(YesRadio).isEnabled());
        System.out.println(driver.findElement(ImpressiveRadio).isEnabled());
    }

    public void validateNoisdisabled(){
        System.out.println(driver.findElement(No).getText());
    }

    public void userselectyes(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(YesRadio));

        driver.findElement(YesRadio).click();
    }

    public String afterText(){

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(aftertext));


       String AfterText = driver.findElement(aftertext).getText();
        return AfterText;
    }
}
