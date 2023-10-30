package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;

public class OptionTest_Method_89_Run_20231025_224954 {
    @Test
    public void testGetValuesListNoValues() {
        // create a mock Option object with no values
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(null);

        // test that the method returns null
        assertNull(option.getValuesList());
    }

    @Test
    public void testGetValuesListOneValue() {
        // create a mock Option object with one value
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("value1"));

        // test that the method returns a list with one element
        assertEquals(Arrays.asList("value1"), option.getValuesList());
    }

    @Test
    public void testGetValuesListMultipleValues() {
        // create a mock Option object with multiple values
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("value1", "value2", "value3"));

        // test that the method returns a list with multiple elements
        assertEquals(Arrays.asList("value1", "value2", "value3"), option.getValuesList());
    }
}