package intro;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

/**
 * SUT: system under test
 * Test Case: class
 * Test, Test scenario: method
 */
public class ArrayListTest { //SUT = ArrayList
    @Test(timeout = 5_000)
    public void
    itShouldSizeIncrementedAddedWhenDoAddElement() { //BDD: Domain Lang
        //region Fixture | Arrange | Given
        ArrayList<Object> sut = new ArrayList<>();
        Object dummy = new Object();
        assumeTrue(sut.size() == 0); //Pending | Ignored
        //endregion

        //region Act | When
        sut.add(dummy);
        //endregion

        //region Assert | Then
        /**
         * AssertionError | Failure
         */
        assertEquals(1, sut.size());
        assertTrue("".contains(""));

        String s1 = new String("a");
        String s2 = "a";
        System.out.println(s1.equals("a"));
        //endregion
    }

//    @Test(expected = NullPointerException.class)
//    public void itShouldGetErrorWhenSutIsNull() {
//        ArrayList sut = null;
//        sut.add("");
//    }
}
