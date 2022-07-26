package qaUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
    WebDriver driver = null;
    @BeforeTest
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:/Users/fbsye/eclipse-workspace/FatimaCucumberSelenium/chromedriver.exe");
        driver = new ChromeDriver();


    }

    @Test(dataProvider = "testdata")
    public void test1(String username, String password) throws InterruptedException {

        System.out.println(username + "|" + password);
        driver.get("https://www.facebook.com/login.php");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys(password);
        Thread.sleep(2000);

    }

    @DataProvider(name = "testdata")
    public Object[][] getdata(){
        String excelPath = "C:/Users/fbsye/eclipse-workspace/FatimaCucumberSelenium/excel/TestData.xlsx";
        Object data[][] = testData(excelPath,"Sheet1");
        return data;
    }

    public static Object[][] testData(String excelPath, String sheetname){

        ExcelUtil excel = new ExcelUtil(excelPath,sheetname);

        int rowCount = excel.getRowCount();
        int colcount = excel.getCellCount();
        //i is getting initialized at row 1 that is the user id not the header
        // j is 0 because the column 0 has the value of user id
        // after loop create Oject array and the size of Oject array should be the size of
        //column and row size
        //Substract row count by -1 because row 0 is header
        //Object is two dimensional array
        // inside the loop add data to Object
        // retrun type should be data
        // test data method was void so it needs to be replace by two dimensional object
        //
        Object data [][] = new Object[rowCount-1][colcount];



        for (int i=1; i<rowCount;i++){
            for (int j=0; j<colcount;j++){
                String cellData = excel.getCellData(i,j);
                System.out.println(cellData+" | ");
                data[i-1][j] = cellData;

            }
            System.out.println();

        }
        return data;
    }
}

