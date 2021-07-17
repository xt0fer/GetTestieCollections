import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    @Test
    public void containsTest(){
        Vector<String> vTest = new Vector<>();

        vTest.add("John");
        vTest.add("Song");
        vTest.add("Apple");
        vTest.add("Orange");

        Boolean expected = true;
        Boolean actual = vTest.contains("Apple");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getLastIndex(){
        Vector<String> vTest = new Vector<>();

        vTest.add("John");
        vTest.add("Song");
        vTest.add("Apple");
        vTest.add("Orange");
        vTest.add("Orange");
        vTest.add("Banana");

        Integer expected = 4;
        Integer actual = vTest.lastIndexOf("Orange");

        Assert.assertEquals(expected, actual);
    }

}
