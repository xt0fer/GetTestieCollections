package gettestie.src.main.java.rocks.zipcode;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    private Deque<Integer> aDeque = new ArrayDeque<>();

    public TestArrayDeque(){
        this.addTestEntries();
    }

    private void addTestEntries() {
        for(int i = 0; i < 10; i++){
            aDeque.add(i);
        }
    }

    public Deque<Integer> getaDeque() {
        return aDeque;
    }
}
