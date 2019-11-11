package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestArrayList {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    @Test
    public void testArrayListSize() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(personOne);
        arrayList.add(personOne);
        assertEquals(2, arrayList.size());
    }

    @Test
    public void testArrayListAdd() {
        List<Person> arrayList = new ArrayList<>();
        assertTrue(arrayList.add(personOne));
    }

    @Test
    public void testArrayListAddIndex() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(personOne);
        arrayList.add(0, personTwo);
        assertEquals(personTwo, arrayList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testArrayListAddIndexException(){
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(1, personOne);
    }

    @Test
    public void testArrayListRemove() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(personOne);
        assertTrue(arrayList.remove(personOne));
    }

    @Test
    public void testArrayListRemoveNonexistent() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(personOne);
        assertFalse(arrayList.remove(personTwo));
    }

    @Test
    public void testArrayListRemoveIndex(){
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(personOne);
        assertEquals(personOne, arrayList.remove(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testArrayListRemoveIndexException() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.remove(0);
    }

    @Test
    public void testArrayListClear() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(personOne);
        arrayList.add(personTwo);
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testArrayListAddAll() {
        List<Person> arrayListOne = new ArrayList<>();
        List<Person> arrayListTwo = new ArrayList<>();
        arrayListTwo.add(personOne);
        arrayListTwo.add(personTwo);
        arrayListOne.addAll(arrayListTwo);
        assertEquals(arrayListOne, arrayListTwo);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayListAddAllNull() {
        List<Person> arrayList = new ArrayList<>();
        assertTrue(arrayList.addAll(null));
    }

}
