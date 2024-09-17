package rocks.zipcode;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import static org.junit.Assert.*;

public class TestArrayDeque {

    @Test
    public void TestAddGet() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Deck");
        arrayDeque.add("Not");
        arrayDeque.add("De-queue");

        arrayDeque.addFirst("Pronounced");

        String expected = "Pronounced";
        String actual = arrayDeque.getFirst();

        assertEquals(expected, actual);
    }

    @Test
    public void TestRemove() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Deck");
        arrayDeque.add("Not");
        arrayDeque.add("De-queue");
        arrayDeque.addFirst("Pronounced");

        arrayDeque.removeFirst();

        String expected = "Deck";
        String actual = arrayDeque.getFirst();

        assertEquals(expected, actual);
    }

    @Test
    public void TestClear() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Pronounced");
        arrayDeque.add("Deck");
        arrayDeque.add("Not");
        arrayDeque.add("De-queue");
        arrayDeque.clear();

        assertTrue(arrayDeque.isEmpty());
    }

}
