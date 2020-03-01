import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Person;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    Person person1 = new Person("April", 2020);
    Person person2 = new Person("Anjie", 2020);

    @Test
    public void TestArrayDeQue() {
        Deque<Person> deque = new ArrayDeque<>();

        deque.addLast(person1);
        deque.addLast(person2);

        Assert.assertEquals(person1, deque.removeFirst());
        Assert.assertEquals(person1, deque.peekFirst());

    }
    @Test
    public void TestArrayDeque1() {
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(3);
    }

    @Test
    public void TestArrayDeque2() {
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(4);
        newDeque.addFirst(2);
        newDeque.add(2);

        Assert.assertEquals(2, newDeque.getFirst().intValue());
    }
    @Test
    public void TestArrayDeque3() {
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.addLast(2);
        newDeque.addFirst(2);
        newDeque.add(4);
        newDeque.add(0);

        Assert.assertEquals(0, newDeque.getLast().intValue());
    }
    @Test
    public void TestArrayDeque4() {
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(2876);
        newDeque.add(2);
        newDeque.add(1000);
        newDeque.add(456);

        Assert.assertEquals(456, newDeque.getLast().intValue());
    }
    @Test
    public void TestArrayDeque5() {
        ArrayDeque<Integer> newDeque = new ArrayDeque<>();
        newDeque.add(300);
        newDeque.add(400);
        newDeque.add(500);
        newDeque.add(500);
        Assert.assertEquals(300, newDeque.removeFirst().intValue());
    }

}
