package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_137_Run_20231026_155023 {

    @Test
    public void testGetOptionValue_optionNotSpecified() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("defaultValue");

        // Test the method
        String result = commandLine.getOptionValue("opt", "defaultValue");
        assertEquals("defaultValue", result);
    }

    @Test
    public void testGetOptionValue_optionSpecifiedWithoutArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("");

        // Test the method
        String result = commandLine.getOptionValue("opt", "defaultValue");
        assertEquals("", result);
    }

    @Test
    public void testGetOptionValue_optionSpecifiedWithArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("argument");

        // Test the method
        String result = commandLine.getOptionValue("opt", "defaultValue");
        assertEquals("argument", result);
    }
}