package svetnt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class WebTest12 extends BaseTest {

    protected void clickBrowseLanguages() {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//li/a[@href='/abc.html']")).click();
    }

    @Test
    public void submenuJ() {

        clickBrowseLanguages();

        WebElement submenuJ = driver.findElement(By.xpath("//li/a[@href='j.html']"));
        submenuJ.click();

        WebElement header = driver.findElement(By.xpath("(//div[@id='main']/p)[1]"));

        Assert.assertEquals(header.getAttribute("innerText"),
                "All languages starting with the letter J are shown, sorted by Language.");
    }

    @Test
    public void submenuM() {

        clickBrowseLanguages();

        WebElement submenuM = driver.findElement(By.xpath("//li/a[@href='m.html']"));
        submenuM.click();

        WebElement last = driver.findElement(By.xpath("//a[@href='language-mysql-1252.html']"));

        Assert.assertEquals(last.getText(), "MySQL");
    }

    @Test
    public void tableHeaders() {

        clickBrowseLanguages();

        List<WebElement> tableHeaders = driver.findElements(By.xpath("//th"));

        String[] actualResult = new String[tableHeaders.size()];

        for (int i = 0; i < tableHeaders.size(); i++) {
            actualResult[i] = tableHeaders.get(i).getText();
        }

        String[] expectedResult = {"Language", "Author", "Date", "Comments", "Rate"};

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testButtonUnder6() {

        driver.get(baseUrl);
        WebElement buttonUnder6 = driver.findElement(By.xpath("(//a[@href='/submitnewlanguage.html'])[2]"));
        String actualResult = buttonUnder6.getText();
        String expectedResult = "Submit new Language";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void mathematica() {

        clickBrowseLanguages();

        WebElement submenuM = driver.findElement(By.xpath("//li/a[@href='m.html']"));
        submenuM.click();

        Assert.assertEquals(driver.findElement(By.xpath("//a[@href='language-mathematica-1090.html']/following::td[1]")).
                getText(), "Brenton Bostick");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@href='language-mathematica-1090.html']/following::td[2]")).
                getText(), "03/16/06");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@href='language-mathematica-1090.html']/following::td[3]")).
                getText(), "1");
    }

    @Test
    public void countNumberLanguages(){

        clickBrowseLanguages();

        WebElement NumberLanguages = driver.findElement(By.xpath("//a[@href='0.html']"));
        NumberLanguages.click();

        List <WebElement> tableHeaders = driver.findElements(By.xpath("//tr[@onmouseover]"));

        Assert.assertEquals(tableHeaders.size(), 10);
    }

    @Test
    public void signGuestbook(){

        driver.get("http://www.99-bottles-of-beer.net/signv2.html");

        WebElement inputName = driver.findElement(By.xpath("//input[@name='name']"));
        inputName.sendKeys("Mitrofan");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys("mitrofan@mail.ru");

        WebElement inputComment = driver.findElement(By.xpath("//textarea"));
        inputComment.sendKeys("Eto comment");

        WebElement inputCode = driver.findElement(By.xpath("//input[@name='captcha']"));
        String randomCode=String.format("%.0f",Math.random()*1000);
        inputCode.sendKeys(randomCode, Keys.ENTER);

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='main']/p")).getText(),
         "Error: Error: Invalid security code.");
    }

    @Test
    public void bookmark(){

        clickBrowseLanguages();;

        WebElement selectLanguage = driver.findElement(By.xpath("//a[@href='language-ada-19.html']"));
        selectLanguage.click();

        WebElement selectAlternativeVersion = driver.findElement(By.xpath("//a[@href='language-ada-20.html']"));
        selectAlternativeVersion.click();

        WebElement selectBookmark = driver.findElement(By.xpath("//img[@title='Add to Reddit']"));
        selectBookmark.click();

        String actionResult = driver.getCurrentUrl();
        String exeptedResult = "https://www.reddit.com/login/?dest=https%3A%2F%2F" +
                "www.reddit.com%2Fsubmit%3Furl%3Dhttps%253A%252F%252Fwww.99-bottles-of-beer.net%252" +
                "Flanguage-ada-20.html%26title%3D99%2520Bottles%2520of%2520Beer%2520%257C%2520Language%2520Ada";

        Assert.assertEquals(actionResult, exeptedResult);
    }

    @Test
    public void numberTopList() {

        driver.get(baseUrl);

        driver.findElement(By.xpath("//li/a[@href='/toplist.html']")).click();
        List<WebElement> topList = driver.findElements(By.xpath("//tbody/tr"));
        int numberInTopList = 21;
        for (int i = 0; i < topList.size(); i++) {
            if (topList.get(i).getText().contains("Shakespeare")) {
                numberInTopList = i;
            }
        }

        driver.findElement(By.xpath("//a[@href='./toplist_esoteric.html']")).click();
        List <WebElement> topListEsoteric = driver.findElements(By.xpath("//tbody/tr"));
        int numberInTopListEsoteric = 11;
        for(int i=0; i<topListEsoteric.size(); i++){
            if(topListEsoteric.get(i).getText().contains("Shakespeare")){
                numberInTopListEsoteric = i; }
        }

        driver.findElement(By.xpath("//a[@href='./tophits.html']")).click();
        List <WebElement> topListHit = driver.findElements(By.xpath("//tbody/tr"));
        int numberInTopListHit = 7;
        for(int i=0; i<topListHit.size(); i++){
            if(topListHit.get(i).getText().contains("Shakespeare")){
                numberInTopListHit = i; }
        }

        driver.findElement(By.xpath("//a[@href='./toplist_real.html']")).click();
        List <WebElement> topListReal = driver.findElements(By.xpath("//tbody/tr"));
        int numberInTopListReal = 26;
        for(int i=0; i<topListReal.size(); i++){
            if(topListReal.get(i).getText().contains("Shakespeare")){
                numberInTopListReal = i; }
        }

        Assert.assertTrue(numberInTopList <= 20);
        Assert.assertTrue(numberInTopListEsoteric<=10);
        Assert.assertTrue(numberInTopListHit<=6);
        Assert.assertTrue(numberInTopListReal==26);
    }

    protected void clickJava(){
        clickBrowseLanguages();
        driver.findElement(By.xpath("//li/a[@href='j.html']")).click();
        driver.findElement(By.xpath("//a[@href='language-java-3.html']")).click();
    }

    @Test
    public void countJava(){

        clickJava();

        List <WebElement> listCountJava = driver.findElements(By.xpath("//table[@id='category']//tr"));

        Assert.assertEquals(listCountJava.size(), 6);
    }

    @Test
    public void maxComment(){

        clickJava();

        List <WebElement> listNameJava = driver.findElements(By.xpath("//table[@id='category']//tr/td/a"));


    }
}
