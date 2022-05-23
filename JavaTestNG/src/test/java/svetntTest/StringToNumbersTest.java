package svetntTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.StringToNumbers;

public class StringToNumbersTest {

    StringToNumbers stringToNumbers=new StringToNumbers();

    @Test
    public void testStringToNumbersPositiv(){
        String sTest="1, 2, 3, 4, 5";
        int [] actualResult=stringToNumbers.stringToNumbers(sTest);
        int [] expectedResult=new int[]{1,2,3,4,5};
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(expectedExceptions=NumberFormatException.class)
    public void testStringToNumbersNegativNumberFormat(){
        String sTest="1, 2, 3, 4trc, 5";
        stringToNumbers.stringToNumbers(sTest);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testStringToNumbersNegativNull(){
        String sTest=null;
        stringToNumbers.stringToNumbers(sTest);
    }
}
