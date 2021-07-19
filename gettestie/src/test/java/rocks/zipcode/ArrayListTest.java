package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void addTest() {
        ArrayList<Integer> taco = new ArrayList<Integer>();
        taco.add(14);
        boolean actual = taco.contains(14);

        Assert.assertTrue(actual);
    }


    @Test
    public void getSizeTest() {
        ArrayList<Integer> taco = new ArrayList<Integer>();
        Integer tacosize = taco.size();

        Integer expected = 0;

        Assert.assertEquals(expected, tacosize);

    }


}
