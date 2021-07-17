import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void comparableTest(){
        String string = "John";
        String string2 = "Song";


        Assert.assertEquals(-9, string.compareTo(string2));
        System.out.println(string.compareTo(string2));
    }
}
