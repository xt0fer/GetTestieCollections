package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.TestArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayListTest {

    @Test
    public void testArrayListAdd(){
        TestArrayList aList = new TestArrayList();
        aList.addTestEntries();
        Boolean actual = aList.getaList().size() > 0;

        Assert.assertTrue(actual);
    }

    @Test
    public void testArrayListRemove(){
        TestArrayList aList = new TestArrayList();

        Integer expected = 9;
        Integer actual = aList.getaList().remove(0);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testArrayListContains(){
        TestArrayList aList = new TestArrayList();

        Boolean actual = aList.getaList().contains(0);

        Assert.assertTrue(actual);
    }

}
