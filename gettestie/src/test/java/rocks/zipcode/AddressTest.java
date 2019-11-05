package rocks.zipcode;


import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class AddressTest {

private static final Logger LOGGER = Logger.getLogger(AddressTest.class.getName());

    @Test
    public void testHashMap() {

        String name = "Valentin";
        int age = 25;

        Person testPerson = new Person(name,age);
        Map<String,Person> testMap = new HashMap<>();

        testMap.put(name,testPerson);

        String expected = testPerson.toString();
        String actual = "Name: " + testMap.get(name).getName() +
            "\nYear of birth: " + testMap.get(name).getYearOfBirth() + "\n";

        Assert.assertEquals(expected,actual);
        LOGGER.log(Level.INFO,expected);

    }
}
