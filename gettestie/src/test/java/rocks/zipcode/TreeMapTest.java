package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void replaceTest() {
        TreeMap<Integer, String> dog = new TreeMap<Integer, String>();
        dog.put(1, "Rosie");
        dog.put(2, "Ryan");
        dog.put(3, "Taco");
        dog.put(4, "tagi");

        dog.replace(3, "Garfield");

        String actual = dog.get(3);
        String expected = "Garfield";

        Assert.assertEquals(expected, actual);

        }
    }
