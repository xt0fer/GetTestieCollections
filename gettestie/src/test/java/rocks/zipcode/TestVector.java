package rocks.zipcode;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVector1(){
        Vector newVector = new Vector();

        newVector.add(1);
        newVector.add(2);
        newVector.add("Dog");
        newVector.add("Cat");

        assertEquals("[1, 2, Dog, Cat]", newVector.toString());
    }

    @org.junit.Test
    public void TestVector2(){
        Vector newVector = new Vector();

        newVector.add(1);
        newVector.add(2);
        newVector.add("Dog");
        newVector.add("Cat");

        assertEquals(true, newVector.contains("Dog"));
    }

    @org.junit.Test
    public void TestVector3(){
        Vector newVector = new Vector();

        newVector.add(1);
        newVector.add(2);
        newVector.add("Dog");
        newVector.add("Cat");

        assertEquals(1, newVector.indexOf(2));
    }

    @org.junit.Test
    public void TestVector4(){
        Vector newVector = new Vector();

        newVector.ensureCapacity(20);

        assertEquals(20, newVector.capacity());
    }
}
