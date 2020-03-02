import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.tools.tree.NewArrayExpression;

import java.util.LinkedList;

public class TestLinkedList {
    @Before
    public void setUp() throws Exception {
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    @Test
    public void TestLinkedList1() {
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("April");
        newLinkedList.add("Cameron");
        newLinkedList.add("Chelsea");

        Assert.assertEquals("[April, Cameron, Chelsea]", newLinkedList.toString());
    }

    @Test
    public void TestLinkedListRemove() {
        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("April");
        newLinkedList.add("Howard");
        newLinkedList.add("Cameron");
        newLinkedList.add("Brittany");

        newLinkedList.removeFirstOccurrence("Howard");

        Assert.assertEquals("[April, Cameron, Brittany]", newLinkedList.toString());
    }
}
