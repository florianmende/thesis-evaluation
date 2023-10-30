package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Util;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_137_Run_20231024_082502 {

    @Test
    public void testGetOptionValueDefaultValue() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock to return the default value
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("defaultValue");

        // Verify that the method returns the default value
        assertEquals("defaultValue", commandLine.getOptionValue("opt", "defaultValue"));
    }

    @Test
    public void testGetOptionValueWithArgument() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock to return a value for the option
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("value");

        // Verify that the method returns the value for the option
        assertEquals("value", commandLine.getOptionValue("opt", "defaultValue"));
    }

    @Test
    public void testGetOptionValueWithMultipleArguments() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock to return a value for the option
        when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("value1,value2");

        // Verify that the method returns the value for the option
        assertEquals("value1,value2", commandLine.getOptionValue("opt", "defaultValue"));
    }
}