package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    HashSet<String> hashSet;

    @Before
    public void setUp(){
        hashSet = new HashSet<>();
        hashSet.add("My name is Kai");
        hashSet.add("His name is Devon");
        hashSet.add("Her name is Kendra");
    }

    @Test
    public void testHashSetSize1(){
        Assert.assertEquals(3, hashSet.size());
    }

    @Test
    public void testHashSetSize2(){
        hashSet.add("I'm adding something new!");
        Assert.assertEquals(4, hashSet.size());
    }

    @Test
    public void testHashSetRemove(){
        hashSet.remove("My name is Kai");
        Assert.assertFalse(hashSet.contains("My name is Kai"));
    }

    @Test
    public void testHashSetEmpty(){
        Assert.assertFalse(hashSet.isEmpty());
    }

    @Test
    public void testHashSetContains1(){
        Assert.assertFalse(hashSet.contains("He tried his best"));
    }

    @Test
    public void testHashSetContains2(){
        Assert.assertTrue(hashSet.contains("His name is Devon"));
    }
}
