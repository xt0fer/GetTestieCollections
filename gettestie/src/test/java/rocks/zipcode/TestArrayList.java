package rocks.zipcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestArrayList {
    private ArrayList<String> testArray;

    @Before
    public void setup() throws Exception{
        testArray=new ArrayList<String>();
        testArray.add("yello");
        testArray.add("bello");
        testArray.add("gello");
        testArray.add("fello");

    }
    @Test
    public void testAdd(){
        testArray.add("cello");
        assertEquals(5,testArray.size());

    }

    @Test
    public void testContains(){
        assertTrue("bello",testArray.contains("bello"));
    }

    @Test
    public void testRemove(){
        testArray.remove(0);
        assertEquals("bello",testArray.get(0));
    }
    @Test
    public void testAddAll(){
        ArrayList<String>testArray2 = new ArrayList<>();
        testArray2.add("yello");
        testArray2.add("kello");
        testArray.addAll(2,testArray2);
        assertEquals("yello",testArray.get(2));
    }

    @Test
    public void testReverse(){
        Collections.reverse(testArray);
        assertEquals("bello",testArray.get(2));
    }
    @Test
    public void TestSubList(){
        List<String> testList=testArray.subList(2,4);
        assertEquals(testArray.get(2),testList.get(0));
    }
    @Test
    public void Testindex(){
        assertEquals("yello",testArray.get(0));
    }
}
