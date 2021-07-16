package gettestie.src.main.java.rocks.zipcode;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    private List<Integer> aList = new ArrayList<>();

    public TestArrayList(){
        this.addTestEntries();
    }

    public void addTestEntries(){
        for(int i = 0; i < 10; i++){
            aList.add(i);
        }
    }

    public List<Integer> getaList() {
        return aList;
    }
}
