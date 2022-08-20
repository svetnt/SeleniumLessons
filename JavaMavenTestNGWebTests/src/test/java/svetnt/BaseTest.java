package svetnt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected WebDriver driver;
    protected String baseUrl = "http://www.99-bottles-of-beer.net/";

    @BeforeClass
    protected void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    protected void afterMethod() {
        driver.quit();
    }

    /*
        static WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            return driver;
        }*/

}


