import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task8_fileLoad extends BaseUtils{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        String link = "http://suninjuly.github.io/file_input.html";
        driver.get(link);

        driver.findElement(By.name("firstname")).sendKeys("M");
        driver.findElement(By.name("lastname")).sendKeys("B");
        driver.findElement(By.name("email")).sendKeys("t@r.cu");
        driver.findElement(By.id("file")).sendKeys("C:\\Users\\User\\Documents\\12.txt");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }
}
