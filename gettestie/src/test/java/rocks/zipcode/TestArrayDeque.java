package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import static org.junit.Assert.assertEquals;

public class TestArrayDeque {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDeque1(){
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add (1);

        assertEquals(true, newDeque.contains(1));
    }

    @Test
    public void TestArrayDeque2(){
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(2);
        newDeque.addFirst(1);
        newDeque.add(3);

        assertEquals(1, newDeque.getFirst().intValue());

    }

    @org.junit.Test
    public void TestArrayDeque3(){
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(785);
        newDeque.add(356);
        newDeque.add(527);
        newDeque.add(743);

        assertEquals(743, newDeque.getLast().intValue());
    }

    @org.junit.Test
    public void TestArrayDeque4(){
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(785);
        newDeque.add(356);
        newDeque.add(527);
        newDeque.add(743);

        assertEquals(785, newDeque.removeFirst().intValue());
    }
}
