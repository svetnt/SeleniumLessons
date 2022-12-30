import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task4 extends BaseUtils {

    public static void main(String[] args) {

        String link = "https://suninjuly.github.io/math.html";
        WebDriver driver = getDriver();
        driver.get(link);

         int x = Integer.parseInt(driver.findElement(By.id("input_value")).getText());
         String result = String.valueOf(Math.log(Math.abs(12*Math.sin(x))));

         driver.findElement(By.id("answer")).sendKeys(result);
         driver.findElement(By.id("robotCheckbox")).click();
         driver.findElement(By.id("robotsRule")).click();
         driver.findElement(By.cssSelector(".btn.btn-default")).click();

    }
}
