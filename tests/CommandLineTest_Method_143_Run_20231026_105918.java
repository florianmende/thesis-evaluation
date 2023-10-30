package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_143_Run_20231026_105918 {

    @Test
    public void testGetOptionValues_OptionNotSet() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option object
        Option option = mock(Option.class);

        // Set up the mocks
        when(commandLine.getOptionValues(option)).thenReturn(null);

        // Call the getOptionValues method and assert that it returns null
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    public void testGetOptionValues_OptionSetNoArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option object
        Option option = mock(Option.class);

        // Set up the mocks
        when(commandLine.getOptionValues(option)).thenReturn(new String[] {});

        // Call the getOptionValues method and assert that it returns an empty array
        assertArrayEquals(new String[] {}, commandLine.getOptionValues(option));
    }

    @Test
    public void testGetOptionValues_OptionSetWithArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option object
        Option option = mock(Option.class);

        // Set up the mocks
        when(commandLine.getOptionValues(option)).thenReturn(new String[] {"arg1", "arg2"});

        // Call the getOptionValues method and assert that it returns the correct array of values
        assertArrayEquals(new String[] {"arg1", "arg2"}, commandLine.getOptionValues(option));
    }
}