package rocks.zipcode;

import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestTreeSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeSet1(){
        TreeSet newTreeSet = new TreeSet();

        newTreeSet.add(109);
        newTreeSet.add(100);
        newTreeSet.add(200);

        assertEquals(100, newTreeSet.first());
    }

    @org.junit.Test
    public void TestTreeSet2(){
        TreeSet<Integer> newTreeSet = new TreeSet<>();

        newTreeSet.add(109);
        newTreeSet.add(100);
        newTreeSet.add(200);
        newTreeSet.add(400);

        assertEquals("[100, 109]", newTreeSet.headSet(200).toString());
    }

    @org.junit.Test
    public void TestTreeSet3(){
        TreeSet<String> newTreeSet = new TreeSet<>();

        newTreeSet.add("Item1");
        newTreeSet.add("Item2");

        assertEquals(true, newTreeSet.remove("Item2"));
    }

    @org.junit.Test
    public void TestTreeSet4(){
        TreeSet<Integer> newTreeSet = new TreeSet<>();

        newTreeSet.add(999);
        newTreeSet.add(100);

        assertEquals(2, newTreeSet.size());
    }
}
