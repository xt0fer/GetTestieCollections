package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void removeTest() {
        ArrayList<Integer> taco = new ArrayList<>();
        taco.add(3);
        taco.add(43);
        taco.add(35);

        Iterator<Integer> bell = taco.iterator();
        while (bell.hasNext()) {
            Integer i = bell.next();
            if (i < 42) {
                bell.remove();
            }
        }

        Integer actual = taco.size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

}
