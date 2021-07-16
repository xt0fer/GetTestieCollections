package rocks.zipcode;

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
    public void TestStack2(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer actual = stack.pop();
        Integer expected = 2;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void TestStack3(){
        Stack<String> stack = new Stack<String>();
        stack.push("you, today?");
        stack.push("How are ");
        stack.push("World, ");
        stack.push("Hello ");
        String actual = stack.pop() + stack.pop() + stack.pop() + stack.pop();
        String expected = "Hello World, How are you, today?";
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void TestStack4(){
        Stack<String> stack = new Stack<String>();
        stack.push("everyone else isn't wrong");
        Integer actual = stack.size();
        Integer expected = 1;
        assertEquals(actual, expected);
    }
}
