package rocks.zipcode;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class TestVector {

    @Test
    public void TestAddGet() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        Integer expected = 1;
        Integer actual = vector.elementAt(0); //get element at index 0

        assertEquals(expected,actual);
    }

    @Test
    public void TestRemove() {
        Vector<String> vector = new Vector<>();
        vector.add("Vector");
        vector.add("Not");
        vector.add("Victor");

        vector.removeElementAt(0);

        String expected = "Not";
        String acutal = vector.firstElement();

        assertEquals(expected, acutal);
    }
}
