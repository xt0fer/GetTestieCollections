package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class TestHashMap {

    @Test
    public void TestSize() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        int expected = 3;
        int actual = map.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGet() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        Integer expected = 3;
        Integer actual = map.get("Three");

        assertEquals(expected, actual);
    }

    @Test
    public void TestContains() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

       assertTrue(map.containsValue(1));
    }

    @Test
    public void TestRemove() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.remove("Two", 2);

        assertFalse(map.containsValue(2));
    }

    @Test
    public void TestClear() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.clear();

        assertTrue(map.isEmpty());
    }
}
