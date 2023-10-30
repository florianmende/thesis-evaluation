package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_71_Run_20231024_082502 {
    @Test
    public void testAddValue() {
        // Create a mock Option instance
        Option option = mock(Option.class);

        // Set up the mock to return a value when addValue is called
        when(option.addValue("test")).thenReturn(true);

        // Call the addValue method and verify that it returns true
        assertEquals(true, option.addValue("test"));
    }

    @Test
    public void testAddValueThrowsException() {
        // Create a mock Option instance
        Option option = mock(Option.class);

        // Set up the mock to throw an exception when addValue is called
        when(option.addValue("test")).thenThrow(new UnsupportedOperationException());

        // Call the addValue method and verify that it throws an exception
        assertThrows(UnsupportedOperationException.class, () -> option.addValue("test"));
    }
}