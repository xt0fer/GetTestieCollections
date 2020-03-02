import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Address;
import rocks.zipcode.Person;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    Person onePerson = new Person("April", 2020);
    Person twoPerson = new Person("Gerg", 2020);

    Address workAddress = new Address("38 South Jersey St", "New Jersey", "38957", "United States");
    Address homeAddress = new Address("805 N. Orange St", "Wilmington", "38503",  "United States");

@Test
public void testHashMap() {
    Map<Person, Address> hashMap = new HashMap<>();
    hashMap.put(onePerson, workAddress);
    Assert.assertEquals(workAddress, hashMap.get(onePerson));
}

@Test
    public void testHashMapRemove() {
    Map<Person, Address> hashMap = new HashMap<>(0);
    hashMap.put(onePerson, workAddress);
    hashMap.remove(onePerson);
    Assert.assertFalse(hashMap.containsKey(onePerson));
}
}
