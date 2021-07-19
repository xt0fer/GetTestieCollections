package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {

    @Test
    public void linkedListTest(){
        //given
        LinkedList<String> favWords = new LinkedList<>();
        String word1 = "germane";
        String word2 = "residual";
        String word3 = "facetious";

        //when
        favWords.add(word1);
        favWords.add(word2);
        favWords.add(word3);
        String actual = favWords.peek(); //gets first without removing
        int size = favWords.size();

        //then
        Assert.assertEquals(word1, actual);
        Assert.assertEquals(3, size);
    }

    @Test
    public void QueueTest(){
        //given
        LinkedList<String> favWords = new LinkedList<>();
        String word1 = "germane";
        String word2 = "residual";
        String word3 = "facetious";

        //when
        favWords.add(word1);
        favWords.add(word2);
        favWords.add(word3);
        String pollWord = favWords.poll(); //gets AND removes first word
        int size = favWords.size();

        //then
        Assert.assertEquals(word1, pollWord);
        Assert.assertEquals(2, size); //reduces size by 1
    }
}
