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
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals(3, stack.size());
    }

    @org.junit.Test
    public void TestStack3(){
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.pop();

        assertEquals("b", stack.peek());
    }

    @org.junit.Test
    public void TestStack4(){
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.pop();

        assertEquals(0, stack.size());
    }

}
