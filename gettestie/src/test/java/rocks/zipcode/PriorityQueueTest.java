package rocks.zipcode;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    @Test
    public void isEmptyTest(){
        //given
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("This");
        priorityQueue.add("ish");
        priorityQueue.add("is");
        priorityQueue.add("bananas");

        //when
        priorityQueue.clear();

        //then
        Assert.assertTrue(priorityQueue.isEmpty());
    }
    @Test
    public void pollTest(){
        //given
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        //when
        Object expected = priorityQueue.poll();

        //then
        Assert.assertNull(expected);
    }
}
