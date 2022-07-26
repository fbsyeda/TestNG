package PageObjRepo;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import qaUtil.TestBase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RahulShettyTopDeals extends TestBase {

    public void clickonTopdeals(){
        WebDriverWait wait = new WebDriverWait(driver,30);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cart-header-navlink']")));
        driver.findElement(By.xpath("//a[@class='cart-header-navlink']")).click();

        System.out.println(driver.getWindowHandles());
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        System.out.println(childid);
        driver.switchTo().window(childid);

        //[CDwindow-62765548AD505E26D025BD8F7C10E361, CDwindow-66FA42B65251FA9FEEDDC7A6CCA8994B]

    }

    public void sortVeg(){

        //Click on Column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        //Capture all the webelement into list
        List<WebElement> veglist = driver.findElements(By.xpath("//tr/td[1]"));

        List<String> originalList=  veglist.stream().map(s->s.getText()).collect(Collectors.toList());


//        for (int i = 0; i<veglist.size(); i++)
//        {
//            String originalList = veglist.get(i).getText();
//            System.out.println(originalList);
//        }
        //capture text of all weblement into original list
        //sort on the original list of step 3 --> sorted list

        List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedList,originalList);
        //Assert.assertEquals(sortedList,originalList);

        //Assert.assertTrue(originalList.equals(sortedList));

        //compare orignial list vs sorted list

//        driver.findElement(By.xpath("//input [@id ='search-field']")).click();
//        driver.findElement(By.xpath("//input [@id ='search-field']")).sendKeys("Almond");
    }

    public void UpdtatedWebtablelist(String string ){
        //Get the list of Veglist from Webtable
        List<WebElement> veglist = driver.findElements(By.xpath("//tr/td[1]"));
        //Convert the Veglist to String by creating List<String> and new list with reference varaiable

        //Apply stream to new list
        //filter Almond using lambda expression

        List<WebElement> result = veglist.stream().filter(ele->ele.getText().equals(string)).collect(Collectors.toList());
        result.forEach(ele-> System.out.println(ele.getText()));





    }
}

