package rocks.zipcode;

import org.junit.Test;

import java.util.TreeSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//NOT WORKIN

public class TestTreeSet {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    @Test
    public void testTreeSetFloor() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        set.add(personTwo);
        assertEquals(personOne,((TreeSet<Person>) set).pollLast());
    }

    @Test
    public void testTreeSetAddSame() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        assertFalse(set.add(personOne));
    }

    @Test
    public void testTreeSetContain() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        assertTrue(set.contains(personOne));
    }

    @Test
    public void testTreeSetNotContain() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        set.remove(personOne);
        assertFalse(set.contains(personOne));
    }

    @Test
    public void testTreeSetRemove() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        assertTrue(set.remove(personOne));
    }

    @Test
    public void testTreeSetRemoveNone() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        assertFalse(set.remove(personTwo));
    }


    @Test
    public void testTreeSetIsNotEmpty() {
        Set<Person> set = new TreeSet<>();
        set.add(personOne);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testTreeSetIsEmpty() {
        Set<Person> set = new TreeSet<>();
        assertTrue(set.isEmpty());
    }
}
