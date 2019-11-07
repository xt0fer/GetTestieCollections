package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    TreeMap<Integer, String> treeMap;

    @Before
    public void doThisFirst(){
        treeMap = new TreeMap<>();
    }

    @Test
    public void addTest(){
        treeMap.clear();
        Assert.assertTrue(treeMap.isEmpty());
        treeMap.put(1, "1");
        treeMap.put(2, "2");
        treeMap.put(3, "3");
        treeMap.put(4, "4");
        Assert.assertEquals(4, treeMap.size());
        Assert.assertEquals("1",treeMap.get(1));
        Assert.assertEquals("3",treeMap.get(3));
        Assert.assertFalse(treeMap.isEmpty());
    }

    @Test
    public void removeTest() {
        treeMap.clear();
        treeMap.put(1, "1");
        treeMap.put(2, "2");
        treeMap.put(3, "3");
        treeMap.put(4, "4");
        treeMap.put(4, "not4");

        treeMap.remove(1);
        Assert.assertFalse(treeMap.containsKey(1));

        treeMap.remove(4, "4");
        Assert.assertFalse(treeMap.containsValue("4"));
        Assert.assertTrue(treeMap.containsKey(4));
        Assert.assertTrue(treeMap.containsValue("not4"));
    }
}
