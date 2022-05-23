package svetntTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import svetnt.RemoveDuplicates;

public class RemoveDuplicatesTest {

    RemoveDuplicates testOb=new RemoveDuplicates();

    @Test
    public void testRemoveDuplicatesPositiv(){

        String testText="AABBCCaabbcc";
        String exceptedResult="abc";
        String actualResult=testOb.removeDuplicates(testText);

        Assert.assertEquals(actualResult,exceptedResult);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testRemoveDuplicatesNegativNull(){

        String testText=null;
        String actualResult=testOb.removeDuplicates(testText);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testRemoveDuplicatesNegativInd(){

        String testText="";
        String actualResult=testOb.removeDuplicates(testText);
    }
}
