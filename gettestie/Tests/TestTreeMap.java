import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Address;
import rocks.zipcode.Person;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    Person onePerson = new Person("April", 2020);
    Person twoPerson = new Person("Jolly", 2020);

    Address workAddress = new Address("joly", "Wilmington", "28942", "United States");
    Address homeAddress = new Address("Ivy Rd", "Jumpy", "24892", "United States");

    @Test
    public void setUp() throws Exception {
    }

    @Test
    public void tearDown() throws Exception {
    }

    @Test
    public void testTreeMapRemoveReturnNull() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        Assert.assertNull(TreeMap.remove(onePerson));
    }

    @Test
    public void testTreeMapSize() {
        TreeMap<Integer, String> newTreeMap = new TreeMap<>();
        newTreeMap.put(1, "Lizard");
        newTreeMap.put(2, "Cat");
        newTreeMap.put(3, "Frog");
        Assert.assertEquals("[3, 2, 1]", newTreeMap.descendingKeySet().toString());
    }
    @Test
    public void testTreeMap() {
            TreeMap<Integer, Integer> newTreeMap = new TreeMap<>();

            newTreeMap.put(1, 1000);
            newTreeMap.put(1, 1004);

            newTreeMap.clear();

            Assert.assertEquals(true, newTreeMap.isEmpty());
        }
    }

