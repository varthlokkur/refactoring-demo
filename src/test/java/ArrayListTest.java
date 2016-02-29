import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.fest.assertions.Assertions.*;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayListTest {
    @Test
    public void shouldSizeIncrementedWhenElementAdded() {
        //region Given
        ArrayList sut = new ArrayList();
        assumeTrue(sut.isEmpty());
        Object dummy = new Object();
        //endregion

        //region When
        sut.add(dummy);
        //endregion

        //region Then
        assertThat(sut).isNotEmpty();
        //endregion
    }

    @Test
    public void shouldRelyOnElementsToStringWhenToString() {
        //region Given
        ArrayList sut = new ArrayList();
        Object stub = mock(Object.class);
        when(stub.toString()).thenReturn("test string");
        sut.add(stub);
        //endregion

        //region When
        String result = sut.toString();
        //endregion

        //region Then
        assertThat(result).contains("test string");
        //endregion
    }
}
