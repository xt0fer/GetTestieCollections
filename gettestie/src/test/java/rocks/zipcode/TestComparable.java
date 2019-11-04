package rocks.zipcode;

import static org.junit.Assert.assertEquals;

public class TestComparable {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestComparable1(){

        String string1 = "Hello";
        String string2 = "Hello!";

        assertEquals(-1, string1.compareTo(string2));
    }

    @org.junit.Test
    public void TestComparable2(){

        Integer num1 = 1000;
        Integer num2 = 1000;

        assertEquals(0, num2.compareTo(num1));
    }

    @org.junit.Test
    public void TestComparable3(){

        String string1 = "Hello world";
        String string2 = "Hello world!";

        assertEquals(1, string2.compareTo(string1));
    }
}
