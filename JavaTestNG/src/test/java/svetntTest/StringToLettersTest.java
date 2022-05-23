package svetntTest;

import org.testng.Assert;
import svetnt.StringToLetters;
import org.testng.annotations.Test;

public class StringToLettersTest {

    StringToLetters testOb=new StringToLetters();

    @Test
    public void testStringToLettersPositiv(){

        String sTest="12qwer.,t  7y";
        String actualResult=testOb.stringToLetters(sTest);
        String expectedResult="qwerty";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStringToLettersNegativ(){

        String sTest="12.,  790()&";
        String actualResult=testOb.stringToLetters(sTest);
        String expectedResult="В строке нет букв";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testStringToNumbersNegativNull(){
        String sTest=null;
        testOb.stringToLetters(sTest);
    }

}
