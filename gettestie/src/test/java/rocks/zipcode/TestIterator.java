package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TestIterator {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    List<Person> peopleList = new ArrayList<>();

    @Test
    public void TestIterator() {
        peopleList.add(personOne);
        peopleList.add(personTwo);
        Iterator<Person> personListIterator = peopleList.iterator();
        Assert.assertEquals(personOne, personListIterator.next());
    }

    @Test
    public void TestIteratorTwo() {
        peopleList.add(personOne);
        peopleList.add(personTwo);
        Iterator<Person> personListIterator = peopleList.iterator();
        personListIterator.next();
        Assert.assertEquals(personTwo, personListIterator.next());
    }

    @Test(expected = NoSuchElementException.class)
    public void TestIteratorException() {
        peopleList.add(personOne);
        peopleList.add(personTwo);
        Iterator<Person> personListIterator = peopleList.iterator();
        personListIterator.next();
        personListIterator.next();
        personListIterator.next();
    }
    @Test
    public void TestIteratorHasNext() {
        peopleList.add(personOne);
        peopleList.add(personTwo);

        Iterator<Person> personListIterator = peopleList.iterator();
        personListIterator.next();
        Assert.assertTrue(personListIterator.hasNext());
    }

    @Test
    public void TestIteratorHasNoNext() {
        peopleList.add(personOne);
        peopleList.add(personTwo);

        Iterator<Person> personListIterator = peopleList.iterator();
        personListIterator.next();
        personListIterator.next();
        Assert.assertFalse(personListIterator.hasNext());
    }
}
