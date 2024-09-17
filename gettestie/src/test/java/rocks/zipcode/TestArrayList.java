package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestArrayList {

    @Test
    public void TestGet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Orange");

        String expected = "White";

        String actual = list.get(4);

        assertEquals(expected, actual);
    }

    @Test
    public void TestRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Orange");

        list.remove(5);

        assertFalse(list.contains("Orange"));
    }

    @Test
    public void TestSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Orange");

        list.set(1,"Purple");

        String expected = "Purple";

        String actual = list.get(1);

        assertEquals(expected, actual);
    }

    @Test
    public void TestAddAll() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("Blue");
        list1.add("Yellow");
        list1.add("Red");
        list1.add("Green");
        list1.add("White");
        list1.add("Orange");

        list2.add("Rubiks");
        list2.add("Cube");
        list2.add("Colors");

        list1.addAll(list2);

        String expected = "Cube";
        String actual = list1.get(7);

        assertEquals(expected, actual);
    }
}
