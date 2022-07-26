package Stepdefinition;

import PageObjRepo.HomePage;
import PageObjRepo.RahulShettyTopDeals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;
import qaUtil.TestBase;

public class HomePageStepdef extends TestBase {

    HomePage homePage = new HomePage();
    RahulShettyTopDeals topDeals = new RahulShettyTopDeals();

    @Test
    @Given(": User should be able to launch browser")
    public void user_should_be_able_to_launch_browser() {
        initiallization();
    }
    @Then(": User should be able to Brocolli to cart")
    public void user_should_be_able_to_brocolli_to_cart() throws InterruptedException {
        homePage.addBrocolli();

    }

    @Then(": Validate Brocolli and Cucumber is added to cart")
    public void validate_brocolli_and_cucumber_is_added_to_cart() {
        homePage.cart();
    }

    @Then(": User should be able to proceed to check out")
    public void user_should_be_able_to_proceed_to_check_out() {
        homePage.checkout();

    }

    @Then(": User should be able to click on Top Deals")
    public void user_should_be_able_to_click_on_top_deals() {
        topDeals.clickonTopdeals();

    }
    @Then(": User should be able to sort Vegetable")
    public void user_should_be_able_to_sort_vegetable() {
        topDeals.sortVeg();

    }
    @Then(": Validate Vegetable is Alphabetically sort")
    public void validate_vegetable_fruit_is_alphabetically_sort() {

    }
    @Then(": Validate {string} is added to Webtable")
    public void validate_is_added_to_webtable(String string) {
        topDeals.UpdtatedWebtablelist(string);
    }


}


