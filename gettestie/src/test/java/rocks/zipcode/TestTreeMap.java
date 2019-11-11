package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;
import java.util.Map;


//Not workin
public class TestTreeMap {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    Address addressZip = new Address("N. Orange St", "Wilmington", "19802", "United States");
    Address addressHome = new Address("38 Emery Circle", "Delmar", "19940", "United States");

    @Test
    public void testTreeMapFirstKey() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        TreeMap.put(personTwo, addressHome);
        Assert.assertEquals(personTwo, ((TreeMap<Person, Address>) TreeMap).firstKey());
    }

    @Test
    public void testTreeMapLastKey() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        TreeMap.put(personTwo, addressHome);
        Assert.assertEquals(personOne, ((TreeMap<Person, Address>) TreeMap).lastKey());
    }


    @Test
    public void testTreeMapPutReturnNull() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        Assert.assertNull(TreeMap.put(personOne, addressZip));
    }

    @Test
    public void testTreeMapPutReturnPrev() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        Assert.assertEquals(addressZip, TreeMap.put(personOne, addressHome));
    }

    @Test
    public void testTreeMapRemove() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        TreeMap.remove(personOne);
        Assert.assertFalse(TreeMap.containsKey(personOne));
    }

    @Test
    public void testTreeMapRemoveReturnNull() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        Assert.assertNull(TreeMap.remove(personOne));
    }

    @Test
    public void testTreeMapRemoveSValue() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        Assert.assertFalse(TreeMap.remove(personOne,addressHome));
    }

    @Test
    public void testTreeMapRemoveSpValueFalse() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        Assert.assertFalse(TreeMap.remove(personOne,addressHome));
    }

    @Test
    public void testTreeMapRemoveSValueTrue() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        Assert.assertTrue(TreeMap.remove(personOne,addressZip));
    }

    @Test
    public void testTreeMapSize() {
        Map<Person, Address> TreeMap = new TreeMap<>();
        TreeMap.put(personOne, addressZip);
        TreeMap.put(personTwo, addressHome);
        TreeMap.remove(personOne);
        Assert.assertEquals(1,TreeMap.size());
    }
}
