package Stepdefinition;

import PageObjRepo.ToolsQAValidateTextBox;
import io.cucumber.java.en.Then;
import qaUtil.TestBase;

public class ToolsQAValidateTextboxstepdef extends TestBase {
    ToolsQAValidateTextBox txtbox = new ToolsQAValidateTextBox();

    @Then(": User Navigate to Side panel click on Element and then textbox")
    public void user_navigate_to_side_panel_click_on_element_and_then_textbox() {
       txtbox.TextBox();
    }
    @Then(": User enter full name")
    public void user_enter_full_name() {
        txtbox.enterFullName();
    }
    @Then(": user enter current address")
    public void user_enter_current_address() {
        txtbox.enterCurrentaddress();
    }
    @Then(": User click submit")
    public void user_click_submit() {
        txtbox.enterCurrentaddress();
    }

}
