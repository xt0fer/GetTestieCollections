package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void testPush() {
        //given
        String expected = "Dexter";
        Stack<String> tvShows = new Stack<>();
        //when
        tvShows.push("Breaking Bad");
        tvShows.push("Game of Thrones");
        tvShows.push("LetterKenny");
        tvShows.push("Dexter");
        //then
        Assert.assertTrue(tvShows.contains("LetterKenny"));
    }

    @Test
    public void testPeek() {
        //given
        String expected = "Dexter";
        Stack<String> tvShows = new Stack<>();
        //when
        tvShows.push("Breaking Bad");
        tvShows.push("Game of Thrones");
        tvShows.push("LetterKenny");
        tvShows.push("Dexter");
        String actual= tvShows.peek();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPop() {
        //given
        String expected = "Dexter";
        Stack<String> tvShows = new Stack<>();
        //when
        tvShows.push("Breaking Bad");
        tvShows.push("Game of Thrones");
        tvShows.push("LetterKenny");
        tvShows.push("Dexter");
        String actual= tvShows.pop();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIsEmpty() {
        //given
        Stack<String> tvShows = new Stack<>();
        //when
        tvShows.push("Breaking Bad");
        tvShows.push("Game of Thrones");
        tvShows.push("LetterKenny");
        tvShows.push("Dexter");
        //then
        Assert.assertFalse(tvShows.isEmpty());
    }
}
