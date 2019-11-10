package rocks.zipcode;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class TestArrayList {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayList1(){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(0, 1);
        newArrayList.add(1, 2);

        assertEquals(2, newArrayList.size());
    }

    @org.junit.Test
    public void TestArrayList2(){
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("Dog");
        newArrayList.add("Cat");
        newArrayList.add("Cow");
        newArrayList.removeAll(newArrayList);

        assertEquals(true, newArrayList.isEmpty());
    }

    @org.junit.Test
    public void TestArrayList3() {
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("Dog");
        newArrayList.add("Cat");
        newArrayList.add("Cow");

        assertEquals(false, newArrayList.contains("Sheep"));
    }

    @org.junit.Test
    public void TestArrayList4() {
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("Dog");
        newArrayList.add("Cat");
        newArrayList.add("Cow");

        assertEquals("[Dog, Cat]", newArrayList.subList(0, 2).toString());
    }
}
