package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeSet {
    TreeSet<String> treeSet;

    @Before
    public void setUp() {
        treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
    }

    @Test
    public void TestTreeSetEmpty1() {
        treeSet.clear();
        Assert.assertTrue(treeSet.isEmpty());
    }

    @Test
    public void TestTreeSetEmpty2() {
        Assert.assertFalse(treeSet.isEmpty());
    }

    @Test
    public void TestTreeSetSize1() {
        Assert.assertEquals(3, treeSet.size());
    }

    @Test
    public void TestTreeSetSize2() {
        treeSet.add("D");
        treeSet.add("E");
        Assert.assertEquals(5, treeSet.size());
    }

    @Test
    public void TestTreeSetDescendingSet() {
        NavigableSet<String> reverseTree = treeSet.descendingSet();
        Assert.assertEquals(treeSet, reverseTree);
    }

    @Test
    public void TestTreeSetLast() {
        String expected = "C";
        Assert.assertEquals(expected, treeSet.last());
    }

    @Test
    public void TestTreeSetPollFirst() {
        String expected = "A";
        Assert.assertEquals(expected, treeSet.pollFirst());
    }

}
