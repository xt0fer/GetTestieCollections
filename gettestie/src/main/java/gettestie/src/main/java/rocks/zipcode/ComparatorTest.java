package gettestie.src.main.java.rocks.zipcode;

import java.util.Comparator;

public class ComparatorTest implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
