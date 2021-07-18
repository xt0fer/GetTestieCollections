package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.HashMap;

public class TestHashMap {
    HashMap<String,Integer>testHashMap;
    @Before
    public void setUp(){
        testHashMap= new HashMap<>();
        testHashMap.put("one",1);
        testHashMap.put("two",2);
        testHashMap.put("three",3);
    }


    @Test
    public void testIsEmpty(){
        assertEquals(false,false);
    }

    @Test
    public void setTestSize(){
        assertEquals(3,testHashMap.size());
    }

    @Test
    public void testContains(){
        assertEquals(true,testHashMap.containsKey("one"));
        assertEquals(true,testHashMap.containsValue(1));
    }
@Test
    public void testRemove(){
        testHashMap.remove("one",1);
        assertEquals(2,testHashMap.size());
}
@Test
    public void testReplace(){
        testHashMap.replace("two",4);
        assertEquals(true,testHashMap.containsValue(4));
}
@Test
    public void testClear(){
        testHashMap.clear();
        assertEquals(true,testHashMap.isEmpty());
}
}
