package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.TestArrayDeque;
import org.junit.Assert;
import org.junit.Test;

public class TestDequeTest {

    @Test
    public void dequeTest1(){
        TestArrayDeque dq = new TestArrayDeque();

        Integer actual = dq.getaDeque().peek();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dequeTest2(){
        TestArrayDeque dq = new TestArrayDeque();

        Integer actual = dq.getaDeque().pop();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dequeTest3(){
        TestArrayDeque dq = new TestArrayDeque();

        dq.getaDeque().push(200);
        Integer actual = dq.getaDeque().pop();
        Integer expected = 200;

        Assert.assertEquals(expected, actual);
    }
}
