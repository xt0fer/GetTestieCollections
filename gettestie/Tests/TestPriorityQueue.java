import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.logging.Logger;

public class TestPriorityQueue {

    private PriorityQueue<String> newQueue;


    @Before
    public void SetUp()
        throws Exception {
    }


    @After
    public void tearDown() throws Exception {
    }

        @Test
        public void TestPriorityQueue () {
            PriorityQueue<Integer> newQueue = new PriorityQueue<>();

            newQueue.add(44);
            newQueue.add(849);
            newQueue.add(4390);
            newQueue.add(38);

            Assert.assertEquals("[38, 44, 4390, 849]", newQueue.toString());
        }
        @Test
        public void addTest() {
            PriorityQueue<String> newQueue = new PriorityQueue<>();
            newQueue.add("You");
            newQueue.add("are");
            newQueue.add("Great!");

            Assert.assertEquals("Great!", newQueue.peek());
        }

        @Test
        public void TestRemove () {
            PriorityQueue<String> newQueue = new PriorityQueue<>();
            newQueue.add("You");
            newQueue.add("are");
            newQueue.add("Great!");

            Assert.assertEquals("Great!", newQueue.remove());

        }
    }

