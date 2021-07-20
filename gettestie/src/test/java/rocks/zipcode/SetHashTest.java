package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class SetHashTest {
    @Test
    public void TestHashSetClear(){
        HashSet<Integer> limpio = new HashSet<>();
        //GIVEN
        limpio.add(28);
        limpio.add(26);
        limpio.add(24);

        //WHEN
        int actual = limpio.size();

        //THEN
        Assert.assertEquals(3, actual);
    }


//    @Test
//    public void TestHashSetClear();
//    HashSet<Integer> newOne = new HashSet<Integer>();
//    newOne.add(28);
//    newOune.add(26);
//    newOne.add(24);
//
//    int expeted = newOne.clear();
//    int actual = newOne.size();
//
//    Assert.assert.Equals(expected, actual)
//
//}

}
