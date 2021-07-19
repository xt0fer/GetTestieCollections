package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
@Test
    public void nextTest(){
    //given
    LinkedList<String> list = new LinkedList<>();
    list.add("Ronnie");
    list.add("Bobby");
    list.add("Ricky");
    list.add("Mike");

    //when
    Iterator it = list.iterator();
    Object actual = it.next();
    Object expected = "Ronnie";
    //then
    Assert.assertEquals(actual, expected);
}
}
