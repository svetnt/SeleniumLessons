import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Task7_Scroll extends BaseUtils{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        String link = "http://suninjuly.github.io/execute_script.html";
        driver.get(link);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        int x = Integer.parseInt(driver.findElement(By.id("input_value")).getText());
        String result = String.valueOf(Math.log(Math.abs(12*Math.sin(x))));
        driver.findElement(By.id("answer")).sendKeys(result);
        driver.findElement(By.id("robotCheckbox")).click();

        WebElement radioBr = driver.findElement(By.id("robotsRule"));
        WebElement buttonSubmit = driver.findElement(By.cssSelector(".btn.btn-primary"));
        jse.executeScript("arguments[0].scrollIntoView();", buttonSubmit); //прокручивает вниз до элемента buttonSubmit
        radioBr.click();
        buttonSubmit.click();

        // jse.executeScript("window.scrollTo(0, document.body.scrollHeight)"); прокручивает вниз до конца страницы

    }
}
