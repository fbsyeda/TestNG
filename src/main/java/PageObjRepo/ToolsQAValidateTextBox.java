package PageObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qaUtil.TestBase;

public class ToolsQAValidateTextBox extends TestBase {

    By Element = By.id("//div[@class='header-text' and text()='Elements']");
    WebElement element;
    By Textbox = By.xpath("//div[@class ='element-list collapse show']/ul/li[1]");
    WebElement textbox;
        By FullName = By.id("userName");
        WebElement fullname;
    By Email = By.id("userEmail");
    WebElement email;
    By CurrentAddress = By.id("currentAddress");
    WebElement currentaddress;
    By Submit = By.id("submit");
    WebElement submit;

    public void TextBox(){

        element.click();
        textbox.click();
    }
    public void enterFullName(){
        fullname.sendKeys("Fatima");

    }
    public void enterCurrentaddress(){
        currentaddress.sendKeys("1234");
    }
    public void clicksubmit(){
        submit.click();
    }
}
