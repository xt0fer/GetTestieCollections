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
     public void popTest(){
        Stack<String> stack = new Stack<>();
        stack.push("Hi, my name is John");
        stack.pop();
        Assert.assertEquals(true, stack.isEmpty());
    }
    @Test
    public void peekTest(){
        Stack<String> stack = new Stack<>();
        stack.push("John");
        stack.push("Song");

        String expected = "John";
        String actual = stack.peek();

        Assert.assertEquals(expected, actual);
    }




}
