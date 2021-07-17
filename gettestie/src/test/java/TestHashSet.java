import org.junit.Assert;
import org.junit.Test;


import java.util.HashSet;

public class TestHashSet {
    @Test
    public void containsTest(){
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("Song");
        set.add("Bootcamp");
        set.add("Struggles");

        Assert.assertFalse(set.contains("bb"));
        Assert.assertTrue(set.contains("Struggles"));
    }

    @Test
    public void removeTest(){
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("Song");
        set.add("Bootcamp");
        set.add("Struggles");

        set.remove("Bootcamp");

        Assert.assertFalse(set.contains("Bootcamp"));
    }

    @Test
    public void sizeTest(){
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("Song");
        set.add("Bootcamp");
        set.add("Struggles");

        Integer expected = 4;
        Integer actual = set.size();



        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("Song");
        set.add("Bootcamp");
        set.add("Struggles");

        set.clear();
       Integer expected = 0;
       Integer actual = set.size();


       Assert.assertEquals(expected, actual);
        Assert.assertTrue(set.isEmpty());
    }
}
