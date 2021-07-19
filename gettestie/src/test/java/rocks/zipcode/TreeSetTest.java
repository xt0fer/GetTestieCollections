package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void pollFirstLastTest() {
        TreeSet<Integer> dog = new TreeSet<>();
        dog.add(3);
        dog.add(102);
        dog.add(63);
        dog.add(4);
        dog.add(36);


        dog.pollLast();
        dog.pollFirst();

        String actual = dog.toString();
        String expected = "[4, 36, 63]";

        Assert.assertEquals(expected, actual);
    }


}
