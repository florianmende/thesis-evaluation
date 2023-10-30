package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_137_Run_20231023_204140 {

    @Test
    public void testGetOptionValue_defaultValue() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock to return the default value
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("defaultValue");

        // Verify that the method returns the default value
        assertEquals("defaultValue", commandLine.getOptionValue("opt", "defaultValue"));
    }

    @Test
    public void testGetOptionValue_optionSpecified() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock to return the option value
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("optionValue");

        // Verify that the method returns the option value
        assertEquals("optionValue", commandLine.getOptionValue("opt", "defaultValue"));
    }

    @Test
    public void testGetOptionValue_optionSpecifiedNoValue() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock to return an empty string
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("");

        // Verify that the method returns an empty string
        assertEquals("", commandLine.getOptionValue("opt", "defaultValue"));
    }
}