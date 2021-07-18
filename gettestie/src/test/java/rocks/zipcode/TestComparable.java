package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestComparable {

    @Test
    public void TestEqual() {
        Person manny = new Person("Manny", 1998);
        Person mindy = new Person("Mindy", 1996);


        assertTrue(manny.getYearOfBirth() != mindy.getYearOfBirth());
    }


}
