package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Test
    public void testStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void peekTest(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        //.peek() only returns the most recent value WITHOUT removing it from the stack.
        assertEquals((Integer) 2, stack.peek());
    }

    @Test
    public void popTest(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //.pop() returns the most recent value pushed onto the stack AND removes it from the stack.
        assertEquals((Integer) 3, stack.pop());
        assertEquals((Integer) 2, stack.peek());
    }
}
