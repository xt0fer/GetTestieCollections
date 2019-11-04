package rocks.zipcode;

import java.util.Iterator;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;

public class TestIterator {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIterator1(){
        TreeSet<String> newTreeSet = new TreeSet<>();
        newTreeSet.add("Dog");
        newTreeSet.add("Cat");
        newTreeSet.add("Cow");

        Iterator<String> iterator = newTreeSet.iterator();

        assertEquals("Cat", newTreeSet.iterator().next());

    }

    @org.junit.Test
    public void TestIterator2(){
        TreeSet<String> newTreeSet = new TreeSet<>();
        newTreeSet.add("Dog");
        newTreeSet.add("Cat");
        newTreeSet.add("Cow");

        Iterator<String> iterator = newTreeSet.iterator();

        assertEquals(true, newTreeSet.iterator().hasNext());
    }

}
