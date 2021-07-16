package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.ComparatorTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class OtherTests {

    @Test
    public void vectorTest() {
        Vector<Integer> vList = new Vector<>();

        vList.addElement(1);
        vList.addElement(10);
        vList.addElement(20);
        vList.removeElement(10);
        vList.ensureCapacity(200);
        Integer cap = vList.capacity();
        Integer expectedcap = 200;
        Integer actual = vList.size();
        Integer expected = 2;
        System.out.println("Capacity is " + cap);
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(cap, expectedcap);
    }

    @Test
    public void treeSetTest() {
        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(10);
        tSet.add(1);
        tSet.add(7);
        tSet.add(-4);
        tSet.add(-4);

        Integer expected = -4;
        Integer actual = tSet.first();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void priorQueueTest() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new ComparatorTest());

        pq.add(10);
        pq.add(4);
        pq.add(30);

        System.out.println(pq.peek());
        Integer actual = pq.poll();
        Integer expected = 30;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void iterableTest(){
        List<String> list = new ArrayList<>();

        list.add("Hello ");
        list.add("World! " );
        list.add("I ");
        list.add("am ");
        list.add("poor...");

        Iterator<String> i = list.iterator();
        StringBuilder sb = new StringBuilder();

        while(i.hasNext()){
            sb.append(i.next());
        }

        String expected = "Hello World! I am poor...";
        String actual = sb.toString();

        Assert.assertEquals(expected, actual);
    }

}
