import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\Chromedriver\\\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://stepik.org/catalog");
        WebElement element=driver.findElement(By.xpath("//input[@placeholder='Название курса, автор или предмет']"));
        element.click();
        element.sendKeys("Java", Keys.ENTER);
        //String sv=e.getAttribute("offsetWidth");
        //System.out.println("Свойство "+sv);


        /* System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://stepik.org/catalog");
        WebElement e=driver.findElement(By.xpath("//input[@placeholder='Название курса, автор или предмет']"));

        e.sendKeys("Java", Keys.ENTER);*/
        //String sv=e.getAttribute("offsetWidth");
        //System.out.println("Свойство "+sv);
        //driver.get("https://www.google.com");
       // WebElement elem=driver.findElement(By.xpath("//a[text()='Почта']"));
        //elem.click();
       //String svoystvo=elem.getAttribute("color");
       //System.out.println(svoystvo);

       // WebElement element=(new WebDriverWait(driver, Duration.ofSeconds(15)).
        //        until(ExpectedConditions.presenceOfElementLocated(By.id("123")));

     //   WebElement input=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    }
}
