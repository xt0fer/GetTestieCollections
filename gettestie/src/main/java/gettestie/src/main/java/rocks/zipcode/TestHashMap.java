package gettestie.src.main.java.rocks.zipcode;

import java.util.HashMap;

public class TestHashMap {
    HashMap<String, Integer> hashMap;

    public TestHashMap(){
        hashMap = new HashMap<String, Integer>();
        this.addEntries();
    }

    public void addEntries(){
        HashMap<String, Integer> hMap = this.getHashMap();

        for (int i = 0; i < 10; i++) {
            hMap.put("element" + i, i);
        }

        this.hashMap = hMap;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }
}
