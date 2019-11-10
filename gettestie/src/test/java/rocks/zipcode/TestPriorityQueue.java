package rocks.zipcode;

import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQueue1(){
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();

        newQueue.add(190);
        newQueue.add(85);
        newQueue.add(34);
        newQueue.add(1);

        assertEquals("[1, 34, 85, 190]", newQueue.toString());
    }

    @org.junit.Test
    public void TestPriorityQueue2(){
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();

        newQueue.add(190);
        newQueue.add(85);
        newQueue.add(34);
        newQueue.add(1);

        assertEquals(1, newQueue.peek().intValue());
    }

    @org.junit.Test
    public void TestPriorityQueue3(){
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();

        newQueue.add(190);
        newQueue.add(85);
        newQueue.add(34);
        newQueue.add(1);

        newQueue.poll();

        assertEquals(3,newQueue.size());
    }
}
