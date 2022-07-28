package Stepdefinition;

import PageObjRepo.ToolsQACheckbox;
import PageObjRepo.ToolsQAValidateTextBox;
import io.cucumber.java.en.Then;
import qaUtil.TestBase;

public class ToolsQACheckboxstepdef extends TestBase {
    ToolsQACheckbox checkbox = new ToolsQACheckbox(driver);

    @Then(": User click on Checkbox")
    public void user_click_on_checkbox() {

        checkbox.selectcheckbox();

    }

    @Then(": user clik on Home checkbox")
    public void user_clik_on_home_checkbox() {
        checkbox.selecthomecheckbox();
    }
}
