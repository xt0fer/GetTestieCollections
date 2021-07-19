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

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void popTest(){
        //given
        Stack<String> stack = new Stack<>();


        //when
        stack.push("king");
        stack.push("kong");
        stack.push("aint");
        stack.push("got");
        stack.push("ish");

        String expected = stack.pop();
        String actual = "ish";

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void peekTest(){
        //given
        Stack<Integer> stack = new Stack<>();

        //when
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Integer expected = stack.pop();
        Integer actual = 5;

        //then
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void isEmptyTest(){
        //given
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //when
        stack.clear();

        //then
        Assert.assertTrue(stack.isEmpty());
    }
}
