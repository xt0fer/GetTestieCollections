package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    @Test
    public void noDuplicatesTest(){
        //given
        String[] words = {"king", "kong", "aint", "got", "ish", "on ", "me"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        //when
        set.add("king");
        String[] newWords = set.toArray(new String[0]);
        //then
        Assert.assertEquals(words.length, newWords.length);
    }
}
