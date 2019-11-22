package rocks.zipcode;

import com.sun.codemodel.internal.util.UnicodeEscapeWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    private Vector vector;
    private Vector vectorClone;

    @Before
    public void setUp() {
        vector = new Vector();
        vectorClone = new Vector();
        vector.add("You");
        vector.add("Got");
        vector.add("This");
    }

    @Test
    public void testVectorAdd(){
        String expected = "Yay!";
        vector.add(expected);
        Assert.assertTrue(vector.contains(expected));
    }

    @Test
    public void testVectorGet(){
        String expected = "Got";
        String actual = vector.get(1).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testVectorClear(){
        vector.clear();
        Assert.assertFalse(vector.contains("You"));
    }

    @Test
    public void testVectorLastElement1() {
        String expected = "Hey!";
        vector.add(expected);
        Assert.assertEquals(3, vector.lastIndexOf(expected));
    }

    @Test
    public void testVectorLastElement2(){
        Assert.assertEquals(-1, vector.lastIndexOf(5));
        // should return -1 if vector doesnt exist
    }

    @Test
    public void testVectorClone(){
        vectorClone = (Vector)vector.clone();
        Assert.assertTrue(vector.equals(vectorClone));
    }
}
