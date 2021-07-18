package rocks.zipcode;
import org.junit.Test;

import javax.sql.rowset.FilteredRowSet;
import java.util.Iterator;
import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class TestPriorityQueue {

    @Test
    public void TestAddPeek() {
        PriorityQueue<String> peaQ = new PriorityQueue<>();
        peaQ.add("First");
        peaQ.add("Second");
        peaQ.add("Third");
        peaQ.add("Fourth");
        String expected = "First";
        String actual = peaQ.peek();

        assertEquals(expected,actual);
    }

    @Test
    public void TestIterator() {
        PriorityQueue<String> peaQ = new PriorityQueue<>();
        peaQ.add("First");
        peaQ.add("Second");
        peaQ.add("Third");
        peaQ.add("Fourth");

        String expected = "First";
        Iterator value = peaQ.iterator();
        String actual = (String) value.next();

        assertEquals(expected,actual);
    }

    @Test
    public void TestRemove() {
        PriorityQueue<String> peaQ = new PriorityQueue<>();
        peaQ.add("First");
        peaQ.add("Second");
        peaQ.add("Third");
        peaQ.add("Fourth");
        peaQ.remove("First");

        assertFalse(peaQ.contains("First"));
    }
}
