package svetnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTests extends BaseTest{

   @Test
    public void testHeader() throws InterruptedException {

        driver.get(baseUrl);
        WebElement header = driver.findElement(
                By.xpath("//h1")
        );

        Assert.assertEquals(header.getText(), "99 Bottles of Beer");
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
    public void testSubtitle() {
        driver.get(baseUrl);
        WebElement buttonUnder6 = driver.findElement(By.xpath("(//a[@href='/submitnewlanguage.html'])[2]"));
        buttonUnder6.click();
        WebElement subtitle = driver.findElement(By.xpath("//a[@href='./submitnewlanguage.html']"));
        String actualResult = subtitle.getText();
        String expectedResult = "Submit New Language";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMenuAbcHtml() {
        driver.get("http://www.99-bottles-of-beer.net/abc.html");
        WebElement subtitle1 = driver.findElement(By.xpath("//a[@href='0.html']"));
        String actualResult = subtitle1.getText();
        String expectedResult = "0-9";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAuthorName() {
        driver.get(baseUrl);
        WebElement buttonTeam = driver.findElement(By.xpath("//a[@href='team.html']"));
        buttonTeam.click();
        List<WebElement> authorName = driver.findElements(By.xpath("//h3"));
        String[] actualResult = new String[authorName.size()];
        int i = 0;
        for (WebElement element : authorName) {
            String s = element.getText();
            actualResult[i] = s;
            i++;
        }
        String[] expectedResult = {"Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"};
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubmitLanguageError() {
        driver.get("http://www.99-bottles-of-beer.net/submitnewlanguage.html");
        WebElement buttonSubmitLanguage = driver.findElement(By.cssSelector("input.button"));
        buttonSubmitLanguage.click();
        WebElement errorInfo = driver.findElement(By.xpath("(//p)[1]"));
        String actualInfoResult = errorInfo.getText();
        String expectedInfoResult = "Error: Precondition failed - Incomplete Input.";
        Assert.assertEquals(actualInfoResult, expectedInfoResult);
    }

    @Test
    public void testSubmitLanguageFirstText () {
        driver.get("http://www.99-bottles-of-beer.net/submitnewlanguage.html");
        WebElement firstText = driver.findElement(By.cssSelector("#main li"));
        String actualResult=firstText.getText();
        String expectedResult="IMPORTANT: Take your time! The more carefully you fill out this form (especially the language name and description), the easier it will be for us and the faster your language will show up on this page. We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testBrowseLanguages () {
         driver.get("http://www.99-bottles-of-beer.net/abc.html");
        WebElement tableTh1 = driver.findElement(By.cssSelector("#category>tbody>tr>:nth-child(1)"));
        WebElement tableTh2 = driver.findElement(By.cssSelector("#category>tbody>tr>:nth-child(2)"));
        String actualResult1=tableTh1.getText();
        String actualResult2=tableTh2.getText();
        String expectedResult1="Language";
        String expectedResult2="Author";
        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);
    }

   @Test
    public void testNewComments () {
        driver.get(baseUrl);
        WebElement buttonTopList = driver.findElement(By.xpath("(//a[@href='/toplist.html'])[1]"));
        buttonTopList.click();
        WebElement buttonNewComments = driver.findElement(By.xpath("//a[@href='./newcomments.html']"));
        buttonNewComments.click();
        WebElement paragraf=driver.findElement(By.xpath("(//p)[1]"));
        int actualResult=paragraf.getText().length();
        int expectedResult=0;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSubmitnewlanguageImportant () {
        driver.get("http://www.99-bottles-of-beer.net/submitnewlanguage.html");
        WebElement bImportant = driver.findElement(By.xpath("(//b)[1]"));
        String actualResult = bImportant.getText();
        String expectedResult = "IMPORTANT:";
        String actualResult1 = bImportant.getAttribute("font-weight");
        String expectedResult1 = "bold";
        String actualResult2 = bImportant.getCssValue("background-color");
        String expectedResult2 = "red";
        String actualResult3 = bImportant.getCssValue("color");
        String expectedResult3 = "white";
        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);
        Assert.assertEquals(actualResult3,expectedResult3);
    }
}
