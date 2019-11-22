package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {
    LinkedList<String> linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
    }

    @Test
    public void TestLinkedListGetLast() {
        String expected = "C";
        String actual = linkedList.getLast();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestLinkedListClear() {
        String expected = "B";
        Assert.assertTrue(linkedList.contains(expected));
    }
    @Test
    public void TestLinkedListSet() {
        String expected = "A";
        Assert.assertEquals(expected, linkedList.set(0,"1"));
    }
    @Test
    public void TestLinkedListPeek() {
        String expected = "A"; //first in first out
        String actual = linkedList.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestLinkedListPoll() {
        String expected = "A"; //finding the head of the list (first element in linkedList)
        String actual = linkedList.poll();
        Assert.assertEquals(expected, actual);
    }

}
