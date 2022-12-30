import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    public static void main(String[] args) {
        String link = "http://suninjuly.github.io/find_xpath_form";

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);

        driver.findElement(By.name("first_name")).sendKeys("Murlika");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Baziluur");
        driver.findElement(By.cssSelector(".form-control.city")).sendKeys("Tagil");
        driver.findElement(By.id("country")).sendKeys("RF");
        WebElement but = driver.findElement(By.xpath("//button[@type='submit']"));
        but.click();


        try {
            Thread.sleep(10000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
