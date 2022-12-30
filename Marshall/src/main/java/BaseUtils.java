import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtils {

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static void end(){
        try {
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            getDriver().quit();
        }
    }
}
