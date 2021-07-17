import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

    @Test
    public void containsTest(){
        PriorityQueue<String> que = new PriorityQueue<>();

        que.add("Chicken");
        que.add("Beef");
        que.add("I'm Hungry");

        Assert.assertTrue(que.contains("Beef"));
    }

    @Test
    public void removeTest(){
        PriorityQueue<String> que = new PriorityQueue<>();

        que.add("Chicken");
        que.add("Beef");
        que.add("I'm Hungry");

        que.remove("I'm Hungry");

        Assert.assertFalse(que.contains("I'm Hungry"));
    }

    @Test
    public void offerTest(){
        PriorityQueue<String> que = new PriorityQueue<>();

        que.add("Chicken");
        que.add("Beef");
        que.add("I'm Hungry");


        Boolean expected = true;
        Boolean actual = que.offer("Then eat fool");

        Assert.assertEquals(expected, actual);
        System.out.println(que);
    }
}
