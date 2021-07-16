package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.TestHashSet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestHashSetTest {
    @Test
    public void testHashSet1() {
        TestHashSet testHashSet = new TestHashSet();
        testHashSet.testAddEntries();
        HashSet<Integer> testHash = testHashSet.getHashSet();

        Integer actual = testHash.size();
        Integer expected = 10;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testHashSet2(){
        TestHashSet testHashSet = new TestHashSet();
        testHashSet.testAddEntries();
        HashSet<Integer> testHash = testHashSet.getHashSet();

        Boolean actual = testHash.contains(1);

        Assert.assertTrue(actual);
    }

    @Test
    public void testHashSet3(){
        TestHashSet testHashSet = new TestHashSet();
        testHashSet.testAddEntries();
        HashSet<Integer> testHash = testHashSet.getHashSet();
        Integer actual = new ArrayList<Integer>(testHash).indexOf(1);
        Integer expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testHashSet4(){
        TestHashSet testHashSet = new TestHashSet();
        testHashSet.testAddEntries();
        HashSet<Integer> testHash = testHashSet.getHashSet();

        Boolean actual = testHash.isEmpty();

        Assert.assertFalse(actual);
    }
}
