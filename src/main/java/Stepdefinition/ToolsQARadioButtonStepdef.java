package Stepdefinition;

import PageObjRepo.ToolsQArRadioButton;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import qaUtil.TestBase;

public class ToolsQARadioButtonStepdef extends TestBase {

   //Create object for Pageobject class

    ToolsQArRadioButton Radiobutton = new ToolsQArRadioButton(driver);

    @Then(": User click on Radio Button")
    public void user_click_on_radio_button() {
       Radiobutton.clickonRadiobutton();
    }
    @Then(": User validate text before selection")
    public void user_validate_text_before_selection() {
        Radiobutton.validateBeforetext();
    }
    @Then(": User validate Yes and Impression radio button enabled")
    public void user_validate_yes_and_impression_radio_button_enabled() {
        Radiobutton.validateButtonEnabled();
    }
    @Then(": User validate No is dissabled")
    public void user_validate_no_is_dissabled() {
       Radiobutton.validateNoisdisabled();
    }
    @Then(": User select Yes")
    public void user_select_yes() {
        Radiobutton.userselectyes();
    }
//    @Then(": User validate text after selection")
//    public void user_validate_text_after_selection() {
//
//        String ExpectedAfterText = "You have selected Yes";
//        Assert.assertEquals(Radiobutton.afterText(),ExpectedAfterText);

  //  }

}
