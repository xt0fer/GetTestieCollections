package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void keyOrderTest(){
         //given
        Map<Integer, String > map = new TreeMap<>();

        //when
        map.put(2,"is");
        map.put(3,"the");
        map.put(1,"this");
        map.put(4,"correct");
        map.put(5,"order");

        //then
        System.out.println(map);
    }
}
