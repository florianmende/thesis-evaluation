package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_140_Run_20231030_094427 {

    @Test
    void testGetOptionValue_NoArguments() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option instance
        Option option = mock(Option.class);

        // Set up the behavior of the mock CommandLine instance
        when(commandLine.getOptionValue(option)).thenReturn(null);

        // Call the method and assert the result
        String result = commandLine.getOptionValue(option);
        assertEquals(null, result);
    }

    @Test
    void testGetOptionValue_OneArgument() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option instance
        Option option = mock(Option.class);

        // Set up the behavior of the mock CommandLine instance
        when(commandLine.getOptionValue(option)).thenReturn("arg");

        // Call the method and assert the result
        String result = commandLine.getOptionValue(option);
        assertEquals("arg", result);
    }

    @Test
    void testGetOptionValue_MultipleArguments() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option instance
        Option option = mock(Option.class);

        // Set up the behavior of the mock CommandLine instance
        when(commandLine.getOptionValue(option)).thenReturn("arg1", "arg2");

        // Call the method and assert the result
        String result = commandLine.getOptionValue(option);
        assertEquals("arg1", result);
    }
}