package rocks.zipcode;

import org.junit.Test;

import java.util.Vector;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestVector {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    @Test
    public void testVectorAdd() {
        List<Person> Vector = new Vector<>();
        assertTrue(Vector.add(personOne));
    }

    @Test
    public void testVectorAddIndex() {
        List<Person> Vector = new Vector<>();
        Vector.add(personOne);
        Vector.add(0, personTwo);
        assertEquals(personTwo, Vector.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testVectorAddIndexException() {
        List<Person> Vector = new Vector<>();
        Vector.add(1, personOne);
    }

    @Test
    public void testVectorRemoveIndex() {
        List<Person> Vector = new Vector<>();
        Vector.add(personOne);
        assertEquals(personOne, Vector.remove(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testVectorRemoveIndexException() {
        List<Person> Vector = new Vector<>();
        Vector.remove(0);
    }

    @Test
    public void testVectorRemove() {
        List<Person> Vector = new Vector<>();
        Vector.add(personOne);
        assertTrue(Vector.remove(personOne));
    }

    @Test
    public void testVectorRemoveNotThere() {
        List<Person> Vector = new Vector<>();
        Vector.add(personOne);
        assertFalse(Vector.remove(personTwo));
    }

    @Test
    public void testVectorClear() {
        List<Person> Vector = new Vector<>();
        Vector.add(personOne);
        Vector.add(personTwo);
        Vector.clear();
        assertTrue(Vector.isEmpty());
    }

    @Test
    public void testVectorAddAll() {
        List<Person> Vector = new Vector<>();
        List<Person> Vector2 = new Vector<>();
        Vector2.add(personTwo);
        Vector2.add(personOne);
        Vector.addAll(Vector2);
        assertEquals(Vector,Vector2);
    }

    @Test(expected = NullPointerException.class)
    public void testVectorAddAllNull() {
        List<Person> Vector = new Vector<>();
        assertTrue(Vector.addAll(null));
    }

    @Test
    public void testVectorSize() {
        List<Person> Vector = new Vector<>();
        Vector.add(personOne);
        Vector.add(personOne);
        assertEquals(2, Vector.size());
    }
}
