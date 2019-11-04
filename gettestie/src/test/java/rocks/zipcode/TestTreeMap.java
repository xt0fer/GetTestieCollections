package rocks.zipcode;

import java.util.TreeMap;
import static org.junit.Assert.assertEquals;

public class TestTreeMap {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMap1(){
        TreeMap<Integer, String> newTreeMap = new TreeMap<>();

        newTreeMap.put(1,"Dog");
        newTreeMap.put(2, "Cat");
        newTreeMap.put(3, "Bunny");

        assertEquals("[3, 2, 1]", newTreeMap.descendingKeySet().toString());

    }

    @org.junit.Test
    public void TestTreeMap2(){
        TreeMap<Integer, String> newTreeMap = new TreeMap<>();
        newTreeMap.put(1,"Dog");
        newTreeMap.put(2, "Cat");
        newTreeMap.put(3, "Bunny");

        assertEquals("[1=Dog, 2=Cat, 3=Bunny]", newTreeMap.entrySet().toString());

    }

    @org.junit.Test
    public void TestTreeMap3(){
        TreeMap<Integer, Integer> newTreeMap = new TreeMap<>();

        newTreeMap.put(1, 100);
        newTreeMap.put(1, 102);

        newTreeMap.clear();

        assertEquals(true, newTreeMap.isEmpty());
    }

    @org.junit.Test
    public void TestTreeMap4(){
        TreeMap<Integer, String> newTreeMap = new TreeMap<>();

        newTreeMap.put(1,"Dog");
        newTreeMap.put(2, "Cat");
        newTreeMap.put(6, "Bunny");
        newTreeMap.put(4, "Sheep");
        newTreeMap.put(5, "Cow");

        assertEquals("[Dog, Cat, Sheep, Cow, Bunny]", newTreeMap.values().toString());
    }
}
