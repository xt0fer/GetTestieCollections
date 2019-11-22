package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> stack;
    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>(); //stacks will always have the last in be the first out. LIFO
        stack.push("Hello!");
        stack.push("Devon!");
        stack.push("Kai!");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStackPop(){
        String expected = "Kai!";
        String actual = stack.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestStackPeek(){
        stack.push("I'm the last String!");
        String expected = "I'm the last String!";
        String actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestStackEmpty(){
        stack.push("It's me again!");
        Assert.assertFalse(stack.empty());
    }

    @Test
    public void TestStackSearch(){
        stack.push("Filling");
        stack.push("Some");
        stack.push("Space!");
        Assert.assertEquals(6, stack.search("Hello!"));
    }
}

