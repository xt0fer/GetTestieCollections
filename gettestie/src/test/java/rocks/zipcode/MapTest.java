package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    @Test
    public void HashMapTest(){
        //given
        Map<Person, Integer> yearBorn = new HashMap<>(); //Person = key, Year = value
        Person person1 = new Person("Carl", 1992);
        Person person2 = new Person("Jerome", 2000);
        Person person3 = new Person("Taylor", 2000);
        yearBorn.put(person1, 1992);
        yearBorn.put(person2, 2000);
        yearBorn.put(person3, 2000);

        //when
        Integer actual = yearBorn.get(person2);
        Integer expected = 2000;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapTest2(){
        //given
        Map<Person, Integer> yearBorn = new HashMap<>(); //Person = key, Year = value
        Person person1 = new Person("Carl", 1992);
        Person person2 = new Person("Jerome", 2000);
        Person person3 = new Person("Taylor", 2000);
        yearBorn.put(person1, 1992);
        yearBorn.put(person2, 2000);
        yearBorn.put(person3, 2000);

        //when
        yearBorn.put(person2, 2001);
        Integer actual = yearBorn.get(person2);
        Integer expected = 2001;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapPutMethodTest(){
        //given
        Map<Person, Integer> yearBorn = new HashMap<>(); //Person = key, Year = value
        Person person1 = new Person("Carl", 1992);
        Person person2 = new Person("Jerome", 2000);
        Person person3 = new Person("Taylor", 2000);
        yearBorn.put(person1, person1.getYearOfBirth());
        yearBorn.put(person2, person2.getYearOfBirth());
        yearBorn.put(person3, person3.getYearOfBirth());

        //when
        yearBorn.put(person2, 2001);
        Integer actual = yearBorn.get(person2);
        Integer expected = 2001;

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapTest(){
        //given
        Map<String, Integer> yearBorn = new TreeMap<>(); //Person = key, Year = value
        Person person1 = new Person("Carl", 1992);
        Person person2 = new Person("Jerome", 2000);
        Person person3 = new Person("Taylor", 2000);
        yearBorn.put(person1.getName(), person1.getYearOfBirth());
        yearBorn.put(person2.getName(), person2.getYearOfBirth());
        yearBorn.put(person3.getName(), person3.getYearOfBirth());

        //when
        yearBorn.put(person2.getName(), 2001);


        //then
        System.out.println(yearBorn); //sorts by name value alphabetically
    }
}
