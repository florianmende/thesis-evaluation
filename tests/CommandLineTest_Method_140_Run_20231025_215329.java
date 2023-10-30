package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class CommandLineTest_Method_140_Run_20231025_215329 {
    @Test
    public void testGetOptionValue_NoArguments() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the mock to return null when the getOptionValue method is called
        Mockito.when(commandLine.getOptionValue(Mockito.anyString())).thenReturn(null);

        // Call the getOptionValue method with a mock option
        String optionValue = commandLine.getOptionValue("mockOption");

        // Assert that the returned value is null
        assertNull(optionValue);
    }

    @Test
    public void testGetOptionValue_WithArguments() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the mock to return a mock option when the getOptionValue method is called
        Mockito.when(commandLine.getOptionValue(Mockito.anyString())).thenReturn("mockOption");

        // Call the getOptionValue method with a mock option
        String optionValue = commandLine.getOptionValue("mockOption");

        // Assert that the returned value is the mock option
        assertEquals("mockOption", optionValue);
    }

    @Test
    public void testGetOptionValue_NotSet() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the mock to return null when the getOptionValue method is called
        Mockito.when(commandLine.getOptionValue(Mockito.anyString())).thenReturn(null);

        // Call the getOptionValue method with a non-existent option
        String optionValue = commandLine.getOptionValue("nonExistentOption");

        // Assert that the returned value is null
        assertNull(optionValue);
    }
}