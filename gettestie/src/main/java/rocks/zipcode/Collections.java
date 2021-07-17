package rocks.zipcode;

import java.util.*;

public class Collections {

    private HashSet<String> hashSet = new HashSet<>();
    private ArrayList<String> arrList = new ArrayList<>();
    private HashMap<Integer, String> hashMap = new HashMap<>();
    private LinkedList linkedList = new LinkedList<>();
    private ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();


    public Collections(){
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<String> hashSet) {
        this.hashSet = hashSet;
    }

    public void populateHashSet() {
        hashSet.add("dog");
        hashSet.add("cat");
        hashSet.add("bear");
        hashSet.add("snake");
        hashSet.add("bird");
        hashSet.add("fish");
    }

    public ArrayList<String> getArrList() {
        return arrList;
    }

    public void setArrList(ArrayList<String> arrList) {
        this.arrList = arrList;
    }

    public void populateArrayList(){
        arrList.add("Joe");
        arrList.add("Ana");
        arrList.add("Larry");
        arrList.add("Beth");
        arrList.add("Brian");
    }

    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
    }

    public void populateHashMap(){
        hashMap.put(1,"Dog");
        hashMap.put(2,"Cat");
        hashMap.put(3,"Bird");
        hashMap.put(4,"Fish");
        hashMap.put(5,"Snake");

    }
    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public void populateLinkedList(){
        String[] animal = {"Dog","Cat","Bird"};
        HashMap<Integer,String> animalMap = new HashMap<>();
        animalMap.put(1,"Octopus");
        animalMap.put(2,"Shark");

        linkedList.add("Hello");
        linkedList.add(21);
        linkedList.add(99.9);
        linkedList.add(animal);
        linkedList.add(animalMap);
        linkedList.add(true);
        linkedList.add(null);

    }

    public ArrayDeque<Integer> getArrayDeque() {
        return arrayDeque;
    }

    public void setArrayDeque(ArrayDeque<Integer> arrayDeque) {
        this.arrayDeque = arrayDeque;
    }

}
