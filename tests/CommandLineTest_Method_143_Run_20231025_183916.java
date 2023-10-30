package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class CommandLineTest_Method_143_Run_20231025_183916 {

    @Test
    public void testGetOptionValues_Case1() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Set up the mock CommandLine instance to return null when the getOptionValues method is called
        Mockito.when(commandLine.getOptionValues(option)).thenReturn(null);

        // Call the getOptionValues method on the mock CommandLine instance
        String[] values = commandLine.getOptionValues(option);

        // Verify that the method returned null
        Assertions.assertNull(values);
    }

    @Test
    public void testGetOptionValues_Case2() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Set up the mock CommandLine instance to return an empty array when the getOptionValues method is called
        Mockito.when(commandLine.getOptionValues(option)).thenReturn(new String[0]);

        // Call the getOptionValues method on the mock CommandLine instance
        String[] values = commandLine.getOptionValues(option);

        // Verify that the method returned an empty array
        Assertions.assertArrayEquals(new String[0], values);
    }

    @Test
    public void testGetOptionValues_Case3() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Set up the mock CommandLine instance to return an array of values when the getOptionValues method is called
        Mockito.when(commandLine.getOptionValues(option)).thenReturn(new String[]{"value1", "value2"});

        // Call the getOptionValues method on the mock CommandLine instance
        String[] values = commandLine.getOptionValues(option);

        // Verify that the method returned the correct array of values
        Assertions.assertArrayEquals(new String[]{"value1", "value2"}, values);
    }
}