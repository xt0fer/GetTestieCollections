package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @Test
    public void compareToTest() {
       Integer cat = 100;
       Integer dog = 200;

       Integer expected = +1;
       Integer actual = dog.compareTo(cat);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void compareToTest2() {
        Integer cat = 1100;
        Integer dog = 200;

        Integer expected = -1;
        Integer actual = dog.compareTo(cat);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void compareToTest3() {
        Integer cat = 1100;
        Integer dog = 1100;

        Integer expected = 0;
        Integer actual = dog.compareTo(cat);

        Assert.assertEquals(expected,actual);
    }
}
