package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class ComparableTest {

    @Test
    public void personSortTest(){
        //given
        Person kid1 = new Person("Cal", 2016);
        Person kid2 = new Person("Jayla", 2009);
        Person parent = new Person("Trey", 1986);
        TreeSet<Person> sortPeople = new TreeSet<>();
        //imported Comparable in Person class to sort from oldest to youngest

        //when
        sortPeople.add(kid1);
        sortPeople.add(kid2);
        sortPeople.add(parent);


        Person[] sorted = sortPeople.toArray(new Person[0]);
        String actualPerson = sorted[0].getName();



        //then
        Assert.assertEquals("Trey", actualPerson);

    }
}
