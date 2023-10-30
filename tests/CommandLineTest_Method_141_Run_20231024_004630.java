package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_141_Run_20231024_004630 {

    @Test
    public void testGetOptionValue_optionNotSpecified() {
        // Set up the mocks
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValue(option, null)).thenReturn(null);

        // Call the method
        String actualValue = commandLine.getOptionValue(option, null);

        // Verify the result
        assertNull(actualValue);
    }

    @Test
    public void testGetOptionValue_optionSpecifiedWithValue() {
        // Set up the mocks
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValue(option, null)).thenReturn("value");

        // Call the method
        String actualValue = commandLine.getOptionValue(option, null);

        // Verify the result
        assertEquals("value", actualValue);
    }

    @Test
    public void testGetOptionValue_optionSpecifiedWithoutValue() {
        // Set up the mocks
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValue(option, null)).thenReturn("");

        // Call the method
        String actualValue = commandLine.getOptionValue(option, null);

        // Verify the result
        assertEquals("", actualValue);
    }
}