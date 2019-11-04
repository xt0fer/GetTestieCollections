package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.TreeSet;
import java.util.Arrays;


public class TreeSetTest {

    TreeSet<Integer> treeSet;

    @Before
    public void doThisFirst(){
        treeSet = new TreeSet<>();
    }

    @Test
    public void autoRejectDuplicateTest(){
        treeSet.clear();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(1);
        TreeSet<Integer> expected = new TreeSet<>(Arrays.asList(1,2));
        Assert.assertEquals(expected, treeSet);
    }

    @Test
    public void sortAscendingTest() {
        treeSet.clear();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        Assert.assertEquals((Integer) 1, treeSet.first());
        Assert.assertEquals((Integer) 3, treeSet.last());

    }

}
