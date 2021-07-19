package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    @Test
    public void addElementTest(){
        //given
        ArrayList<Integer> numbas = new ArrayList<>();

        //when
        numbas.add(3);
        numbas.add(4);
        numbas.add(2);

        Integer[] newNumbas = new Integer[numbas.size()];

        //then
        Assert.assertEquals(newNumbas.length, numbas.size());
    }
    @Test
    public void removeElementTest(){
        //given
        String[] words = {"king", "kong", "aint", "got", "ish", "on", "me"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(words));

        //when
        strings.remove(strings.get(3));
        String[] newArray = strings.toArray((new String[0]));

        //then
        Assert.assertEquals(words.length,newArray.length + 1);

    }
}
