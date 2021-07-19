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
    public void TestStack2(){
        //given
        Stack<String> fruitStack = new Stack<>();
        fruitStack.push("apples");
        fruitStack.push("oranges");
        fruitStack.push("mangoes");

        //when
        fruitStack.remove("apples");
        String firstFruit = fruitStack.firstElement();
        String expected = "oranges";

        //then]
        Assert.assertEquals(expected, firstFruit);
    }

    @Test
    public void TestStack3(){
        //given
        Stack<String> fruitStack = new Stack<>();
        fruitStack.push("apples");
        fruitStack.push("oranges");
        fruitStack.push("mangoes");
        fruitStack.push("bananas");

        //when
        fruitStack.pop();
        String firstFruit = fruitStack.firstElement();
        String expected = "apples";

        //then]
        Assert.assertEquals(expected, firstFruit);
    }

    @Test
    public void TestStack4(){
        //given
        Stack<String> fruitStack = new Stack<>();
        fruitStack.push("apples");
        fruitStack.push("oranges");
        fruitStack.push("mangoes");
        fruitStack.push("bananas");

        //when
        fruitStack.pop(); //removes last element added
        String lastFruit = fruitStack.lastElement();
        String expected = "mangoes";

        //then]
        Assert.assertEquals(expected, lastFruit);
    }

    // Make a bigger test exercising more Stack methods.....
}
