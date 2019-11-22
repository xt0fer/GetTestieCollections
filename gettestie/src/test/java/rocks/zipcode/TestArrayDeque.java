package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    public Deque<String> arrDeque;

    @Before
    public void setUp(){
        arrDeque = new ArrayDeque<>();
        arrDeque.add("It's");
        arrDeque.add("Me");
        arrDeque.add("Kai!");
    }

    @Test
    public void testArrayDequeSize1(){
        Assert.assertEquals(3, arrDeque.size());
    }

    @Test
    public void testArrayDequeSize2(){
        arrDeque.add("Hello");
        arrDeque.add("There");
        Assert.assertEquals(5, arrDeque.size());
    }

    @Test
    public void testArrayDequeIsEmpty(){
        Assert.assertFalse(arrDeque.isEmpty());
    }

    @Test
    public void testArrayDequeuePeekFirst(){
        String expected = "It's";
        String actual = arrDeque.peekFirst();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayDequeuePeekLast(){
        String expected = "Kai!";
        String actual = arrDeque.peekLast();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayDequeueRemoveLastOccurence(){
        Deque<String> newDeque = new ArrayDeque<>();
        newDeque.add("Welcome");
        newDeque.add("To");
        newDeque.add("ZipCode");
        newDeque.add("Wilmington");
        String lastOccurence = "Wilmington";
        newDeque.removeLastOccurrence(lastOccurence);
        Deque<String> output = newDeque;
        Assert.assertEquals(newDeque, output);
    }

    @Test
    public void testArrayDequeue(){
        String expected = "Wow";
        arrDeque.addFirst(expected);
        Assert.assertEquals(expected, arrDeque.getFirst());
    }
}
