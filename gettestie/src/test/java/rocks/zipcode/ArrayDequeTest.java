package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeTest {

    @Test
    public void addTest() {
        ArrayDeque<Integer> array = new ArrayDeque<>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);

        Integer actual = array.size();
        Integer expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addLastTest() {
        ArrayDeque<Integer> array = new ArrayDeque<>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);

        array.addLast(13);
        Integer actual = array.getLast();
        Integer expected = 13;

        Assert.assertEquals(expected, actual);
    }
}
