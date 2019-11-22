package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestIterator {
    ArrayList<String> iterate;

    @Before
    public void setUp() {
        iterate = new ArrayList<>();
        iterate.add("A");
        iterate.add("B");
        iterate.add("C");
    }

    @Test
    public void TestIteratorRemove() {
        String removalStr = "C";
        iterate.remove(removalStr);
        Assert.assertFalse(iterate.contains(removalStr));
    }

    @Test
    public void testIteratorContains1() {
        String expected = "B";
        Assert.assertTrue(iterate.contains(expected));
    }

    @Test
    public void testIteratorContains2() {
        String expected = "P";
        Assert.assertFalse(iterate.contains(expected));
    }

    @Test
    public void TestIteratorGet() {
        String expected = "A";
        Assert.assertEquals(expected, iterate.get(0));
    }

    @Test
    public void TestIteratorHasPrevious() {
        ListIterator iterator = iterate.listIterator();
        Assert.assertFalse(iterator.hasPrevious());
    }

}
