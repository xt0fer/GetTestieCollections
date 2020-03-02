import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Person;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    Person onePerson = new Person("April", 2020);
    Person twoPerson = new Person("Anjie", 2020);

    @Test
    public void testTreeSetFloor() {
        Set<Person> set = new TreeSet<>();
        set.add(onePerson);
        set.add(twoPerson);

        Assert.assertEquals(onePerson,((TreeSet<Person>) set).pollLast());
    }
}
