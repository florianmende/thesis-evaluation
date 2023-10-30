package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_142_Run_20231023_214133 {

    @Test
    public void testGetOptionValuesNotSet() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Call the method with a character name of an option that is not set
        String[] values = commandLine.getOptionValues('a');

        // Verify that the method returns null
        assertNull(values);
    }

    @Test
    public void testGetOptionValuesSetWithArguments() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return a non-null value for the option
        Mockito.when(commandLine.getOptionValues('a')).thenReturn(new String[]{"arg1", "arg2"});

        // Call the method with a character name of an option that is set
        String[] values = commandLine.getOptionValues('a');

        // Verify that the method returns the correct values
        assertArrayEquals(new String[]{"arg1", "arg2"}, values);
    }

    @Test
    public void testGetOptionValuesSetWithNoArguments() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return a null value for the option
        Mockito.when(commandLine.getOptionValues('a')).thenReturn(null);

        // Call the method with a character name of an option that is set
        String[] values = commandLine.getOptionValues('a');

        // Verify that the method returns null
        assertNull(values);
    }
}