import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestIterator {

    @Test
    public void containsTest(){
        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Song");
        list.add("Cohort");
        list.add("memes");

        Boolean expected = true;
        Boolean actual = list.contains("memes");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextTest(){
        ArrayList<String> list = new ArrayList<>();


        list.add("John");
        list.add("Song");
        list.add("Cohort");
        list.add("memes");
        ListIterator<String> iterate = list.listIterator();

        String expected = "John";
        String actual = iterate.next();

        Assert.assertEquals(expected, actual);

    }
}
