package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_149_Run_20231030_094427 {

    @Test
    public void testHasOption() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option instance
        Option option = mock(Option.class);

        // Set up the mock CommandLine instance to return false for a non-existent option
        when(commandLine.hasOption(option)).thenReturn(false);

        // Test that the method returns false for a non-existent option
        assertFalse(commandLine.hasOption(option));

        // Set up the mock CommandLine instance to return true for an existing option
        when(commandLine.hasOption(option)).thenReturn(true);

        // Test that the method returns true for an existing option
        assertTrue(commandLine.hasOption(option));

        // Set up the mock CommandLine instance to return true for an existing option with multiple values
        when(commandLine.hasOption(option)).thenReturn(true);
        when(commandLine.getOptionValues(option)).thenReturn(new String[] {"value1", "value2"});

        // Test that the method returns true for an existing option with multiple values
        assertTrue(commandLine.hasOption(option));
    }
}