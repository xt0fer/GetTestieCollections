import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void setUp() throws Exception {
    }

    @Test
    public void tearDown() throws Exception {

    }

    @Test
    public void TestComparable1() {
        Integer number1 = 25;
        Integer number2 = 26;

        Assert.assertEquals(1, number2.compareTo(number1));
    }
    @Test
    public void TestComparable2() {
        Integer number1 = 100;
        Integer number2 = 4;

        Assert.assertEquals(-1, number2.compareTo(number1));
    }
    @Test
    public void TestComparable3() {
        String string1 = "Hi There";
        String string2 = "Hi There";

        Assert.assertEquals(0, string2.compareTo(string1));
    }
}
