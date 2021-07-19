package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
@Test
    public void ascendingOrderTest(){
    //given
    TreeSet<Integer> set = new TreeSet<>();

    //when
    set.add(12);
    set.add(4);
    set.add(5);
    set.add(102);
    set.add(31);

    Integer[] newSet = set.toArray(new Integer[0]);
    Integer[] expected = {4,5,12,31,102};

    //then
    Assert.assertEquals(newSet, expected);
}
}
