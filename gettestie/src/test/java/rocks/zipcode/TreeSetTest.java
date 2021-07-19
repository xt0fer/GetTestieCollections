package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TreeSetTest {

    @Test
    public  void TreeSetTest2() {
        //given
        String fruit1= "apple";
        String fruit2 = "pear";
        String fruit3 = "banana";
        String fruit4 = "pear";
        Set<String> sortedFruits = new TreeSet<>();

        //when
        sortedFruits.add(fruit1);
        sortedFruits.add(fruit2);
        sortedFruits.add(fruit3);
        sortedFruits.add(fruit4);
        String[] fruitArray = sortedFruits.toArray(new String[0]);
        String actualFruit = fruitArray[0];


        //then
        Assert.assertEquals(fruit1, actualFruit);


    }
//    @Test
//    public void TreeSetTest(){
//        //given
//        Person kid1 = new Person("Cal", 2016);
//        Person kid2 = new Person("Jayla", 2009);
//        Person parent = new Person("Trey", 1986);
//        TreeSet<Person> sortPeople = new TreeSet<>();
//        Person[] expectedArray = {kid1, kid2, parent};
//
//        //when
//        sortPeople.add(kid1);
//        sortPeople.add(kid2);
//        sortPeople.add(parent);
//        Iterator<Person> sorter = sortPeople.iterator();
//
//        Person[] sorted = sortPeople.toArray(new Person[0]);
//        String actualPerson = sorted[0].getName();
//
//
//
//        //then
//        Assert.assertEquals("Carl", actualPerson);
//
//
//    }

}
