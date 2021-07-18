package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @Test
    public void testCompareTo() {
        //given
        Integer number1 = 5;
        Integer number2 = 8;
        int expected = -1;
        //when
        int actual = number1.compareTo(number2);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo2() {
        //given
        Integer number1 = 206;
        Integer number2 = 389;
        int expected = 1;
        //when
        int actual = number2.compareTo(number1);
        //then
        Assert.assertEquals(expected, actual);
    }
}
