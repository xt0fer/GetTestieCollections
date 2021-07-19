package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void lastIndexTest(){
        //given
        LinkedList<String> strings = new LinkedList<>();
        strings.add("king");
        strings.add("kong");
        strings.add("aint");
        strings.add("got");
        strings.add("ish");

        //when
        String actual = strings.get(strings.size() - 1);
        String expected = "ish";

        //then
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void addsToBackTest(){
        //given
        Integer[] firstThree = {1,2,3};
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addAll(Arrays.asList(firstThree));

        //when
        numbers.add(4);
        Integer[] newNumbers = numbers.toArray(new Integer[0]);

        //then

        Assert.assertEquals(newNumbers[2],firstThree[2]);

    }
}
