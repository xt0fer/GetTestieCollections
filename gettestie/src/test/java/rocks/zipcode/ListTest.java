package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test(expected = UnsupportedOperationException.class)
    public void ListIsUnmodifiable(){
        Integer[] array ={1,2};
        List<Integer> unmodifiableList = Arrays.asList(array);
        unmodifiableList.add(3);
    }

    @Test
    public void ArrayListIsModifiable(){
        List<Integer> list = Arrays.asList(1,2);
        List<Integer> modifiableList = new ArrayList<>(list);

        modifiableList.add(3);
        Assert.assertEquals((Integer) 3, modifiableList.get(2));
        modifiableList.remove(1);
        Assert.assertEquals((Integer) 3, modifiableList.get(1));
    }

    @Test
    public void ArrayListForEachTest(){
        List<String> expected = new ArrayList<>(Arrays.asList("Hi", "there"));
        List<String> actual = new ArrayList<>();
        expected.forEach(s -> actual.add(s));
        Assert.assertEquals(expected, actual);
    }
}
