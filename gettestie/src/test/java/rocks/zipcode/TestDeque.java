package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import static org.junit.Assert.*;

public class TestDeque {
   public Deque<String> testDeque;

    @Before
    public void setUp() {
        testDeque = new ArrayDeque<>();
        testDeque.add("dum");
        testDeque.add("dom");
        testDeque.add("dim");

    }

    @Test
    public void testIsEmpty(){
        assertFalse(testDeque.isEmpty());
    }

    @Test
    public void testPeek(){
        assertEquals("dim",testDeque.peekLast());
        assertEquals("dum",testDeque.peekFirst());
    }

    @Test
    public void testRemove(){
        testDeque.remove("dim");
        assertEquals(2,testDeque.size());
    }

    @Test
    public void testAdd(){
       testDeque.addFirst("dam");
       testDeque.addLast("dum");
       assertEquals("dam",testDeque.getFirst());
        assertEquals("dum",testDeque.getLast());
    }
}
