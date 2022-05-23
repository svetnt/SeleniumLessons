package svetntTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.CountWords;

public class CountWordsTest {

    CountWords testOb=new CountWords();

    @Test
    public void testCountWords(){

        String testText="As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are" +
                " the current long-term support (LTS) versions. Oracle released the last zero-cost public" +
                " update for the legacy version Java 8 LTS in January 2019 for commercial java use, " +
                "although it will otherwise still support Java 8 with public updates for personal use " +
                "indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that" +
                " are still receiving security and other upgrades.";
        String testWord="version";
        int expectedResult=2;
        int actualResult=testOb.countWords(testText,testWord);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
