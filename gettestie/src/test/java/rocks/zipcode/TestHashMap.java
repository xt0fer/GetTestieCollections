package rocks.zipcode;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class TestHashMap {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMap1(){
        HashMap<String, String[]> newHashMap = new HashMap<>();
        String[] newArray = {"One", "Two", "Three", "Four", "Five"};

        newHashMap.put("Numbers", newArray);

        assertEquals(newArray.toString(), newHashMap.get("Numbers").toString());
    }

    @org.junit.Test
    public void TestHashMap2(){
        HashMap<String, String[]> newHashMap = new HashMap<>();
        String[] newArray = {"One", "Two", "Three", "Four", "Five"};
        String[] newArray2 = {"Dog", "Cat", "Cow"};
        String[] newArray3 = {"Jim", "Pam", "Angela", "Oscar"};

        newHashMap.put("Numbers", newArray);
        newHashMap.put("Animals", newArray2);
        newHashMap.put("Names", newArray3);

        newHashMap.clear();

        assertEquals(true, newHashMap.isEmpty());
    }

    @org.junit.Test
    public void TestHashMap3(){
        HashMap<String, String> newHashMap = new HashMap<>();

        newHashMap.put("Front Desk", "Pam Beesly");
        newHashMap.put("Sales", "Jim Halpert");
        newHashMap.put("Manager", "Michael Scott");

        assertEquals(false, newHashMap.containsKey("Accounting"));
    }

    @org.junit.Test
    public void TestHashMap4() {
        HashMap<String, String> newHashMap = new HashMap<>();

        newHashMap.put("Front Desk", "Pam Beesly");
        newHashMap.put("Sales", "Jim Halpert");
        newHashMap.put("Manager", "Michael Scott");

        assertEquals("Jim Halpert", newHashMap.get("Sales"));
    }

    @org.junit.Test
    public void TestHashMap5(){
        HashMap<String, String> newHashMap = new HashMap<>();

        newHashMap.put("Sales", "Stanley Hudson");
        newHashMap.put("Sales", "Jim Halpert");
        newHashMap.put("Manager", "Michael Scott");

        assertEquals(2, newHashMap.size());
    }
}
