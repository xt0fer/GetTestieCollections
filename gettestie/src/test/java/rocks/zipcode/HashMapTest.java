package rocks.zipcode;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    @Test
    public void clearTest(){
        //given
        Map<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        //when
        map.clear();

        //then
        Assert.assertTrue(map.isEmpty());
    }
    @Test
    public void containsTest(){
        //given
        Map<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        //when
        Boolean twoExists = map.containsKey("Two");
        Boolean oneExists = map.containsValue(1);

        //then
        Assert.assertTrue(twoExists);
        Assert.assertTrue(oneExists);
    }
}
