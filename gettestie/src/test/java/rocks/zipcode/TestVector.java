package rocks.zipcode;

import com.sun.codemodel.internal.util.UnicodeEscapeWriter;
import org.junit.Before;

import java.util.Vector;

public class TestVector {
    private Vector vector;
    private Vector v_clone;

    @Before
    public void setUp() {
        vector = new Vector();
        v_clone = new Vector();
        vector.add("You");
        vector.add("Got");
        vector.add("This");
    }
}
