package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


public class HashSetTest {

    @Test
    public  void getHashSetTest() {
        //given
        Person kid1 = new Person("Cal", 2016);
        Person kid2 = new Person("Jayla", 2009);
        Person parent = new Person("Trey", 1986);
        Person kid3 = new Person("Cal", 2016); //this adds as a new person
        Set<Person> personSet = new HashSet<>();
        int expectedSetSize = 3;

        //when
        personSet.add(kid1);
        personSet.add(kid2);
        personSet.add(parent);
        personSet.add(kid2);

        //then
        int actualSize = personSet.size();
        Assert.assertEquals(expectedSetSize, actualSize);



    }

    @Test
    public  void getHashSetTest2() {
        //given
        String fruit1= "apple";
        String fruit2 = "pear";
        String fruit3 = "banana";
        String fruit4 = "pear";
        Set<String> fruits = new HashSet<>();
        int expectedSetSize = 3;

        //when
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        fruits.add(fruit4);


        //then
        int actualSize = fruits.size();
        Assert.assertEquals(expectedSetSize, actualSize);


    }



}
