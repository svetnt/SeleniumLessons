package svetntTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.StartsWithLetter;

public class StartsWithLetterTest {

    StartsWithLetter testOb = new StartsWithLetter();

    @Test
    public void testStartsWithLetterPositiv() {

        String testText = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        char testBukva = 'l';
        String ecxeptionResult = "lame,love,lame,live,Look,";
        String actualResult = testOb.startsWithLetter(testText, testBukva);

        Assert.assertEquals(actualResult, ecxeptionResult);
    }

    @Test
    public void testStartsWithLetterNegativ() {

        String testText = "As a decrepit father takes delight\n";
        char testBukva = 'l';
        String ecxeptedResult = "Слов, начинающихся с такой буквы, нет";
        String actualResult = testOb.startsWithLetter(testText, testBukva);

        Assert.assertEquals(actualResult, ecxeptedResult);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testStartsWithLetterNegativNull() {

        String testText = null;
        char testBukva = 'l';
        String actualResult = testOb.startsWithLetter(testText, testBukva);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testStartsWithLetterNegativInd() {

        String testText = "";
        char testBukva = 'l';
        String actualResult = testOb.startsWithLetter(testText, testBukva);
    }
}
