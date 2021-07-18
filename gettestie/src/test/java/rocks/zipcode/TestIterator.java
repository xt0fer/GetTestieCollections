package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;


public class TestIterator {

    @Test
    public void iteratorTest() {
        int num = 30;
        ArrayList<Integer> list = new ArrayList<>(num);

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();
        Integer actual = 0;
        while(iterator.hasNext()) {
            actual = actual + iterator.next();
        }
        Integer expected = 30;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestHasNext() {
        HashSet<Integer> set = new HashSet<>();

        Iterator value = set.iterator();

        assertFalse(value.hasNext());
    }

    @Test
    public void TestNext() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Integer expected = 1;
        Iterator value = set.iterator();

        Integer actual = (Integer) value.next();

        assertEquals(expected,actual);
    }

}
