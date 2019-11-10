package rocks.zipcode;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSet1(){
        HashSet<String> newHashSet = new HashSet<>();
        newHashSet.add("Dog");
        newHashSet.add("Cat");
        newHashSet.add("Dog");

        assertEquals("[Cat, Dog]", newHashSet.toString());
    }

    @org.junit.Test
    public void TestHashSet2(){
        HashSet<Integer> newHashSet = new HashSet<>();
        newHashSet.add(1);
        newHashSet.add(2);
        newHashSet.add(1);

        newHashSet.remove(2);

        assertEquals(1, newHashSet.size());
    }

    @org.junit.Test
    public void TestHashSet3(){
        String[] newArray = {"One", "Two", "One", "Three", "Four"};
        HashSet<String> newHashSet = new HashSet<>(Arrays.asList(newArray));

        assertEquals(4, newHashSet.size());
    }

    @org.junit.Test
    public void TestHashSet4(){
            String[] newArray = {"One", "Two", "Three", "Four"};
            HashSet<String> newHashSet = new HashSet<>(Arrays.asList(newArray));

            assertEquals(false, newHashSet.contains("Five"));

    }



}
