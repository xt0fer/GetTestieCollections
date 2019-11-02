package rocks.zipcode;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedList1(){
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("Pam");
        newLinkedList.add("Stanley");
        newLinkedList.addFirst("Jim");

        assertEquals("[Jim, Pam, Stanley]", newLinkedList.toString());
    }

    @org.junit.Test
    public void TestLinkedList2(){
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("Pam");
        newLinkedList.add("Stanley");
        newLinkedList.addFirst("Jim");

        assertEquals(-1, newLinkedList.indexOf("Michael"));
    }

    @org.junit.Test
    public void TestLinkedList3(){
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("Pam");
        newLinkedList.add("Stanley");
        newLinkedList.addFirst("Jim");
        newLinkedList.add("Kevin");
        newLinkedList.add("Stanley");

        newLinkedList.removeFirstOccurrence("Stanley");

        assertEquals("[Jim, Pam, Kevin, Stanley]", newLinkedList.toString());
    }

    @org.junit.Test
    public void TestLinkedList4(){
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("Pam");
        newLinkedList.add("Stanley");
        newLinkedList.addFirst("Jim");
        newLinkedList.add("Kevin");
        newLinkedList.add("Stanley");

        assertEquals("Jim", newLinkedList.poll());
    }
}
