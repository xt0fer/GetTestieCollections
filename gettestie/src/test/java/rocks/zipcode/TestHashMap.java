package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    HashMap<String, String> hashMap;

    @Before
    public void setUp(){
        hashMap = new HashMap<>();
        hashMap.put("Bird", "Blue Jay");
        hashMap.put("Christmas", "Presents");
        hashMap.put("ZipCoder", "Kai");
    }

    @Test
    public void testHashMapSize1(){
        Assert.assertEquals(3, hashMap.size());
    }


    @Test
    public void testHashMapSize2(){
        hashMap.put("Cat", "Tabby");
        Assert.assertEquals(4, hashMap.size());
    }

    @Test
    public void testHashMapIsEmpty(){
        Assert.assertFalse(hashMap.isEmpty());
    }

    @Test
    public void testHashMapClear(){
        hashMap.clear();
        Assert.assertTrue(hashMap.isEmpty());
    }

    @Test
    public void testHashMapContainsKey1(){
        Assert.assertTrue(hashMap.containsKey("Bird"));
    }

    @Test
    public void testHashMapContainsKey2(){
        Assert.assertFalse(hashMap.containsKey("Dog"));
    }

    @Test
    public void testHashMapContainsValue1(){
        Assert.assertFalse(hashMap.containsValue("Bird"));
    }

    @Test
    public void testHashMapContainsValue2(){
        Assert.assertTrue(hashMap.containsValue("Kai"));
    }

    @Test
    public void testHashMapRemove(){
        hashMap.remove("Bird", "Blue Jay");
        Assert.assertFalse(hashMap.containsKey("Bird"));
    }

    @Test
    public void testHashMapReplace(){
        String expectedToReplace = "Kai";
        String actualReplacement = hashMap.replace("ZipCoder", "Kendra");
        Assert.assertEquals(expectedToReplace, actualReplacement);
    }
}
