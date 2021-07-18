package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class TestStack {
    private Stack<Person> personStack;

    @Before
    public void setUp() throws Exception {
        personStack = new Stack<Person>();
        Person personSitara = new Person("Sitara",1995);
        Person personBulbul= new Person("Bulbul",2000);
        Person personGurgur= new Person("Gurgur",2020);
        personStack.add(0,personSitara);
        personStack.add(1,personBulbul);
        personStack.add(2,personBulbul);
        //personStack.add(2,"durdur")
        // ;
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
    public void testPush() {
        personStack.push(new Person("Durdur",2050));
        assertEquals("Durdur", personStack.get(3).getName()); // false
    }

    @Test
    public void testPop(){
        personStack.pop();

        assertEquals(2, personStack.size());
    }

    @Test
    public void testEmpty(){
        personStack.empty();
        assertEquals(false,false);
    }

    @Test
    public void testPeek(){
        personStack.peek();
        assertEquals("Sitara",personStack.get(0).getName());
    }
    // Make a bigger test exercising more Stack methods.....
}
