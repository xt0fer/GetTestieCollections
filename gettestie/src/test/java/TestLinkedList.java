import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void getLastTest(){
        LinkedList<String> list= new LinkedList<>();

        list.add("John");
        list.add("Song");
        list.add("Philly");
        list.add("Brotherly");
        list.add("Love");

        String expected = "Love";
        String actual = list.getLast();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest(){
        LinkedList<String> list= new LinkedList<>();

        list.add("John");
        list.add("Song");
        list.add("Philly");
        list.add("Brotherly");
        list.add("Love");

        String expected = "Philly";
        String actual = list.set(2, "John"); //[John, Song, John, Brotherly, Love]

        Assert.assertEquals(expected,actual);
        System.out.println(list);


    }
    @Test
    public void peekTest(){
        LinkedList<String> list= new LinkedList<>();

        list.add("John");
        list.add("Song");
        list.add("Philly");
        list.add("Brotherly");
        list.add("Love");

        String expected = "John";
        String actual = list.peek();

        Assert.assertEquals(expected, actual);

    }
}
