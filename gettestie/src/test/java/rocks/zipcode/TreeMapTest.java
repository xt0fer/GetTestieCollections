package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void testPut() {
        //given
        Map<String, Integer> classroom = new TreeMap<>();
        //when
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        classroom.put("Chris", 22);
        //then
        Assert.assertTrue(classroom.containsKey("Natalie"));
        System.out.println(classroom);
    }

    @Test
    public void testFirstKey() {
        //given
        String expected = "Chris";
        Map<String, Integer> classroom = new TreeMap<>();
        //when
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        classroom.put("Chris", 22);
        String actual = ((TreeMap<String, Integer>) classroom).firstKey();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplace() {
        //given
        Map<String, Integer> classroom = new TreeMap<>();
        //when
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        classroom.put("Chris", 22);
        classroom.replace("Natalie", 21);
        //then
        Assert.assertTrue(classroom.containsValue(21));
    }

    @Test
    public void testGet() {
        //given
        Integer expected = 23;
        Map<String, Integer> classroom = new TreeMap<>();
        //when
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        classroom.put("Chris", 22);
        Integer actual = classroom.get("Jean");
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //given
        Map<String, Integer> classroom = new TreeMap<>();
        //when
        classroom.put("Natalie", 20);
        classroom.put("Jean", 23);
        classroom.put("Chris", 22);
        classroom.remove("Chris");
        //then
        Assert.assertFalse(classroom.containsKey("Chris"));
    }
}
