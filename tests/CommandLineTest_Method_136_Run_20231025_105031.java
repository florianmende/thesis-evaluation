package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandLineTest_Method_136_Run_20231025_105031 {
    @Test
    public void testGetOptionValue_optionNotSet() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return null for the option value
        Mockito.when(commandLine.getOptionValue(Mockito.anyChar())).thenReturn(null);

        // Call the method and check the result
        String result = commandLine.getOptionValue('a');
        assertNull(result);
    }

    @Test
    public void testGetOptionValue_optionSetNoArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return an empty string for the option value
        Mockito.when(commandLine.getOptionValue(Mockito.anyChar())).thenReturn("");

        // Call the method and check the result
        String result = commandLine.getOptionValue('a');
        assertEquals("", result);
    }

    @Test
    public void testGetOptionValue_optionSetWithArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return a non-empty string for the option value
        Mockito.when(commandLine.getOptionValue(Mockito.anyChar())).thenReturn("arg");

        // Call the method and check the result
        String result = commandLine.getOptionValue('a');
        assertEquals("arg", result);
    }
}