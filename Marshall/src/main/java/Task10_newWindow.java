import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class Task10_newWindow extends BaseUtils{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        driver.get("http://suninjuly.github.io/redirect_accept.html");

        driver.findElement(By.cssSelector(".trollface.btn.btn-primary")).click();

        String current = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        handles.remove(current);
        driver.switchTo().window(handles.iterator().next());

        int x = Integer.parseInt(driver.findElement(By.id("input_value")).getText());
        String result = String.valueOf(Math.log(Math.abs(12*Math.sin(x))));

        driver.findElement(By.id("answer")).sendKeys(result);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();



        /*Вы можете использовать SwitchTo().Window("handle")для переключения на желаемое окно.
          Вы можете использовать SwitchTo().Window("mywindowID"), если знаете идентификатор окна.
          SwitchTo().Window("")всегда будет возвращаться к основному/главному окну.
          SwitchTo().Frame("popupFrame")попадет во всплывающее окно, которое пришло из окна, которым в данный момент управляет веб-драйвер.
        */
    }
}
