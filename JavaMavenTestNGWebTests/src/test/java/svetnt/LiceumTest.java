package svetnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LiceumTest extends BaseTest{

    protected String homePage = "http://www.liceum75.ru/";

    @Test
    public void mainMenuTest(){

        driver.get(homePage);
        WebElement information = driver.findElement(By.cssSelector("[href=\"/information\"]"));
        information.click();

        Assert.assertEquals(driver.findElement(By.id("page-title")).getText(),
                "Сведения об образовательной организации:");
    }
}
