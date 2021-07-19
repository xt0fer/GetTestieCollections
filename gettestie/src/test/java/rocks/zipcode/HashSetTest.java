package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    @Test
    public void containsTest() {
        HashSet<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Ferrari");

        boolean expected = cars.contains("Toyota");
        boolean actual = true;

        Assert.assertTrue(expected);
    }

    @Test
    public void remove() {
        HashSet<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Ferrari");

        cars.remove("Honda");

        Integer expected = 3;
        Integer actual = cars.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        HashSet<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Ferrari");

        cars.add("BMW");

        Integer expected = 4;
        Integer actual = cars.size();

        Assert.assertEquals(expected, actual);
    }
}
