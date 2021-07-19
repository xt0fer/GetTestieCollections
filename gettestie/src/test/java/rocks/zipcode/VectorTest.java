package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void capacityTest() {
        Vector<Integer> evilguy = new Vector<>();
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);
        evilguy.add(1);

        evilguy.ensureCapacity(11);
        Integer actual = evilguy.size();

        Integer expected = 12; //vector intial capacity is 10

        Assert.assertEquals(expected, actual);
    }
}
