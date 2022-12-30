import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task5 {

    public static void main(String[] args) {

        WebDriver driver = BaseUtils.getDriver();
        String link = "http://suninjuly.github.io/get_attribute.html";
        driver.get(link);

        int x = Integer.parseInt(driver.findElement(By.id("treasure")).getAttribute("valuex"));
        String result = String.valueOf(Math.log(Math.abs(12*Math.sin(x))));
        driver.findElement(By.id("answer")).sendKeys(result);
        driver.findElement(By.id("robotCheckbox")).click();
        driver.findElement(By.id("robotsRule")).click();
        driver.findElement(By.cssSelector(".btn.btn-default")).click();

    }
}
