package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeTest {

    @Test
    public void addMethodsTest(){
        ArrayDeque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4));

        deque.push(0);
        Assert.assertEquals((Integer) 0, deque.peekFirst());

        deque.add(5);
        Assert.assertEquals((Integer) 5, deque.peekLast());

        Assert.assertTrue(deque.offer(6));
        Assert.assertEquals((Integer) 6, deque.peekLast());
    }

    @Test
    public void removeMethodsTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Assert.assertEquals((Integer) 1, deque.pop());
        Assert.assertEquals((Integer) 2, deque.getFirst());

        Assert.assertEquals((Integer) 2, deque.poll());
    }
}
