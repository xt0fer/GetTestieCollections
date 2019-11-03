package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;


public class HashSetTest {
    private HashSet<Integer> hashSet;

    @Before
    public void doThisFirst(){
        hashSet = new  HashSet<>();
    }

    @Test
    public void addTest1(){
        hashSet.clear();
        hashSet.add(1);
        hashSet.add(2);
        HashSet<Integer> expected = new HashSet<Integer>(Arrays.asList(1,2));
        Assert.assertEquals(expected, hashSet);
    }

    @Test //Any duplicate elements in a hashSet are automatically removed.
    public void autoRejectDuplicateTest(){
        hashSet.clear();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        HashSet<Integer> expected = new HashSet<Integer>(Arrays.asList(1,2));
        Assert.assertEquals(expected, hashSet);
    }

    @Test //Test shows how .clear() method removes all elements AND changes size of HashSet to zero.
    public void clearSetTest(){
        hashSet.clear();
        hashSet.add(1);
        hashSet.add(2);
        HashSet<Integer> expected1 = new HashSet<>(Arrays.asList(1,2));
        Assert.assertEquals(expected1, hashSet);

        hashSet.clear();

        HashSet<Integer> expected2 = new HashSet<>();
        Assert.assertEquals(expected2, hashSet);
        Assert.assertEquals(0, hashSet.size());
    }

    @Test //Test shows how only the contents matter when comparing to hashSets, not the order of the elements.
    public void OrderDoesNotMatterTest(){
        hashSet.clear();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        HashSet<Integer> expected1 = new HashSet<>(Arrays.asList(2,3,1));
        Assert.assertEquals(expected1, hashSet);
        Assert.assertEquals(expected1.hashCode(),hashSet.hashCode());
    }
}
