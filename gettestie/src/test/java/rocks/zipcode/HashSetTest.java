package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    @Test
    public void testAdd() {
        //given
        Set<String> bands = new HashSet<>();
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
    public void testContains(){
        //given
        Set<String> bands = new HashSet<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        //then
        Assert.assertTrue(bands.contains("Car Seat Headrest"));
        System.out.println(bands);
    }

    @Test
    public void testRemove() {
        //given
        Set<String> wine = new HashSet<>();
        //when
        wine.add("Cabernet Savignon");
        wine.add("Pino Noir");
        wine.add("Zinfandel");
        wine.add("Malbec");
        wine.remove("Zinfandel");
        //then
        Assert.assertFalse(wine.contains("Zinfandel"));
        System.out.println(wine);
    }

    @Test
    public void testSize() {
        //given
        int expected = 4;
        Set<String> drinks = new HashSet<>();
        //when
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("water");
        drinks.add("wine");
        int actual = drinks.size();
        //then
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    public void testIsEmpty() {
        //given
        Set<String> tea = new HashSet<>();
        //when
        tea.add("Japanese sencha");
        tea.add("Oolong");
        tea.add("Darjeeling");
        tea.add("Purreh");
        //then
        Assert.assertFalse(tea.isEmpty());
    }
}
