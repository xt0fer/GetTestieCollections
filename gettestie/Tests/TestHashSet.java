import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Person;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    Person onePerson = new Person("Cameron", 2020);
    Person twoPerson = new Person("Anjie", 2020);

    @Test
    public void testHashSetAdd() {
        Set<Person> set = new HashSet<>();
        Assert.assertTrue(set.add(onePerson));
    }

    public void testHashSetContains() {
        Set<Person> set = new HashSet<>();
        set.add(onePerson);
        Assert.assertTrue(set.add(onePerson));
    }
}
