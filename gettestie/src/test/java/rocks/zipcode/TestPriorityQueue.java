package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TestPriorityQueue {
    LinkedList<String> pq;

    @Before
    public void setUp(){
        pq = new LinkedList<>();
        pq.add("Whale");
        pq.add("Hippo");
        pq.add("Penguin");
    }

    @Test
    public void testPriorityQueueSize1() {
        Assert.assertEquals(3, pq.size());
    }

    @Test
    public void testPriorityQueueSize2() {
        pq.add("Eel");
        pq.add("Clown Fish");
        pq.add("Crab");
        Assert.assertEquals(6, pq.size());
    }

    @Test
    public void testPriorityQueuePeek() {
        String expected = "Whale";
        Assert.assertEquals(expected, pq.peek());
    }

    @Test
    public void testPriorityQueueClear(){
        String expected = "Whale";
        pq.clear();
        Assert.assertFalse(pq.contains(expected));
    }

    @Test
    public void testPriorityQueueContains1() {
        String expected = "Hippo";
        Assert.assertTrue(pq.contains(expected));
    }

    @Test
    public void testPriorityQueueContains2() {
        String expected = "Walrus";
        Assert.assertFalse(pq.contains(expected));
    }

    @Test
    public void testPriorityQueueIndexOf(){
        pq.offer("Walrus");
        String expected = "Walrus";
        Assert.assertEquals(3, pq.indexOf(expected));
    }

    @Test
    public void testPriorityQueueOffer(){
        String str = "Polar Bear";
        Assert.assertTrue(pq.offer(str)); //inputs this entry to the next space in list
    }

    @Test
    public void testPriorityQueuePollLast() {
        String expected = "Penguin";
        Assert.assertEquals(expected, pq.pollLast());
    }
}
