package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.NoSuchElementException;
import java.util.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

//somewhat working
public class TestPriorityQueue {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    @Test
    public void testPriorityQueueAdd() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        assertTrue(PriorityQueue.add(personOne));
    }

    @Test
    public void testPriorityQueuePeek() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        PriorityQueue.add(personOne);
        PriorityQueue.add(personTwo);
        assertEquals(personTwo, PriorityQueue.peek());
    }

    @Test
    public void testPriorityQueuePeekEmpty() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        assertNull(PriorityQueue.peek());
    }

    @Test
    public void testPriorityQueueRemove() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        PriorityQueue.add(personOne);
        PriorityQueue.add(personTwo);
        assertEquals(personTwo,PriorityQueue.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void testPriorityQueueRemoveIndexException() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        PriorityQueue.remove();
    }

    @Test
    public void testPriorityQueuePoll() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        PriorityQueue.add(personOne);
        PriorityQueue.add(personTwo);
        assertEquals(personTwo,PriorityQueue.poll());
    }

    @Test
    public void testPriorityQueuePollEmpty() {
        Queue<Person> PriorityQueue = new PriorityQueue<>();
        assertNull(PriorityQueue.poll());
    }
}
