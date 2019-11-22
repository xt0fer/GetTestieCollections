package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.TreeMap;

public class TestTreeMap {
    TreeMap<String, Double> treeMap;

    @Before
    public void setUp(){
        treeMap = new TreeMap<>();
        treeMap.put("Cereal", 5.00);
        treeMap.put("Lasagna", 12.00);
        treeMap.put("Oreos", 4.00);
    }

    @Test
    public void testTreeMapSize1(){
        Assert.assertEquals(3, treeMap.size());
    }

    @Test
    public void testTreeMapSize2(){
        treeMap.put("Pumpkin", 10.00);
        Assert.assertEquals(4, treeMap.size());
    }

    @Test
    public void testTreeMapContainsKey1() {
        String expected = "Cereal";
        Assert.assertTrue(treeMap.containsKey(expected));
    }

    @Test
    public void testTreeMapContainsKey2() {
        String expected = "Granola";
        Assert.assertFalse(treeMap.containsKey(expected));
    }

    @Test
    public void testTreeMapContainsValue1(){
            Double expected = 5.00;
            Assert.assertTrue(treeMap.containsValue(expected));
    }

    @Test
    public void testTreeMapContainsValue2(){
        Double expected = 80.00;
        Assert.assertFalse(treeMap.containsValue(expected));
    }

    @Test
    public void testTreeMapClear1(){
        treeMap.clear();
        Assert.assertFalse(treeMap.containsKey("Oreos"));
    }

    @Test
    public void testTreeMapClear2(){
        Assert.assertTrue(treeMap.containsKey("Oreos"));
    }

}
