import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    @Test
    public void getIndexTest(){
        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Song");
        list.add("Bootcamp");
        list.add("Crying");

        String expected = "Crying";
        String actual = list.get(3);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Song");
        list.add("Bootcamp");
        list.add("Crying");

        list.remove("Bootcamp");

        Assert.assertFalse(list.contains("Bootcamp"));
    }

    @Test
    public void containsTest(){
        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Song");
        list.add("Bootcamp");
        list.add("Crying");

        list.contains("Song");

        Assert.assertTrue(list.contains("Song"));
    }

    @Test
    public void addAllTest(){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("John");
        list.add("Song");
        list.add("Bootcamp");
        list.add("Crying");

        list2.add ("Cohort");
        list2.add("Java");
        list2.add("7.1");

        list.addAll(list2);

        Assert.assertTrue(list.containsAll(list));
        System.out.println(list);

    }
}
