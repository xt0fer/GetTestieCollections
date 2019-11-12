package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    Address addressZip = new Address("N. Orange St", "Wilmington", "19802", "United States");
    Address addressHome = new Address("38 Emery Circle", "Delmar", "19940", "United States");

    @Test
    public void testHashMapPut() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        Assert.assertEquals(addressZip, hashMap.get(personOne));
    }

    @Test
    public void testHashMapPutReturnNull() {
        Map<Person, Address> hashMap = new HashMap<>();
        Assert.assertNull(hashMap.put(personOne, addressZip));
    }

    @Test
    public void testHashMapPutReturnPrev() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        Assert.assertEquals(addressZip, hashMap.put(personOne, addressHome));
    }

    @Test
    public void testHashMapRemove() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        hashMap.remove(personOne);
        Assert.assertFalse(hashMap.containsKey(personOne));
    }

    @Test
    public void testHashMapRemoveReturnNull() {
        Map<Person, Address> hashMap = new HashMap<>();
        Assert.assertNull(hashMap.remove(personOne));
    }

    @Test
    public void testHashMapRemoveSValue() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        Assert.assertFalse(hashMap.remove(personOne,addressHome));
    }

    @Test
    public void testHashMapRemoveSpValueFalse() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        Assert.assertFalse(hashMap.remove(personOne,addressHome));
    }

    @Test
    public void testHashMapRemoveSValueTrue() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        Assert.assertTrue(hashMap.remove(personOne,addressZip));
    }

    @Test
    public void testHashMapSize() {
        Map<Person, Address> hashMap = new HashMap<>();
        hashMap.put(personOne, addressZip);
        hashMap.put(personTwo, addressHome);
        hashMap.remove(personOne);
        Assert.assertEquals(1,hashMap.size());
    }
}
