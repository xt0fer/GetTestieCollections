package rocks.zipcode;

import org.junit.Assert;

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

    // Make a bigger test exercising more Stack methods.....

    @org.junit.Test
    public void testPeek(){
        Stack<String> stack1 = new Stack<>();
        stack1.push("Dog");
        stack1.push("Cat");
        stack1.push("Bird");
        String retrieved = stack1.peek();
        Assert.assertEquals("Bird",retrieved);
    }

    @org.junit.Test
    public void testPop(){
        Stack<String> stack1 = new Stack<>();
        stack1.push("Dog");
        stack1.push("Cat");
        stack1.push("Bird");
        stack1.pop();
        String retrieved = stack1.peek();
        Assert.assertEquals("Cat",retrieved);
    }

    @org.junit.Test
    public void testIsEmpty(){
        Stack<String> stack1 = new Stack<>();
        stack1.push("Dog");
        stack1.push("Cat");
        stack1.push("Bird");
        Assert.assertFalse(stack1.isEmpty());
    }

    @org.junit.Test
    public void testSearch(){
        Stack<String> stack1 = new Stack<>();
        stack1.push("Dog");
        stack1.push("Cat");
        stack1.push("Bird");
        stack1.push("Snake");
        Integer expected = 4;
        Integer actual = stack1.search("Dog");
        Assert.assertEquals(expected,actual);
    }


}
