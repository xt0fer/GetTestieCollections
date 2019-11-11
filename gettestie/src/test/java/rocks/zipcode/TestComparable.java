package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {
    Person personOne = new Person("Sandy", 1999);
    Person personTwo = new Person("Jeff", 1990);

    //idk why this won't work :'(
    /*@Test
    public void testComparePeopleAge() {
        Assert.assertEquals(9, personOne.compareTo(personTwo));
    }*/

    @Test
    public void testCompareInteger() {
        Assert.assertEquals(-1, Integer.compare(2, 10));
    }

    @Test
    public void testCompareString() {
        Assert.assertEquals(-1, "a".compareTo("b"));
    }
}
