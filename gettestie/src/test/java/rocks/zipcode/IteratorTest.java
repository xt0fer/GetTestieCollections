package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void testHasNext() {
        //given
        List<String> tvShows = new ArrayList<>();
        //when
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("LetterKenny");
        tvShows.add("Dexter");
        Iterator<String> shows = tvShows.iterator();
        //then
        Assert.assertTrue(shows.hasNext());
    }

    @Test
    public void testNext() {
        //given
        String expected = "Breaking Bad";
        List<String> tvShows = new ArrayList<>();
        //when
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("LetterKenny");
        tvShows.add("Dexter");
        Iterator<String> shows = tvShows.iterator();
        String actual = shows.next();
        //then
        Assert.assertEquals(expected, actual);
    }
}
