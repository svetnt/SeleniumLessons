import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EE {
    static String baseUrl = "http://www.99-bottles-of-beer.net/";

    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement buttonTopList = driver.findElement(By.xpath("(//a[@href='/toplist.html'])[1]"));
        buttonTopList.click();
        WebElement buttonNewComments = driver.findElement(By.xpath("//a[@href='./newcomments.html']"));
        buttonNewComments.click();

        WebElement par = driver.findElement(By.xpath("(//p)[1]"));
        String actualRes=par.getText();

        System.out.println(actualRes);

          driver.quit();
    }
}
