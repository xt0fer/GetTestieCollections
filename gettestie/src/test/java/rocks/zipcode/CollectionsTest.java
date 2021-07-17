package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

public class CollectionsTest {
    //======================= HashSet Tests ========================
    @Test
    public void hashSetSize(){
        Collections c = new Collections();
        c.populateHashSet();
        Integer expected = 6;
        Integer actual = c.getHashSet().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void hashSetIsEmpty(){
        Collections c = new Collections();
        c.populateHashSet();
        Assert.assertFalse(c.getHashSet().isEmpty());
    }

    @Test
    public void hashSetContains(){
        Collections c = new Collections();
        c.populateHashSet();
        Assert.assertFalse(c.getHashSet().contains("squid"));
        Assert.assertTrue(c.getHashSet().contains("dog"));
    }
    @Test
    public void hashSetAdd(){
        Collections c = new Collections();
        c.populateHashSet();
        c.getHashSet().add("fox");
        Assert.assertTrue(c.getHashSet().contains("fox"));
    }
    @Test
    public void hashSetRemove(){
        Collections c = new Collections();
        c.populateHashSet();
        c.getHashSet().remove("cat");
        Assert.assertFalse(c.getHashSet().contains("cat"));
    }

    @Test
    public void hashSetClear(){
        Collections c = new Collections();
        c.populateHashSet();
        c.getHashSet().clear();
        Integer expected = 0;
        Integer actual = c.getHashSet().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void hashSetIterator(){
        Collections c = new Collections();
        c.populateHashSet();
        Iterator itr = c.getHashSet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Test
    public void hashSetClone(){
        Collections c = new Collections();
        c.populateHashSet();
        HashSet clonedSet;
        clonedSet = (HashSet) c.getHashSet().clone();
        Assert.assertEquals(c.getHashSet(),clonedSet);
    }

    //======================= ArrayList Tests =====================

    @Test
    public void arrayListSizeTest(){
        Collections c = new Collections();
        c.populateArrayList();
        Integer actual = c.getArrList().size();
        Integer expected = 5;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void arrayListIsEmptyTest(){
        Collections c = new Collections();
        c.populateArrayList();
        Assert.assertFalse(c.getArrList().isEmpty());
    }

    @Test
    public void arrayListContainsTest() {
        Collections c = new Collections();
        c.populateArrayList();
        Assert.assertTrue(c.getArrList().contains("Ana"));
    }

    @Test
    public void arrayListIndexOfTest() {
        Collections c = new Collections();
        c.populateArrayList();
        Integer actual = c.getArrList().indexOf("Ana");
        Integer expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void arrayListLastIndexOfTest() {
        Collections c = new Collections();
        c.populateArrayList();
        c.getArrList().add("Ana");
        Integer actual = c.getArrList().lastIndexOf("Ana");
        Integer expected = 5;
        Assert.assertEquals(expected,actual);
    }

    //========================  HashMap Tests ======================

    @Test
    public void hashMapSizeTest(){
        Collections c = new Collections();
        c.populateHashMap();
        Integer act = c.getHashMap().size();
        Integer exp  = 5;
        Assert.assertEquals(exp,act);
    }

    @Test
    public void hashMapReplaceTest() {
        Collections c = new Collections();
        c.populateHashMap();
        c.getHashMap().replace(1,"Dog","Flower");
        String act = c.getHashMap().get(1);
        String exp = "Flower";
        Assert.assertEquals(exp,act);
    }

    @Test
    public void hashMapReplaceKeyTest() {
        Collections c = new Collections();
        c.populateHashMap();
        c.getHashMap().replace(2,"Tree");
        String act = c.getHashMap().get(2);
        String exp = "Tree";
        Assert.assertEquals(exp,act);
    }

    @Test
    public void hashMapClearTest() {
        Collections c = new Collections();
        c.populateHashMap();
        c.getHashMap().clear();
        Integer act = c.getHashMap().size();
        Integer exp = 0;
        Assert.assertEquals(exp, act);
    }

    @Test
    public void hashMapCloneTest() {
        Collections c = new Collections();
        c.populateHashMap();
        HashMap cloned = (HashMap) c.getHashMap().clone();
        HashMap act = c.getHashMap();
        Assert.assertEquals(cloned, act);
    }

    @Test
    public void hashMapComputeTest() {
        Collections c = new Collections();
        c.populateHashMap();
        String act1 = c.getHashMap().compute(1,(k,v) -> v.toUpperCase(Locale.ROOT));
        String act2 = c.getHashMap().compute(2,(k,v) -> v.replace("Cat","Fox"));
        String act3 = c.getHashMap().compute(3, (k,v) -> v.concat("s can fly"));
        Assert.assertEquals("DOG",act1);
        Assert.assertEquals("Fox",act2);
        Assert.assertEquals("Birds can fly",act3);
    }

    @Test
    public void hashMapContainsKeyTest() {
        Collections c = new Collections();
        c.populateHashMap();
        Assert.assertTrue(c.getHashMap().containsKey(1));
        Assert.assertFalse(c.getHashMap().containsKey(10));
    }

    @Test
    public void hashMapEntrySetTest() {
        Collections c = new Collections();
        c.populateHashMap();
        System.out.println(c.getHashMap().entrySet());
    }

    @Test
    public void hashMapForEachTest() {
        Collections c = new Collections();
        c.populateHashMap();
        //c.getHashMap().forEach((k,v) -> v.toUpperCase());
        c.getHashMap().forEach((k,v) -> {
            System.out.printf("Key: %d Animal: %s\n", k,v);
        });
    }

    @Test
    public void hashMapPutAllTest() {
        Collections c = new Collections();
        c.populateHashMap();
        HashMap copiedMap = new HashMap();
        copiedMap.putAll(c.getHashMap());
        Assert.assertEquals(copiedMap,c.getHashMap());
    }
//==========================  Linked List Tests  ==========================

    @Test
    public void linkedListSizeTest(){
        Collections c = new Collections();
        c.populateLinkedList();
        Integer before = c.getLinkedList().size();
        c.getLinkedList().add("World");
        Integer after = c.getLinkedList().size();
        Assert.assertNotEquals(before,after);
    }

    @Test
    public void linkedListAddFirstAndLastTest(){
        Collections c = new Collections();
        c.populateLinkedList();
        c.getLinkedList().addFirst("Im First");
        c.getLinkedList().addLast("Im Last");
        Object first = c.getLinkedList().getFirst();
        Object last = c.getLinkedList().getLast();
        Object middle = c.getLinkedList().get(c.getLinkedList().size()-2);
        Assert.assertEquals(first,"Im First");
        Assert.assertEquals(last, "Im Last");
        Assert.assertEquals(middle,null);
    }

    @Test
    public void linkedListStreamTest(){
        Collections c = new Collections();
        Stream.of("Bird","Cat","Dog").forEach(animal -> c.getLinkedList().add(animal));
        System.out.println(c.getLinkedList());
    }

    //=======================  ArrayDeque Test  ===========================

    @Test
    public void dequeAddTest(){
        Collections c = new Collections();
        c.getArrayDeque().add(1);
        c.getArrayDeque().add(2);
        Assert.assertEquals(c.getArrayDeque().size(),2);

    }

    @Test
    public void dequeTest(){
        Collections c = new Collections();
        c.getArrayDeque().add(1);
        c.getArrayDeque().add(2);
        System.out.println(c.getArrayDeque().peek());
    }

    @Test
    public void dequeOfferTest() {
        Collections c = new Collections();
        c.getArrayDeque().add(1);
        c.getArrayDeque().add(2);
        c.getArrayDeque().offerFirst(5);
        c.getArrayDeque().offerLast(6);
        Assert.assertEquals(c.getArrayDeque().size(), 4);
        System.out.println(c.getArrayDeque().poll());
        System.out.println(c.getArrayDeque().pollFirst());
        System.out.println(c.getArrayDeque().pollLast());
        Assert.assertEquals(c.getArrayDeque().size(),1);
    }

    @Test
    public void dequePushTest() {
        Collections c = new Collections();
        c.getArrayDeque().add(1);
        c.getArrayDeque().add(2);
        c.getArrayDeque().offerLast(3);
        c.getArrayDeque().push(5);
        String actual = c.getArrayDeque().peek().toString();
        Assert.assertEquals("5",actual);
    }

    @Test
    public void dequePopTest() {
        Collections c = new Collections();
        c.getArrayDeque().add(1);
        c.getArrayDeque().add(2);
        c.getArrayDeque().pop();
        c.getArrayDeque().pop();
        Assert.assertEquals(0,c.getArrayDeque().size());
    }
}
