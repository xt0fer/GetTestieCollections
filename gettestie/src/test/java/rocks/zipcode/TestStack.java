package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void pushTest() {
        Stack<Integer> momo = new Stack<>();
        momo.push(69);

        Integer actual = momo.elementAt(0);
        Integer expected = 69;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void popTest() {
        Stack<Integer> momo = new Stack<>();
        momo.add(0,5);
        momo.add(1,3);
        momo.add(2,1);

        Integer actual =  momo.pop();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }

    // Make a bigger test exercising more Stack methods.....
}
