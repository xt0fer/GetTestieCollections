package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void containsTest(){
        LinkedList<Integer> newList = new LinkedList<>(Arrays.asList(1,2,3));

        Assert.assertTrue(newList.contains(2));
        Assert.assertTrue(newList.contains(1));
        Assert.assertTrue(newList.contains(3));
    }

    @Test
    public void addMethodsTest(){
        LinkedList<Integer> newList = new LinkedList<>(Arrays.asList(2));
        Assert.assertEquals((Integer) 2, newList.get(0));

        newList.addFirst(1);  //Adds element to the beginning of the list.
        Assert.assertEquals((Integer) 1, newList.get(0));

        newList.addLast(3);  //Adds element to the end of the list.
        Assert.assertEquals((Integer) 3, newList.get(2));

        newList.add(2,10);                 // Adds element at specified index,
        Assert.assertEquals((Integer) 1, newList.get(0)); // and increases the index of all other elements ahead of it by one.
        Assert.assertEquals((Integer) 2, newList.get(1));
        Assert.assertEquals((Integer) 10, newList.get(2));
        Assert.assertEquals((Integer) 3, newList.get(3));
    }

    @Test //LinkedLists have a "First in, First Out" structure.
    public void removeTest(){
        LinkedList<Integer> newList = new LinkedList<>(Arrays.asList(1,2,3,4,5,5,6));

        newList.remove(); //removes element at index 0 and shifts all other elements down by an index of 1.
        Assert.assertEquals((Integer) 2, newList.get(0));
        Assert.assertEquals(6, newList.size());

        newList.remove((Integer) 5);  //removes first occurrence of specified element
        Assert.assertEquals((Integer) 4, newList.get(2));
        Assert.assertEquals((Integer) 5, newList.get(3));
        Assert.assertEquals((Integer) 6, newList.get(4));
        Assert.assertEquals(5, newList.size());

        newList.removeLast();
        Assert.assertNotEquals((Integer) 6, newList.get(3));
        Assert.assertEquals(4, newList.size());
    }
}
