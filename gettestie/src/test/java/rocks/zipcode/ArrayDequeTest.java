package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    @Test
    public void ArrayDeque() {
        ArrayDeque<String> idk = new ArrayDeque<>();
        idk.offer("suga's blue pants");
        idk.offer("hobi's mic drop outfit");
        idk.offer("eat more chicken soup");

        String actual = idk.poll();

        Assert.assertEquals(1, actual);

    }

}
