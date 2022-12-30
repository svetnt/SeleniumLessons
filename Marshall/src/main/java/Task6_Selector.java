import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Task6_Selector extends BaseUtils{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        String link = "https://suninjuly.github.io/selects1.html";
        driver.get(link);

        int first = Integer.parseInt(driver.findElement(By.id("num1")).getText());
        int secnd = Integer.parseInt(driver.findElement(By.id("num2")).getText());
        String result = String.valueOf(first+secnd);

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue(result);

        driver.findElement(By.cssSelector(".btn.btn-default")).click();

    }
}
