package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.LinkedList;

public class TestLinkedList {
    LinkedList<String> testList;

    @Before
    public void setUp(){
        testList=new LinkedList<>();
        testList.add("bloop");
        testList.add("gloop");
        testList.add("floop");
    }

    @Test
    public void testPeek(){
        assertEquals("bloop",testList.get(0));
    }

    @Test
    public void testSet(){
        assertEquals("gloop",testList.set(1,"BLAH"));
    }

    @Test
    public void testGetLast(){
        assertEquals("floop",testList.getLast());
    }

    @Test
    public void testPoll(){
        assertEquals("bloop",testList.pollFirst());
        assertEquals("floop",testList.pollLast());
    }
    @Test
    public void testClear(){
        testList.clear();
        assertFalse(testList.contains("floop"));
    }
}
