package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class ComparableTest {

    ArrayList<Person> arrayList;
    Person p1;
    Person p2;
    Person p3;
    Person p4;
    Person p5;

    @Before
    public void doThisFirst(){
        p1 =new Person(1995);
        p2 =new Person(2200);
        p3 =new Person(1785);
        p4 =new Person(1);
        p5 =new Person(500);
        arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
    }

    @Test
    public void comparableTest(){

        Collections.sort(arrayList);

        Assert.assertEquals(1,  arrayList.get(0).getYearOfBirth());
        Assert.assertEquals(500,  arrayList.get(1).getYearOfBirth());
        Assert.assertEquals(1785,  arrayList.get(2).getYearOfBirth());
        Assert.assertEquals(1995,  arrayList.get(3).getYearOfBirth());
        Assert.assertEquals(2200,  arrayList.get(4).getYearOfBirth());
    }
}
