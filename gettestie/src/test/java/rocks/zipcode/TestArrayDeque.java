package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;


public class TestArrayDeque {
     Person personOne = new Person("Sandy", 1999);
     Person personTwo = new Person("Jeff", 1990);

     @Test
     public void TestArrayDequeOne(){
         Deque<Person> deque = new ArrayDeque<>();
         deque.addLast(personOne);
         deque.addLast(personTwo);
         Assert.assertEquals(personOne,deque.removeFirst());
     }

     @Test
     public void TestArrayDequeTwo(){
         Deque<Person> deque = new ArrayDeque<>();
         deque.addLast(personOne);
         deque.addLast(personTwo);
         Assert.assertEquals(personTwo,deque.removeLast());
     }

}
