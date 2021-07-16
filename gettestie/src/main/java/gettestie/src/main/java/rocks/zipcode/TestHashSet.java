package gettestie.src.main.java.rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.TestHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class TestHashSet {
    private HashSet<Integer> hashSet;

    public TestHashSet(){
        this.hashSet = new HashSet<Integer>();
    }

    public void testAddEntries(){
        for(int i = 0; i < 10; i++){
            hashSet.add(i);
        }
    }

    public HashSet<Integer> getHashSet() {
        return hashSet;
    }
}
