package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void pollTest() {
        PriorityQueue<String> bunny = new PriorityQueue<String>();
            bunny.add("boo");

            String actual = bunny.poll();
            String expected = "boo";

        System.out.println(bunny.poll()); //boo was removed
        Assert.assertEquals(expected, actual);
    }
}
