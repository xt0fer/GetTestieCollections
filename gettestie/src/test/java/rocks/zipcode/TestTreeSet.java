package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void TestAddContains() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");

        assertTrue(treeSet.contains("Two"));
    }

    @Test
    public void TestRemove() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.remove(4);

        Integer expected = 3;
        Integer actual = treeSet.size();

        assertEquals(expected,actual);
    }


}
