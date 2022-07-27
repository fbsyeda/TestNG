package Stepdefinition;

import PageObjRepo.ToolsQAValidateTextBox;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import qaUtil.TestBase;

public class ToolsQAValidateTextboxstepdef extends TestBase {

    ToolsQAValidateTextBox txtbox = new ToolsQAValidateTextBox(driver);


    @Then(": User enter full name")
    public void user_enter_full_name() {
        txtbox.enterFullName().sendKeys("Fatima");
        txtbox.enterFullName().isEnabled();
        System.out.println(txtbox.enterFullName().getText());



    }
    @Then(": user enter current address")
    public void user_enter_current_address() {
        txtbox.enterCurrentaddress();
    }

    @Then(": User validate form label")
    public void user_validate_form_label() {
      txtbox.validateLabel();
    }
    @Then(": User click submit")
    public void user_click_submit() {
        txtbox.enterCurrentaddress();
    }

}
