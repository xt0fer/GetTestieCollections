package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void TestAdd() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Get");
        linkedList.add("Schwifty");
        linkedList.add(0,"Lets");
        String expected = "Lets";

        String actual = linkedList.get(0);

        assertEquals(expected, actual);
    }

    @Test
    public void TestSet() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("To");
        linkedList.add("Get Schwifty");
        linkedList.set(0, "Time to");

        String expected = "Time to";

        String actual = linkedList.get(0);

        assertEquals(expected, actual);
    }

    @Test
    public void TestRemove() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Time");
        linkedList.add("To");
        linkedList.add("Schwifty");

        linkedList.remove("Time");
        linkedList.remove("To");

        String expected = "Schwifty";

        String actual = linkedList.getFirst();

        assertEquals(expected, actual);
    }

    @Test
    public void TestisEmpty() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Time");
        linkedList.add("To");
        linkedList.add("Schwifty");
        linkedList.clear();

        assertTrue(linkedList.isEmpty());
    }
}
