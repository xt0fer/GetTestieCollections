package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void vectorTest(){
        //given
        Vector<String> iceCreamFlavors = new Vector<>(5, 2);

        iceCreamFlavors.add("Chocolate");
        iceCreamFlavors.add("Strawberry");
        iceCreamFlavors.add("Cookies N Creme");
        iceCreamFlavors.add("Rocky Road");
        iceCreamFlavors.add("Chocolate Mint Chip");
        iceCreamFlavors.add("Cherry Garcia");

        //when
        int actualSize = iceCreamFlavors.capacity();
        int expected = 7;

        //then
        Assert.assertEquals(expected, actualSize);

    }
}
