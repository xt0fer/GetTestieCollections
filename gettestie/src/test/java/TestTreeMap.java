import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {
    @Test
    public void containsKeyTest(){
        TreeMap<String, String> tMap = new TreeMap<>();
        tMap.put("John", "Song");
        tMap.put("Philly", "Love");
        tMap.put("Zipcode", "Wilmington");

        Boolean expected = true;
        Boolean actual = tMap.containsKey("Philly");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValueTest(){
        TreeMap<String, String> tMap = new TreeMap<>();
        tMap.put("John", "Song");
        tMap.put("Philly", "Love");
        tMap.put("Zipcode", "Wilmington");

        Boolean expected = true;
        Boolean actual = tMap.containsValue("Love");

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void sizeTest(){
        TreeMap<String, String> tMap = new TreeMap<>();

        tMap.put("John", "Song");
        tMap.put("Philly", "Love");
        tMap.put("Zipcode", "Wilmington");

        Integer expected = 3;
        Integer actual = tMap.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        TreeMap<String, String> tMap = new TreeMap<>();
        tMap.put("John", "Song");
        tMap.put("Philly", "Love");
        tMap.put("Zipcode", "Wilmington");

        tMap.clear();

        Boolean expected = true;
        Boolean actual = tMap.isEmpty();

        Assert.assertEquals(expected, actual);
    }
}
