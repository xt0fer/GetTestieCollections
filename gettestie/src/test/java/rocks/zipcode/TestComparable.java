package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestComparable {

    @Test
    public void TestComparable1() {
        String string1 = "Carrots";
        String string2 = "Duck";
        Assert.assertEquals(-1, string1.compareTo(string2));
        Assert.assertTrue(string1.compareTo(string2) < 0);
    }

    @Test
    public void TestComparable2() {
        String string1 = "Rodeo";
        String string2 = "Teriyaki";
        Assert.assertEquals(-2, string1.compareTo(string2));
        Assert.assertTrue(string1.compareTo(string2) < 0);
    }
}
