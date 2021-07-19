package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void ListTest(){
        //given
        List<Person> people = new ArrayList<>();
        Person people1 = new Person("Carl", 1992);
        Person people2 = new Person("Jerome", 2000);

        //when
        people.add(people1);
        people.add(people2);
        Person actualPerson = people.get(0);

        //then
        Assert.assertEquals(people1, actualPerson);

    }

    @Test
    public void ListRemoveTest(){
        //given
        List<Person> people = new ArrayList<>();
        Person people1 = new Person("Carl", 1992);
        Person people2 = new Person("Jerome", 2000);
        people.add(people1);
        people.add(people2);

        //when
        people.remove(people1);
        Person actualPerson = people.get(0);

        //then
        Assert.assertEquals(people2, actualPerson);

    }
}
