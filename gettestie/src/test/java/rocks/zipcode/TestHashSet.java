package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class TestHashSet {
    HashSet<String> testHashset;

    @Before
    public void setUp(){
        testHashset= new HashSet<>();
        testHashset.add("jiga");
        testHashset.add("jaga");
        testHashset.add("juga");
    }

    @Test
    public void testEmpty(){
        assertFalse(testHashset.isEmpty());
    }

    @Test
    public void testContains(){
        assertFalse(testHashset.contains("joga"));
    }
    @Test
    public void testRemove(){
        testHashset.remove("juga");
        assertEquals(2,testHashset.size());
    }
}
