import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task9_allert extends BaseUtils{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        driver.get("http://suninjuly.github.io/alert_accept.html");

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        driver.switchTo().alert().accept();

        int x = Integer.parseInt(driver.findElement(By.id("input_value")).getText());
        String result = String.valueOf(Math.log(Math.abs(12*Math.sin(x))));

        driver.findElement(By.id("answer")).sendKeys(result);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        String response = driver.switchTo().alert().getText();
        System.out.println(response);
    }
}
