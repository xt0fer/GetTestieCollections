import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Person;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    Person onePerson = new Person("April", 2020);
    Person twoPerson = new Person("Anjie", 2020);
    @Test
    public void testArrayListAddAll() {
        List<Person> arrayList1 = new ArrayList<>();
        List<Person> arrayList2 = new ArrayList<>();
    arrayList2.add(onePerson);
    arrayList2.add(twoPerson);
    arrayList1.addAll(arrayList2);
    Assert.assertEquals(arrayList1, arrayList2);
    }

    @Test
    public void testArrayListSize() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(onePerson);
        arrayList.add(twoPerson);

        Assert.assertEquals(2, arrayList.size());
    }

    @Test
    public void testArrayListAdd() {
        List<Person> arrayList = new ArrayList<>();
        Assert.assertTrue(arrayList.add(onePerson));
    }

    @Test
    public void testArrayListAddIndex() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(onePerson);
        arrayList.add(0, twoPerson);
        Assert.assertEquals(twoPerson, arrayList.get(0));
    }

    @Test
    public void testArrayListRemove() {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(onePerson);
        Assert.assertTrue(arrayList.remove(onePerson));
    }

}
