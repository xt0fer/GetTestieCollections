package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    @Test
    public void testPut() {
        //given
        Map<String, Integer> classroom = new HashMap<>();
        //when
        classroom.put("Chris", 22);
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        //then
        Assert.assertTrue(classroom.containsKey("Chris"));
        System.out.println(classroom.entrySet());
    }

    @Test
    public void testSize() {
        //given
        int expected = 3;
        Map<String, Integer> classroom = new HashMap<>();
        //when
        classroom.put("Chris", 22);
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        int actual = classroom.size();
        //then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void testContainsKey() {
        //given
        Map<String, Integer> classroom = new HashMap<>();
        //when
        classroom.put("Chris", 22);
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        //then
        Assert.assertTrue(classroom.containsKey("Natalie"));
    }

    @Test
    public void testContainsValue() {
        //given
        Map<String, Integer> classroom = new HashMap<>();
        //when
        classroom.put("Chris", 22);
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        //then
        Assert.assertTrue(classroom.containsValue(23));
    }

    @Test
    public void testRemove() {
        //given
        Map<String, Integer> classroom = new HashMap<>();
        //when
        classroom.put("Chris", 22);
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        classroom.remove("Chris", 22);
        //then
        Assert.assertFalse(classroom.containsKey("Chris"));
        System.out.println(classroom.entrySet());
    }

    @Test
    public void testGet() {
        //given
        int expected = 20;
        Map<String, Integer> classroom = new HashMap<>();
        //when
        classroom.put("Chris", 22);
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        int actual = classroom.get("Natalie");
        //then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
}
