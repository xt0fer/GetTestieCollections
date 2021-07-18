package rocks.zipcode;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;


public class TestTreeMap {

    @Test
    public void TestPut() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        assertTrue(treeMap.containsValue("TreeMap"));
    }

    @Test
    public void TestRemove() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "OneMap");
        treeMap.put(2, "TwoMap");
        treeMap.put(3, "TreeMap");
        treeMap.put(4, "FourMap");

        treeMap.remove(4);

        assertFalse(treeMap.containsValue("FourMap"));
    }

}
