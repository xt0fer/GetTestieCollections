import jdk.nashorn.internal.IntDeque;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class TestStack {


    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    @Test
    public void TestStackEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("It's a Monday");
        Assert.assertFalse(stack.empty());
    }

    @Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hi");
        String expected = "Hi";
        String actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }
}
