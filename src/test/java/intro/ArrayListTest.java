package intro;

import com.scrumtrek.simplestore.Rental;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assume.assumeTrue;
import static org.mockito.Mockito.*;

/**
 * SUT: system under test
 * Test Case: class
 * Test, Test scenario: method
 */
@Ignore
@RunWith(MockitoJUnitRunner.class)
public class ArrayListTest { //SUT = ArrayList
    private ArrayList<Object> sut;
    @InjectMocks private Rental my;

    @Before
    public void setUp() {
        sut = new ArrayList<>();
    }

    @Test(timeout = 5_000)
    public void itShouldSizeIncrementedAddedWhenDoAddElement() { //BDD: Domain Lang
        //region Fixture | Arrange | Given
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
        assertThat(sut.size()).isEqualTo(1);
        assertThat(sut).doesNotContain(2).doesNotContain(1);
        //endregion
    }

    @Test(expected = NullPointerException.class)
    public void itShouldGetErrorWhenSutIsNull() {
        ArrayList sut = null;
        sut.add("");
    }

    @Test
    public void shouldUseElementsToStringWhenToString() {
        ArrayList<Object> sut = new ArrayList<>();
        Object stub = mock(Object.class);
        when(stub.toString())
                .thenReturn("test string")
                .thenReturn("test string");
        sut.add(stub);

        String result = sut.toString();

        assertThat(result).contains("test string");
    }

    @Test
    public void shouldCallElementsToStringWhenToString() {
        ArrayList<Object> sut = new ArrayList<>();
        Object mock = mock(Object.class);
        sut.add(mock);

        sut.toString();

        verify(mock, times(2))
                .toString();
//                .toString(anyString());
    }

    @Test
    public void test() {
        new RentalBuilder()
                .withMoviewName()
                .withPriceCode()
                .withDaysRented()
                .withPreGeneratedCollection()
            .build();
    }

}
