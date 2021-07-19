package rocks.zipcode;

import jdk.nashorn.internal.ir.PropertyKey;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    @Test
    public void addTest() {
        HashMap<String, String> taco = new HashMap<String, String>();
        taco.put("Topping", "Guac");

        String expected = "Guac";
        String actual = taco.get("Topping");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clearTest() {
        HashMap<Integer, String> taco = new HashMap<Integer, String>();
        taco.put(1, "Pork");
        taco.put(2, "Beef");
        taco.put(3, "Chicken");

        taco.clear();
        String actual = taco.get(1);
        String expected = null;

        Assert.assertEquals(expected, actual);
    }
}
