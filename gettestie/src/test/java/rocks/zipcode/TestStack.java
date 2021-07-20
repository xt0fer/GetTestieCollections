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

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestStack2() {
        Stack<String> dinner = new Stack<>();
        dinner.push("cookies");
        dinner.push("milk");
        dinner.pop();

        assertEquals(1, dinner.size());

    }

    @Test
    public void TestStackie3(){
        Stack<String> colores = new Stack<>();
        colores.add("blue");
        colores.add("green");
        colores.add("black");
        colores.add("purple");

        String actual = colores.peek();

        assertEquals("purple", actual);


    }
}





