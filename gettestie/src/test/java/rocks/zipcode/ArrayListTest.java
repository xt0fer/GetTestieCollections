package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArrayListTest {

    @Test
    public void arrayOne() {
        //GIVEN
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add("chicken");
        newArray.add("cheese");
        newArray.add("coffe");

        //WHEN
        //boolean actual = newArray.isEmpty();
        newArray.add("more food");

        //THEN
        assertFalse(newArray.isEmpty());
        //Assert.assertEquals(false, actual);
    }

    @Test
    public void arrayOther(){
        //GIVEN
        ArrayList<String> salad = new ArrayList<>();
        salad.add("tomatoes");
        salad.add("lettuce");
        salad.add("carrots");
        salad.add("onions");

        //WHEN
        String actual = salad.remove(3);

        //THEN
        assertFalse(salad.contains("onion"));


    }
}
//    @Test
//    public void araysOne(){
//        ArrayListTest<String> arrL = new ArrayListTest<>();
//        arrL.add("chicken");
//        arrL.add("cheese");
//        arrL.add("coffe");
//
//        assertFalse(arrL.isEmpty());
//
//    }
//
//    @Test
//    public void arraysTwo(){
//        ArrayListTest<String> tiene = new ArrayListTest<String>();
//        tiene.add("lettuce");
//        tiene.add("tomatos");
//        tiene.add("carrots");
//        tiene.add("onions");
//
//        tiene.remove("onion");
//
//        aseerFalse(tiene.contains("onion"));
//    }

