package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test //LinkedLists have a "First in, First Out" structure.
    public void removeTest(){
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);

        Assert.assertEquals((Integer) 1, newList.get(0));
        Assert.assertEquals(3, newList.size());

        newList.remove();
        Assert.assertEquals((Integer) 2, newList.get(0));
        Assert.assertEquals(2, newList.size());

        newList.remove();
        Assert.assertEquals((Integer) 3, newList.get(0));
        Assert.assertEquals(1, newList.size());
    }

    @Test //LinkedLists have a "First in, First Out" structure.
    public void removeTest2(){
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);

        Assert.assertEquals((Integer) 1, newList.get(0));
        Assert.assertEquals(3, newList.size());

        newList.remove();
        Assert.assertEquals((Integer) 2, newList.get(0));
        Assert.assertEquals(2, newList.size());

        newList.remove();
        Assert.assertEquals((Integer) 3, newList.get(0));
        Assert.assertEquals(1, newList.size());
    }
}
