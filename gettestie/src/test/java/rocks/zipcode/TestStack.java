package rocks.zipcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import gettestie.src.main.java.rocks.zipcode.Address;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void linkedQueueTest () {
        // Given
        LinkedList<Address> testingQueue = new LinkedList<Address>();
        testingQueue.add(new Address("Carver St", "Winkleton", "12345"));
        testingQueue.add(new Address("Nerd Rd", "Riddlesville", "54321"));
        testingQueue.add(new Address("Shrimp Ct", "Philadelphia", "86753"));
        Integer expected = 1;
        System.out.println(testingQueue.clone()); // Clone generates a 'shallow' copy - the elements aren't exactly "cloned"

        testingQueue.removeFirst();
        Integer actual = testingQueue.size();

        Assert.assertEquals(expected, actual);
        System.out.println(testingQueue);

    }

    @Test
    public void hashMapTest () {
        Map<String, Address> testingHash = new HashMap<>();
        testingHash.put("Lucy", new Address("Carver St", "Winkleton", "12345"));
        testingHash.put("Calvin", new Address("Nerd Rd", "Riddlesville", "54321"));
        testingHash.put("Alex" ,new Address("Shrimp Ct", "Philadelphia", "86753"));
        testingHash.put("Roger", new Address(null, null, null));
        Boolean expected = false;
        Boolean actual = testingHash.containsKey("Kyle");

        Assert.assertEquals(expected, actual);

        // Assert.assertFalse(testingHash.containsKey("Kyle"));
        System.out.println(testingHash.containsKey("Kyle"));  //should print false
        System.out.println(testingHash.putIfAbsent("Laura", new Address("Tea", "Teaton", "80412")));
        // .putIfAbsent only puts the Key + Value in if the Key is not already entered - it does not check for the value
        System.out.println(testingHash.remove("Roger"));
        System.out.println(testingHash.keySet());
        System.out.println(testingHash.entrySet());
    }

    @Test
    public void hashSetTest () {
        Set<Address> testingSet = new HashSet<>();
        testingSet.add(new Address("Carls Jr", "SoCal", "96513"));
        testingSet.add(new Address("Borger Kang", "San Diea", "13451"));
        testingSet.add(new Address("In and Out", "Boston", "14627"));
        Boolean expected = true;
        Boolean actual = testingSet.contains(new Address("Carls Jr", "SoCal", "96513")); // Need to look into contains more
        testingSet.iterator();  // Need to look into iterator method on Sets

        Assert.assertEquals(expected, actual);
        System.out.println(testingSet);
    }

    @Test
    public void hashSetTest1 () {
        Set<Address> testingSet = new HashSet<>();
        testingSet.add(new Address("Carls Jr", "SoCal", "96513"));
        testingSet.add(new Address("Borger Kang", "San Diea", "13451"));
        testingSet.add(new Address("In and Out", "Boston", "14627"));
        Boolean expected = false;
        Boolean actual = testingSet.contains(new Address("Carls Jr", "SoCal", "9651")); // Need to look into contains more
        testingSet.iterator();  // Need to look into iterator method on Sets

        // This test fails because the data inside (Street, Town, PostCode) must be a perfect match to test for containment
        Assert.assertEquals(expected, actual);
        System.out.println(testingSet);
    }

    @Test
    public void arrayListTest () {
        List<Address> testingList = new ArrayList<>();
        testingList.add(new Address("Folgers", "Coffee", "42515"));
        testingList.add(new Address("Maxwell", "Dark Roast", "14562"));
        testingList.add(new Address("Starbucks", "Light Roast", "71737"));
        Boolean expected = false;
        Boolean actual = testingList.contains(new Address("Bookoo", "Bucks", "wild"));

        Assert.assertEquals(expected, actual);
        // I have to research more on the .iterator() method
        System.out.println(testingList.get(1));
        System.out.println("Above is the .get() method");
        System.out.println(testingList.size());
    }

    @Test
    public void arrayDequeTest () {
        Deque<Address> testingD = new ArrayDeque<>();
        testingD.add(new Address("Book", "Allen", "12466"));
        testingD.add(new Address("Zach", "Afac", "42515"));
        testingD.add(new Address("Karen", "Bro", "57173"));

        System.out.println(testingD);
        System.out.println("After initial return");
        System.out.println(testingD.getFirst());
        System.out.println(testingD.getLast());
        System.out.println("Pre Pop // Post Pop");
        testingD.push(new Address("BadBoy", "adf", "14366"));
        System.out.println(testingD);
    }
}
