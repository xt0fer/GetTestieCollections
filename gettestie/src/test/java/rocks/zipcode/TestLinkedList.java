package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import static org.junit.Assert.*;
public class TestLinkedList {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    @Test
    public void testLinkedListAdd() {
        Queue<Person> LinkedList = new LinkedList<>();
        assertTrue(LinkedList.add(personOne));
    }

    @Test
    public void testLinkedListPeek() {
        Queue<Person> LinkedList = new LinkedList<>();
        LinkedList.add(personOne);
        LinkedList.add(personTwo);
        assertEquals(personOne, LinkedList.peek());
    }

    @Test
    public void testLinkedListPeekEmpty() {
        Queue<Person> LinkedList = new LinkedList<>();
        assertNull(LinkedList.peek());
    }

    @Test
    public void testLinkedListRemove() {
        Queue<Person> LinkedList = new LinkedList<>();
        LinkedList.add(personOne);
        LinkedList.add(personTwo);
        assertEquals(personOne,LinkedList.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLinkedListRemoveIndexException() {
        Queue<Person> LinkedList = new LinkedList<>();
        LinkedList.remove();
    }

    @Test
    public void testLinkedListPoll() {
        Queue<Person> LinkedList = new LinkedList<>();
        LinkedList.add(personOne);
        LinkedList.add(personTwo);
        assertEquals(personOne,LinkedList.poll());
    }

    @Test
    public void testLinkedListPollEmpty() {
        Queue<Person> LinkedList = new LinkedList<>();
        assertNull(LinkedList.poll());
    }
}
