package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_136_Run_20231024_060930 {
    @Test
    public void testGetOptionValueNotSet() {
        // Set up mock CommandLine object
        CommandLine mockCommandLine = Mockito.mock(CommandLine.class);
        when(mockCommandLine.getOptionValue("opt")).thenReturn(null);

        // Test that the method returns null when the option is not set
        assertNull(mockCommandLine.getOptionValue("opt"));
    }

    @Test
    public void testGetOptionValueNoArgument() {
        // Set up mock CommandLine object
        CommandLine mockCommandLine = Mockito.mock(CommandLine.class);
        when(mockCommandLine.getOptionValue("opt")).thenReturn("");

        // Test that the method returns an empty string when the option is set, but has no argument
        assertEquals("", mockCommandLine.getOptionValue("opt"));
    }

    @Test
    public void testGetOptionValueWithArgument() {
        // Set up mock CommandLine object
        CommandLine mockCommandLine = Mockito.mock(CommandLine.class);
        when(mockCommandLine.getOptionValue("opt")).thenReturn("arg");

        // Test that the method returns the argument value when the option is set, and has an argument
        assertEquals("arg", mockCommandLine.getOptionValue("opt"));
    }
}