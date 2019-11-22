package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    private ArrayList<String> arrayList;

    @Before
    public void setUp(){
        arrayList = new ArrayList<>();
        arrayList.add("Bloop");
        arrayList.add("Bleep");
        arrayList.add("Blop");
    }

    @Test
    public void testArrayListSize1(){
        Assert.assertEquals(3, arrayList.size());
    }

    @Test
    public void testArrayListSize2(){
        arrayList.add("There's a banana on the floor!");
        Assert.assertEquals(4, arrayList.size());
    }

    @Test
    public void testArrayListAddAll(){
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Work Hard");
        arrayList2.add("Smile More");
        arrayList2.add("Worry Less");

        Assert.assertTrue(arrayList.addAll(arrayList2));
    }

    @Test
    public void testArrayListRemove(){
        arrayList.add("New String Here!");
        String removalStr = "New String Here!";
        arrayList.remove(removalStr);
        Assert.assertFalse(arrayList.contains(removalStr));
    }

    @Test
    public void testArrayListContains(){
        arrayList.add("New String Here!");
        String containsStr = "New String Here!";
        Assert.assertTrue(arrayList.contains(containsStr));
    }

    @Test
    public void testArrayListReverse(){
        Collections.reverse(arrayList);
        Assert.assertEquals(arrayList.subList(0, 3), arrayList);
    }

    @Test
    public void testArrayListSubList(){
        arrayList.add("New String Here!");
        arrayList.add("New String Here Too!");
        List<String> arrayList2 = arrayList.subList(2, 4);
        Assert.assertEquals(arrayList.get(2), arrayList2.get(0));
    }

    @Test
    public void testArrayListGetIndex(){
        Assert.assertEquals("Blop", arrayList.get(2));
    }
}
