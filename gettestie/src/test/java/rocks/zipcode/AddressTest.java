package rocks.zipcode;


import org.junit.Test;
import org.junit.Assert;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddressTest {

    private static final Logger LOGGER = Logger.getLogger(AddressTest.class.getName());


    //  ********   Hash Map ***********
    @Test
    public void testHashMap() {

        String name = "Valentin";
        int age = 25;

        Person testPerson = new Person(name, age);
        Map<String, Person> testMap = new HashMap<>();

        testMap.put(name, testPerson);

        String expected = testPerson.toString();
        String actual = "Name: " + testMap.get(name).getName() +
            "\nYear of birth: " + testMap.get(name).getYearOfBirth() + "\n";

        Assert.assertEquals(expected, actual);
        LOGGER.log(Level.INFO, expected);

    }

    @Test
    public void testHashMap2() {
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Person personOne = new Person(nameOne, ageOne);
        Person personTwo = new Person(nameTwo, ageTwo);
        personOne.setAddress("123", "mytown", "19111");
        Map<String, Person> testMap = new HashMap<>();

        testMap.put(nameOne, personOne);
        testMap.put(nameTwo, personTwo);

        int expected = 2;
        int actual = testMap.size();

        Assert.assertEquals(expected, actual);

        String expectedAddress = "123\nmytown 19111\n\n";
        String actualAddress = testMap.get("G").getAddress().toString();
        Assert.assertEquals(expectedAddress, actualAddress);
        LOGGER.info(actualAddress);

    }

    @Test
    public void testHashMap3() {
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Map<String, Integer> testMap = new HashMap<>();

        testMap.put(nameOne, ageOne);
        testMap.put(nameTwo, ageTwo);

        testMap.remove("G");

        int expected = 1;
        int actual = testMap.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashMap4() {
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Map<String, Integer> testMap = new HashMap<>();

        testMap.clear();

        int expected = 0;
        int actual = testMap.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testHashMap5() {
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Map<String, Integer> testMap = new HashMap<>();

        testMap.put(nameOne, ageOne);
        testMap.put(nameTwo, ageTwo);

        boolean actual = testMap.containsKey("G");
        Assert.assertTrue(actual);

        boolean actual2 = testMap.containsValue(40);
        Assert.assertTrue(actual2);

        boolean actual3 = testMap.containsKey("F");
        Assert.assertFalse(actual3);
    }


//  ******** Array List ***********

    @Test
    public void testArrayList() {
        List<String> testArray = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            testArray.add("Element: " + i);
        }

        int expected = 5;
        int actual = testArray.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayList1() {
        List<String> testArray = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            testArray.add("Element: " + i);
        }

        String expected = "Element: 1";
        String actual = testArray.get(0);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testArrayList2() {
        List<String> testArray = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            testArray.add("Element: " + i);
        }

        boolean isThere = testArray.contains("Element: 1");
        Assert.assertTrue(isThere);

        isThere = testArray.contains("This should not work");
        Assert.assertFalse(isThere);

        testArray.clear();
        int expected = 0;
        int actual = testArray.size();
        Assert.assertEquals(expected, actual);

        //******

        for (int i = 1; i <= 5; i++) {
            testArray.add("Element: " + i);
        }

        String[] tempArray = new String[testArray.size()];
        testArray.toArray(tempArray);

        String arrayItem = tempArray[0];
        String compareTo = testArray.get(0);

        Assert.assertEquals(arrayItem, compareTo);

        System.out.println(tempArray.toString()); // prints reference

    }

//  ******** Hash Set ***********

    @Test
    public void testHashSets() {
        Set<String> newHasSet = new HashSet();
        newHasSet.add("A");
        newHasSet.add("B");
        newHasSet.add("A");
        newHasSet.add("a");

        int expected = 3;
        int actual = newHasSet.size();

        Assert.assertEquals(expected, actual);

        System.out.println(newHasSet.toString());  // prints the elements of the set


        boolean containsvalue = true;
        Assert.assertTrue(newHasSet.contains("A"));

        int setSize = 0;
        newHasSet.clear();

        Assert.assertEquals(setSize, newHasSet.size());

    }

//  ******** Linked List ***********

    @Test
    public void testLinkedLists() {
        LinkedList<String> testList = new LinkedList<>();

        testList.add("A");
        testList.add("B");
        testList.addFirst("C");
        testList.add(2, "D");
        String expected = "[C, A, D, B]";
        String actual = testList.toString();  // prints the elements

        Assert.assertEquals(expected, actual);


        testList.addFirst("A");
        testList.remove(2);

        expected = "[A, C, D, B]";
        actual = testList.toString();

        Assert.assertEquals(expected, actual);


        int listSize = 4;
        int getSize = testList.size();

        Assert.assertEquals(listSize, getSize);


        expected = "ACDB";
        String newString = "";

        for (int i = 0; i < testList.size(); i++) {
            newString = newString.concat(testList.get(i));
        }

        Assert.assertEquals(expected, newString);
    }

//  ******** Array Deque ***********

    @Test
    public void testDequeArray() {
        // same as linkedlist but you don't have an insertion point

        Deque<String> testArray = new ArrayDeque<>();

        testArray.add("One");
        testArray.add("Two");
        testArray.add("Three");
        testArray.addFirst("Four");

        String expected = "[Four, One, Two, Three]";
        String actual = testArray.toString();

        Assert.assertEquals(expected,actual);

        testArray.remove("One");
        Integer arrayElements = 3;
        Integer actualElements = testArray.size();

        Assert.assertEquals(arrayElements,actualElements);
        // testArray.peek(); - shows the first element (Four)
        // testArray.element() - same as peek

        // testArray.pop() - removes last element
        // testArray.poll() - removes first element

    }


//  ******** Iterator ***********

//  ******** Stack ***********

//  ******** Comparable ***********


}
