package svetntTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.LongestCommonSubstring;

public class LongestCommonSubstringTest {

    LongestCommonSubstring testOb = new LongestCommonSubstring();

    @Test
    public void testLongestCommonSubstringPositiv() {

        String str1 = "Smaze";
        String str2 = "amazing";
        String str3 = "amazon";

        String expectedResult = "maz";
        String actualResult = testOb.longestCommonSubstring(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLongestCommonSubstringPositivNet() {

        String str1 = "Smaze";
        String str2 = "Ruby";
        String str3 = "amazon";

        String expectedResult = "Общих символов нет";
        String actualResult = testOb.longestCommonSubstring(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testLongestCommonSubstringNegativInd() {

        String str1 = "Smaze";
        String str2 = "";
        String str3 = "amazon";

        String actualResult = testOb.longestCommonSubstring(str1, str2, str3);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testLongestCommonSubstringNegativNull() {

        String str1 = "Smaze";
        String str2 = null;
        String str3 = "amazon";

        String actualResult = testOb.longestCommonSubstring(str1, str2, str3);
    }
}

