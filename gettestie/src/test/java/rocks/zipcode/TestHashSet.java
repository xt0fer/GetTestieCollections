package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Iterator;


public class TestHashSet {

    @Test
    public void TestContains() {
        HashSet<String> set = new HashSet<>();
        set.add("Manny");
        set.add("Loves");
        set.add("Mochi");
        set.add("IceCream");

        assertTrue(set.contains("Mochi"));
    }

    @Test
    public void TestIsEmpty() {
        HashSet<String> set = new HashSet<>();
        set.add("Not Empty");

        assertFalse(set.isEmpty()); // false
    }

    @Test
    public void TestClear() {
        HashSet<String> set = new HashSet<>();
        set.add("Something");
        set.add("Another");
        set.add("One");

        set.clear();

        assertTrue(set.isEmpty());
    }

    @Test
    public void TestSize() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals(3,set.size());
    }

    @Test
    public void TestRemove() {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        set.remove("one");

        assertFalse(set.contains("one"));
    }

    @Test
    public void TestIterator() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Iterator value = set.iterator();

        assertTrue(value.hasNext());
    }
}
