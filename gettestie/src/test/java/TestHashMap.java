import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    @Test
    public void  containsTest(){
        HashMap<String, String> map =  new HashMap<>();
        map.put("John", "Song");



        Assert.assertTrue(map.containsKey("John"));

    }

    @Test
    public void removeTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("John", "Song");

        map.remove("John");


        Assert.assertTrue(map.isEmpty());

    }
    @Test
    public void clearTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("John", "Song");

        map.clear();

        Assert.assertTrue(map.isEmpty());
    }


}
