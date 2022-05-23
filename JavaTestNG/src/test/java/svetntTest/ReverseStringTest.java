package svetntTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.ReverseString;

public class ReverseStringTest {

    ReverseString testOb=new ReverseString();

    @Test
    public void testReverseStringPositiv(){

        String testText="Abracadabra";
        String exceptedResult="arbadacarbA";
        String actualResult=testOb.reverseString(testText);

        Assert.assertEquals(actualResult,exceptedResult);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testReverseStringNegativ(){

        String testText=null;
        String actualResult=testOb.reverseString(testText);
    }
}
