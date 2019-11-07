package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PriorityQueueTest {

    private PriorityQueue<String> priQueue;
    private static final java.util.logging.Logger logger = Logger.getGlobal();



    @Before
    public void doThisFirst(){
        priQueue = new PriorityQueue<>();
    }

    @Test
    public void addTest(){
        priQueue.add("hi");
        priQueue.add("there");
        priQueue.add("Mike");
        //"Mike" is prioritized
        Assert.assertEquals("Mike", priQueue.peek());

    }

    @Test
    public void removeTest(){
        priQueue.add("hi");
        priQueue.add("there");
        priQueue.add("Mike");

        Assert.assertEquals("Mike", priQueue.remove());
        Assert.assertEquals("hi", priQueue.remove());
        Assert.assertEquals("there", priQueue.remove());

    }
}
