import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeSet {
    @Test
    public void containsTest(){
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("John");
        tSet.add("Song");
        tSet.add("Bootcamp");
        tSet.add("Struggles");

        Assert.assertTrue(tSet.contains("Bootcamp"));
    }

    @Test
    public void removeTest(){
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("John");
        tSet.add("Song");
        tSet.add("Bootcamp");
        tSet.add("Struggles");

        tSet.remove("Struggles");

        Assert.assertFalse(tSet.contains("Struggles"));
    }

    @Test
    public void sizeTest(){
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("John");
        tSet.add("Song");
        tSet.add("Bootcamp");
        tSet.add("Struggles");

        Integer expected = 4;
        Integer actual = tSet.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLast(){
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("John");
        tSet.add("Song");
        tSet.add("Bootcamp");
        tSet.add("Struggles");

        String expected = "Struggles";
        String actual = tSet.last();

        Assert.assertEquals(expected, actual);
    }
}
