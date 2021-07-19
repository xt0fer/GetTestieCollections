package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeTest {

    @Test
    public void arrayDequeTest(){
        //given
        Deque<Integer> testDeque = new ArrayDeque<>();
        testDeque.add(3);
        testDeque.add(10);
        testDeque.add(5);

        //when
        Integer add = 2;
        testDeque.addFirst(add);

        //then
        Integer actual = testDeque.peekFirst();
        Assert.assertEquals(add, actual);

    }

    @Test
    public void arrayDequeTest2(){
        //given
        Deque<Integer> testDeque = new ArrayDeque<>();
        testDeque.add(3);
        testDeque.add(10);
        testDeque.add(5);

        //when
        Integer add = 2;
        testDeque.addFirst(add);
        Integer pop = add;

        //then
        Integer actual = testDeque.pop(); //removes first element
        Assert.assertEquals(pop, actual);

    }

    @Test
    public void arrayDequeTest3(){
        //given
        Deque<Integer> testDeque = new ArrayDeque<>();
        testDeque.add(3);
        testDeque.add(10);
        testDeque.add(5);

        //when
        Integer add = 2;
        testDeque.addFirst(add);
        testDeque.pop();
        Integer expected = 5;
        int size = testDeque.size();


        //then
        Integer actual = testDeque.getLast(); //removes first element
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(3, size);


    }

    @Test
    public void priorityQueueTest(){
        //given
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(8);
        queue.add(13);
        queue.add(2);

        //when
        Integer actual = queue.remove();
        Integer expected = 2;

        //then
        Assert.assertEquals(expected, actual);


    }
}
