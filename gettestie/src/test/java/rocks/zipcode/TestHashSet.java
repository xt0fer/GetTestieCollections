package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestHashSet {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    @Test
    public void testHashSetAdd() {
        Set<Person> set = new HashSet<>();
        assertTrue(set.add(personOne));
    }

    @Test
    public void testHashSetAddSame() {
        Set<Person> set = new HashSet<>();
        set.add(personOne);
        assertFalse(set.add(personOne));
    }

    @Test
    public void testHashSetContain() {
        Set<Person> set = new HashSet<>();
        set.add(personOne);
        assertTrue(set.contains(personOne));
    }

    @Test
    public void testHashSetNotContain() {
        Set<Person> set = new HashSet<>();
        set.add(personOne);
        set.remove(personOne);
        assertFalse(set.contains(personOne));
    }

    @Test
    public void testHashSetRemove() {
        Set<Person> set = new HashSet<>();
        set.add(personOne);
        assertTrue(set.remove(personOne));
    }

    @Test
    public void testHashSetRemoveNone() {
        Set<Person> set = new HashSet<>();
        set.add(personOne);
        assertFalse(set.remove(personTwo));
    }


    @Test
    public void testHashSetIsNotEmpty() {
        Set<Person> set = new HashSet<>();
        set.add(personOne);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testHashSetIsEmpty() {
        Set<Person> set = new HashSet<>();
        assertTrue(set.isEmpty());
    }
}
