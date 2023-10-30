package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_142_Run_20231030_094427 {

    @Test
    public void testGetOptionValuesWithArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return an array of values for the given option
        when(commandLine.getOptionValues("opt")).thenReturn(new String[]{"value1", "value2"});

        // Call the method and check the result
        String[] values = commandLine.getOptionValues("opt");
        assertArrayEquals(new String[]{"value1", "value2"}, values);
    }

    @Test
    public void testGetOptionValuesWithNoArgument() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return null for the given option
        when(commandLine.getOptionValues("opt")).thenReturn(null);

        // Call the method and check the result
        String[] values = commandLine.getOptionValues("opt");
        assertNull(values);
    }

    @Test
    public void testGetOptionValuesWithNoOption() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Call the method and check the result
        String[] values = commandLine.getOptionValues("opt");
        assertNull(values);
    }
}