package gettestie.src.main.java.rocks.zipcode;

import java.util.LinkedList;

public class TestLinkedList {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public TestLinkedList(){
        this.testAddEntries();
    }

    private void testAddEntries() {
        for(int i = 0; i < 10; i++){
            linkedList.add(10 - i);
        }
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}
