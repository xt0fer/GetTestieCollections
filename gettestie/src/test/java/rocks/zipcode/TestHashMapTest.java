package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.TestHashMap;
import org.junit.Assert;
import org.junit.Test;

public class TestHashMapTest {

    @Test
    public void hMapTest1() {
        TestHashMap hMap = new TestHashMap();

        hMap.getHashMap().clear();
        Integer expected = 0;
        Integer actual = hMap.getHashMap().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hMapTest2(){
        TestHashMap hMap = new TestHashMap();

        hMap.getHashMap().put("element10", 10);
        Integer actual = hMap.getHashMap().get("element10");
        Integer expected = 10;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void hMapTest3(){
        TestHashMap hMap = new TestHashMap();

        Boolean actual = hMap.getHashMap().containsKey("element9");

        Assert.assertTrue(actual);
    }
}
