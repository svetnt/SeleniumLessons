package svetntTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.StringIntersection;

public class StringIntersectionTest {

    StringIntersection testOb=new StringIntersection();

    @Test
    public void testStringIntersectionPositiv(){

        String testTextFirst="Noobytp";
        String testTextSecond="tp";
        String ecpectedResult="tp";
        String actualResult=testOb.stringIntersection(testTextFirst,testTextSecond);

        Assert.assertEquals(actualResult,ecpectedResult);
    }

    @Test
    public void testStringIntersectionPositivNet(){

        String testTextFirst="Nui";
        String testTextSecond="Schmooze";
        String ecpectedResult="Общих символов нет";
        String actualResult=testOb.stringIntersection(testTextFirst,testTextSecond);

        Assert.assertEquals(actualResult,ecpectedResult);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testStringIntersectionNegativInd(){

        String testTextFirst="Noob";
        String testTextSecond="";
        String actualResult=testOb.stringIntersection(testTextFirst,testTextSecond);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testStringIntersectionNegativNull(){

        String testTextFirst="Noob";
        String testTextSecond=null;
        String actualResult=testOb.stringIntersection(testTextFirst,testTextSecond);
    }
}
