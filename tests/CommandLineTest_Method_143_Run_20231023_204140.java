package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandLineTest_Method_143_Run_20231023_204140 {

    @Test
    public void testGetOptionValues_optionNotSet() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return null for the getOptionValues() method
        Mockito.when(commandLine.getOptionValues(Mockito.any(Option.class))).thenReturn(null);

        // Call the getOptionValues() method with a mock Option object
        String[] values = commandLine.getOptionValues(Mockito.mock(Option.class));

        // Verify that the method returned null
        assertNull(values);
    }

    @Test
    public void testGetOptionValues_optionSetNoArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return an empty String[] array for the getOptionValues() method
        Mockito.when(commandLine.getOptionValues(Mockito.any(Option.class))).thenReturn(new String[0]);

        // Call the getOptionValues() method with a mock Option object
        String[] values = commandLine.getOptionValues(Mockito.mock(Option.class));

        // Verify that the method returned an empty String[] array
        assertArrayEquals(new String[0], values);
    }

    @Test
    public void testGetOptionValues_optionSetWithArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return a String[] array with the argument value for the getOptionValues() method
        Mockito.when(commandLine.getOptionValues(Mockito.any(Option.class))).thenReturn(new String[]{"arg"});

        // Call the getOptionValues() method with a mock Option object
        String[] values = commandLine.getOptionValues(Mockito.mock(Option.class));

        // Verify that the method returned a String[] array with the argument value
        assertArrayEquals(new String[]{"arg"}, values);
    }
}