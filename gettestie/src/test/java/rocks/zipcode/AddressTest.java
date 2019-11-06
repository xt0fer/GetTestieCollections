package rocks.zipcode;


import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class AddressTest {

private static final Logger LOGGER = Logger.getLogger(AddressTest.class.getName());


//  ********   Hash Map ***********
    @Test
    public void testHashMap() {

        String name = "Valentin";
        int age = 25;

        Person testPerson = new Person(name,age);
        Map<String,Person> testMap = new HashMap<>();

        testMap.put(name,testPerson);

        String expected = testPerson.toString();
        String actual = "Name: " + testMap.get(name).getName() +
            "\nYear of birth: " + testMap.get(name).getYearOfBirth() + "\n";

        Assert.assertEquals(expected,actual);
        LOGGER.log(Level.INFO,expected);

    }

    @Test
    public void testHashMap2(){
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Person personOne = new Person(nameOne,ageOne);
        Person personTwo = new Person(nameTwo,ageTwo);
        personOne.setAddress("123","mytown","19111");
        Map<String,Person> testMap = new HashMap<>();

        testMap.put(nameOne,personOne);
        testMap.put(nameTwo,personTwo);

        int expected = 2;
        int actual = testMap.size();

        Assert.assertEquals(expected,actual);

        String expectedAddress = "123\nmytown 19111\n\n";
        String actualAddress = testMap.get("G").getAddress().toString();
        Assert.assertEquals(expectedAddress,actualAddress);
        LOGGER.info(actualAddress);

    }

    @Test
    public void testHashMap3(){
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Map<String,Integer> testMap = new HashMap<>();

        testMap.put(nameOne,ageOne);
        testMap.put(nameTwo,ageTwo);

        testMap.remove("G");

        int expected = 1;
        int actual = testMap.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testHashMap4 (){
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Map<String , Integer> testMap = new HashMap<>();

        testMap.clear();

        int expected = 0;
        int actual = testMap.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testHashMap5(){
        String nameOne = "G";
        String nameTwo = "V";
        int ageOne = 25;
        int ageTwo = 40;

        Map<String, Integer> testMap = new HashMap<>();

        testMap.put(nameOne,ageOne);
        testMap.put(nameTwo,ageTwo);

        boolean actual = testMap.containsKey("G");
        Assert.assertTrue(actual);

        boolean actual2 = testMap.containsValue(40);
        Assert.assertTrue(actual2);

        boolean actual3 = testMap.containsKey("F");
        Assert.assertFalse(actual3);
    }


//  ******** Array List ***********

    @Test
    public void testArrayList(){
        List<String> testArray = new ArrayList<>();

        for (int i = 1; i<=5;i++ ){
            testArray.add("Element: " + i);
        }

        int expected = 5;
        int actual = testArray.size();

        Assert.assertEquals(expected,actual);
    }
//  ******** Hash Set ***********

//  ******** Linked List ***********

//  ******** Array Deque ***********



//  ******** Iterator ***********

//  ******** Stack ***********

//  ******** Comparable ***********



}
