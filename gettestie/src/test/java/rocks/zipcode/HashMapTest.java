package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void TestReplaceHashMap(){
        HashMap<String, String> soyElMapa = new HashMap<>();
        soyElMapa.put("hobi","silver");
        soyElMapa.put("rm", "blue");
        soyElMapa.put("tae", "green");

        soyElMapa.replace("hobi", "mint");
        String actual = soyElMapa.get("hobi");

        Assert.assertEquals("mint", actual);
    }




    @Test
    public void TestHasMapTest2(){
        HashMap<String, Integer> edad = new HashMap<>();
        //GIVEN
        edad.put("jimin", 25);
        edad.put("tae", 24);
        edad.put("hobi", 27);

         //WHEN
        boolean actual = edad.containsValue(24);

        //THEN
        Assert.assertEquals(true, actual);


    }
//    @Test
//    public void testHasMapContains (){
//        HasMap<String, String> map = new HasMap<>();
//        map.put("tae", "green");
//        map.put("jimin", "gold");
//
//        boolean actulal = map.containsKey("jimin")
//
//        Assert.assertEqual(true, actual);
//
//    }
}
