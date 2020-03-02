import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    private ArrayList<Integer> list;
    private Iterator<Integer> iterator;

    Person onePerson = new Person("April", 2020);
    Person twoPerson = new Person("Anjie", 2020);

    List<Person> personsList = new ArrayList<>();

    @Test
    public void TestIterator1() {
        Person onePerson = new Person("April", 2020);
        Person twoPerson = new Person("Anjie", 2020);

        List<Person> personsList = new ArrayList<>();
    }

    @Test
    public void TestIterator2() {
        personsList.add(onePerson);
        personsList.add(twoPerson);
        Iterator<Person> personListIterator = personsList.iterator();
        personListIterator.next();
        Assert.assertEquals(twoPerson, personListIterator.next());
    }

}
