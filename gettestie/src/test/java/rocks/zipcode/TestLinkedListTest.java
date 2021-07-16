package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.TestLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestLinkedListTest {

    @Test
    public void linkedListTest(){
        TestLinkedList list = new TestLinkedList();

        list.getLinkedList().addFirst(100);
        Integer actual = list.getLinkedList().getFirst();
        Integer expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest2(){
        TestLinkedList list = new TestLinkedList();

        list.getLinkedList().addLast(100);
        Integer actual = list.getLinkedList().getLast();
        Integer expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest3(){
        TestLinkedList list = new TestLinkedList();

        list.getLinkedList().removeFirstOccurrence(10);
        Integer actual = list.getLinkedList().size();
        Integer expected = 9;

        Assert.assertEquals(expected, actual);
    }
}
