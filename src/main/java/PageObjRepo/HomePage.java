package PageObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import qaUtil.TestBase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class HomePage extends TestBase {

        public void addBrocolli() throws InterruptedException {
            String[] expectedItem = {"Brocolli", "Cucumber"};
            List ItemNeeded = Arrays.asList(expectedItem);
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.product-name")));
            List<WebElement> productname = driver.findElements(By.cssSelector("h4.product-name"));

            System.out.println(productname);
            for (int i = 0; i <productname.size(); i++) {

                String[] formatedname = productname.get(i).getText().split("-");
                String name = formatedname[0].trim();
                System.out.println(name);


                if (ItemNeeded.contains(name)) {

                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD TO CART')]")));

                    driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
                }
            }

        }


        public void cart() {
            driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
            System.out.println("User is able to click on cart");


        }

        public void checkout(){
            Actions move = new Actions(driver);
            WebElement checkout = driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
            move.moveToElement(checkout);
            driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        }
//
//
//    }
    }



