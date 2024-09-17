package rocks.zipcode;

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
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty()); // false
    }

    @Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.pop();

        assertTrue(stack.contains("Hello"));
    }

    @Test
    public void TestStackPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Manny");
        stack.push("Tired");
        stack.peek();  // Top of stack is Last element put in.

        assertSame("Tired", stack.peek());
    }

    @Test
    public void TestStackIsEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Manny");
        stack.push("Tired");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    // Make a bigger test exercising more Stack methods.....
}
