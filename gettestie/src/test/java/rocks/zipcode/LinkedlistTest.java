package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LinkedlistTest {

    @Test
    public void alinkedList1(){
        LinkedList<String> fruts = new LinkedList<>();
        fruts.add("apples");
        fruts.add("bananas");
        fruts.add("mangos");

        //WHEN
        int actual = fruts.size();

        //THEN
        assertEquals(3, actual);
    }
//    @Test
//    public void likedList1(){
//        LinkedlistTest<String> name = new LinkedlistTest<>();
//        name.add("apples");
//        name.add("bananas");
//        name.add("mangos");
//
//        Integer actual = name.size();
//        assertEquals(3, actual)
//    }
@Test
    public void linkedlistDos(){
LinkedList<Integer> anothaOne = new LinkedList<>();
    anothaOne.add(40);
    anothaOne.add(24);
    anothaOne.add(18);

     anothaOne.remove(24);

     assertFalse(anothaOne.contains(24));
}
//    public void linkedList2(){
//        LinkedList<Integeer> anothaOne = new LinkedList<>();
//        anothaOne.add(40);
//        anothaOne.add(24);
//        anothaOne.add(18);
//
//        anothaOne.remove(24);
//
//        assertFalse(anothaOne.contains(24));
}
