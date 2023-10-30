package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_143_Run_20231025_224954 {

    @Test
    public void testGetOptionValuesNull() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        when(commandLine.getOptionValues(Mockito.any(Option.class))).thenReturn(null);

        // Test that the method returns null when no option is found
        assertNull(commandLine.getOptionValues(new Option("test", "test option")));
    }

    @Test
    public void testGetOptionValues() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        Option option = new Option("test", "test option");
        String[] values = new String[] {"value1", "value2"};
        when(commandLine.getOptionValues(option)).thenReturn(values);

        // Test that the method returns the correct values for an option that has been added to the command line
        assertEquals(values, commandLine.getOptionValues(option));
    }

    @Test
    public void testGetOptionValuesNotAdded() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        Option option = new Option("test", "test option");
        String[] values = new String[] {"value1", "value2"};
        when(commandLine.getOptionValues(option)).thenReturn(values);

        // Test that the method returns null for an option that has not been added to the command line
        assertNull(commandLine.getOptionValues(new Option("test2", "test option 2")));
    }
}