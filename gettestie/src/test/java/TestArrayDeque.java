import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

    @Test
    public void isEmptyTest(){
     Deque<String> deck = new ArrayDeque<>();

     deck.add("John");
     deck.add("Song");
     deck.add("Bootcamp");
     deck.add("Java");
     deck.add("7.1");

     deck.clear();

        Assert.assertTrue(deck.isEmpty());
        System.out.println(deck);
    }

    @Test
    public void peekTest(){
        Deque<String> deck = new ArrayDeque<>();

        deck.add("John");
        deck.add("Song");
        deck.add("Bootcamp");
        deck.add("Java");
        deck.add("7.1");


        String expected = "7.1";
        String actual = deck.peekLast();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void elementTest(){
        Deque<String> deck = new ArrayDeque<>();

        deck.add("John");
        deck.add("Song");
        deck.add("Bootcamp");
        deck.add("Java");
        deck.add("7.1");

        String expected = "John";
        String actual = deck.element();

        Assert.assertEquals(expected, actual);
    }



}
