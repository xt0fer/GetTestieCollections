package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @Test
    public void testAdd() {
        //given
        List<String> bands = new ArrayList<>();
        //when
        bands.add("The Strokes");
        bands.add("The Shins");
        bands.add("TV on the Radio");
        bands.add("Car Seat Headrest");
        String actual = bands.get(1);
        //then
        Assert.assertTrue(bands.contains("The Shins"));
        System.out.println(bands);
    }

    @Test
    public void testGet() {
        //given
        String expected = "Breaking Bad";
        List<String> tvShows = new ArrayList<>();
        //when
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("LetterKenny");
        tvShows.add("Dexter");
        String actual = tvShows.get(0);
        //then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void testRemove() {
        //given
        List<String> wine = new ArrayList<>();
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
        List<String> drinks = new ArrayList<>();
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
    public void testGetIndexOf() {
        //given
        int expected = 1;
        List<String> tea = new ArrayList<>();
        //when
        tea.add("Japanese sencha");
        tea.add("Oolong");
        tea.add("Darjeeling");
        tea.add("Purreh");
        int actual = tea.indexOf("Oolong");
        //then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

}
