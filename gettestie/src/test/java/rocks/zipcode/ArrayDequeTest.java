package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    @Test
    public void testAdd() {
        //given
        Deque<String> bands = new ArrayDeque<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        //then
        Assert.assertTrue(bands.contains("The Shins"));
        System.out.println(bands);
    }

    @Test
    public void testSize() {
        //given
        int expected = 4;
        Deque<String> bands = new ArrayDeque<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        int actual = bands.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPop() {
        //given
        String expected = "The Strokes";
        Deque<String> bands = new ArrayDeque<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        String actual = bands.pop();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        //given
        String expected = "The Strokes";
        Deque<String> bands = new ArrayDeque<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        String actual = bands.peek();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //given
        String expected = "The Strokes";
        Deque<String> bands = new ArrayDeque<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        String actual = bands.remove();
        //then
        Assert.assertEquals(expected, actual);
        System.out.println(bands);
    }

    @Test
    public void testPush() {
        //given
        Deque<String> bands = new ArrayDeque<>();
        //when
        bands.push("The Strokes");
        bands.push("The Shins");
        bands.push("TV on the Radio");
        bands.push("Car Seat Headrest");
        //then
        Assert.assertTrue(bands.contains("The Shins"));
        System.out.println(bands);
    }

}
