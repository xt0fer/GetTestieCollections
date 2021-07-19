package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ArrayQueueTest {
    @Test
    public void firstAndLastTest(){
        //given
        Integer[] original = {2,3,4};
        Deque<Integer> nums = new ArrayDeque<>();

        //when
        nums.addAll(Arrays.asList(original));
        nums.addFirst(1);
        nums.addLast(5);

        Integer[] actual = nums.toArray(nums.toArray(new Integer[0]));
        Integer[] expected = {1,2,3,4,5};

        //then
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void peekTest(){
        //given
        Deque<Integer> nums = new ArrayDeque<>();

        //when
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        Integer actual = nums.peek();
        Integer expected = 1;
        //then

        Assert.assertEquals(actual, expected);
    }
}
