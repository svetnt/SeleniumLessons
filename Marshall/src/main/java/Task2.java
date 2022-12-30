import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        String link = "http://suninjuly.github.io/huge_form.html";

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);

        List<WebElement> elements = new ArrayList<>();
        elements = driver.findElements(By.tagName("input"));

        for (WebElement element : elements) {
            element.sendKeys("resp");
        }

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        try {
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
