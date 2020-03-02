import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Person;

import java.util.List;
import java.util.Vector;

public class TestVector {

    Person onePerson = new Person("April", 2020);
    Person twoPerson = new Person("Anjie", 2020);
    @Test
    public void TestVector() {
        Vector newVector = new Vector();

        newVector.add(1);
        newVector.add(2);
        newVector.add("Houses");
        newVector.add("Trees");
        newVector.add("Real Estate");

        Assert.assertEquals("[1, 2, Houses, Trees, Real Estate]", newVector.toString());
    }

    @Test
    public void TestVector1() {
        Vector newVector = new Vector();

        newVector.ensureCapacity(100);
        Assert.assertEquals(100, newVector.capacity());
    }

    @Test
    public void TestVector2() {
        Vector newVector = new Vector();

        List<Person> Vector = new Vector<>();
        Assert.assertTrue(Vector.add(onePerson));
    }

    @Test
    public void TestVectorRemove() {
        List<Person> Vector = new Vector<>();
        Vector.add(onePerson);
        Assert.assertTrue(Vector.remove(onePerson));
    }

    @Test
    public void TestVectorClear() {
        List<Person> Vector = new Vector<>();
        Vector.add(onePerson);
        Vector.add(twoPerson);
        Vector.clear();
        Assert.assertTrue(Vector.isEmpty());
    }

    @Test
    public void TestVectorSize(){
        List<Person> Vector = new Vector<>();
        Vector.add(onePerson);
        Vector.add(twoPerson);
        Assert.assertEquals(2, Vector.size());
    }

    @Test
    public void TestVectorAddAll(){
        List<Person> Vector = new Vector<>();
        List<Person> Vector1 = new Vector<>();
        Vector1.add(onePerson);
        Vector1.add(twoPerson);
        Vector.addAll(Vector1);
        Assert.assertEquals(Vector, Vector1);

    }
}
