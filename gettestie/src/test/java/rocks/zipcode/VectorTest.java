package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    private Vector<String> vector;

    @Before
    public void doThisFirst(){
        vector = new Vector<>(3, 3);
    }

    @Test //Vectors can grow or shrink in capacity as needed
    public void capacityAndIncrementTest(){
        vector.clear();
        vector.add("element");
        vector.add("element");
        vector.add("element");
        vector.add("element");
        Assert.assertEquals(6, vector.capacity());
        vector.ensureCapacity(10);
        Assert.assertEquals(10, vector.capacity());
        vector.trimToSize();
        Assert.assertEquals(4, vector.capacity());
    }

    @Test
    public void retainTest(){
        vector.clear();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");

        Vector<String> retain = new Vector<>();
        retain.add("1");
        retain.add("4");

        vector.retainAll(retain);

        Assert.assertTrue(vector.contains("1"));
        Assert.assertTrue(vector.contains("4"));

        Assert.assertFalse(vector.contains("2"));
        Assert.assertFalse(vector.contains("3"));
        Assert.assertFalse(vector.contains("5"));
    }
}
