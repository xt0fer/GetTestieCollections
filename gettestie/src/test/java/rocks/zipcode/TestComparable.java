package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TestComparable {

    @Test
    public void compareToTest() {
        Comparator<Integer> intCompareTo = Comparator.comparing(Integer::valueOf);

        int num = 10;

        ArrayList<Integer> intArrayList = new ArrayList<>(num);

        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(25);
        intArrayList.add(40);

        Collections.sort(intArrayList, intCompareTo);

        Integer[] expectedArray = {20, 25, 30, 40};
        List<Integer> expected = Arrays.asList(expectedArray);

        Assert.assertEquals(expected, intArrayList);
    }

    @Test
    public void TestEqual() {
        Person manny = new Person("Manny", 1998);
        Person mindy = new Person("Mindy", 1996);


        assertTrue(manny.getYearOfBirth() != mindy.getYearOfBirth());
    }


}
