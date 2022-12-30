import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Task11_explicidWait extends BaseUtils{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
                        /* Implicit Wait можно использовать для:
                           ожидания полной загрузки страницы — pageLoadTimeout();
                           ожидания появления элемента на странице — implicitlyWait();
                           ожидания выполнения асинхронного запроса — setScriptTimeout();*/
        driver.get("http://suninjuly.github.io/explicit_wait2.html");

        WebDriverWait wait = new WebDriverWait(driver,12);
        wait.until(ExpectedConditions.textMatches(By.id("price"), Pattern.compile("100")));
        driver.findElement(By.xpath("//button[text()='Book']")).click();

        int x = Integer.parseInt(driver.findElement(By.id("input_value")).getText());
        String result = String.valueOf(Math.log(Math.abs(12*Math.sin(x))));

        driver.findElement(By.id("answer")).sendKeys(result);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}
