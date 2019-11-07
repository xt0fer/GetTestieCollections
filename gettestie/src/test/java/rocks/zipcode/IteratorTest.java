package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    private ArrayList<Integer> list;
    private Iterator<Integer> iterator;

    @Before
    public void doThisFirst(){
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        iterator = list.iterator();
    }


    @Test
    public void hasNextTest(){
        while (iterator.hasNext()) {
            Assert.assertTrue(iterator.hasNext());
            iterator.next();
        }
    }
}
