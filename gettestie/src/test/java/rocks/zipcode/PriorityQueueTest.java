package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void testAdd() {
        //given
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>();
        //when
        numberQueue.add(8);
        numberQueue.add(25);
        numberQueue.add(17);
        //then
        Assert.assertTrue(numberQueue.contains(17));
    }

    @Test
    public void testSize() {
        //given
        int expected = 3;
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>();
        //when
        numberQueue.add(82);
        numberQueue.add(25);
        numberQueue.add(17);
        int actual = numberQueue.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        //given
        int expected = 17;
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>();
        //when
        numberQueue.add(82);
        numberQueue.add(25);
        numberQueue.add(17);
        int actual = numberQueue.peek();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //given
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>();
        //when
        numberQueue.add(82);
        numberQueue.add(25);
        numberQueue.add(17);
        numberQueue.remove(82);
        //then
        Assert.assertFalse(numberQueue.contains(82));
    }
}
