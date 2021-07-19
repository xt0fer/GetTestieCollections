package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void addFirstTest() {
        LinkedList<Integer> taco = new LinkedList<>();
        taco.add(1);
        taco.add(2);
        taco.add(3);

       taco.addFirst(0);
        Integer expected = 0;
        Integer actual = taco.getFirst();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addLastTest() {
        LinkedList<Integer> taco = new LinkedList<>();
        taco.add(1);
        taco.add(2);
        taco.add(3);

        taco.addLast(99);
        Integer expected = 99;
        Integer actual = taco.getLast();

        Assert.assertEquals(expected, actual);
    }

}
