package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void originalVectorSize(){
        //given
        Vector vector = new Vector();

        //then
        Integer expected = 10;
        Integer actual = vector.capacity();

        //when
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void changeCapacity(){
        //given
        Vector vector = new Vector(2,3);


        //when
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Integer expected = 5;
        Integer actual = vector.capacity();

        //then
        Assert.assertEquals(expected, actual);
    }
}
