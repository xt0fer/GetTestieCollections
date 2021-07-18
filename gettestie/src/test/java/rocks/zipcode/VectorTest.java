package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void testAdd() {
        //given
        Vector<Integer> numbers = new Vector<Integer>();
        //when
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);
        //then
        Assert.assertTrue(numbers.contains(3));
    }

    @Test
    public void testRemove() {
        //given
        Vector<Integer> numbers = new Vector<Integer>();
        //when
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);
        numbers.remove(3);
        //then
        Assert.assertFalse(numbers.contains(7));
        System.out.println(numbers);
    }

    @Test
    public void testIndexOf() {
        //given
        int expected = 2;
        Vector<Integer> numbers = new Vector<Integer>();
        //when
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);
        int actual = numbers.indexOf(8);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        //given
        Vector<Integer> numbers = new Vector<Integer>();
        //when
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);
        numbers.clear();
        //then
        Assert.assertTrue(numbers.isEmpty());
    }
}
