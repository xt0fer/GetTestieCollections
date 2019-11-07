package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

public class HashMapTest{
    private HashMap<Integer, String> map;

    @Before
    public void doThisFirst(){
        map = new HashMap<>();
    }

    @Test
    public void addTest(){
        map.clear();
        Assert.assertTrue(map.isEmpty());
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("1",map.get(1));
        Assert.assertEquals("3",map.get(3));
        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void removeTest() {
        map.clear();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(4, "not4");

        map.remove(1);
        Assert.assertFalse(map.containsKey(1));

        map.remove(4, "4");
        Assert.assertFalse(map.containsValue("4"));
        Assert.assertTrue(map.containsKey(4));
        Assert.assertTrue(map.containsValue("not4"));
    }
}
