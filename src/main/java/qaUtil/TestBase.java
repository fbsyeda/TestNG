package qaUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public Properties prop;
    // Create constructor to read properties from config property

    FileInputStream fis;

    {
        try {
            prop = new Properties();
            fis = new FileInputStream( "C:/Users/fbsye/eclipse-workspace/FatimaCucumberSelenium/src/main/resources/config.properties");
            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initiallization(){

        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Users//fbsye//eclipse-workspace//FatimaCucumberSelenium//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(prop.getProperty("url"));
        }
    }


}
