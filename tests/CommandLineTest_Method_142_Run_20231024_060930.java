package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;

public class CommandLineTest_Method_142_Run_20231024_060930 {
    @Test
    public void testGetOptionValuesNotSet() throws ParseException {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the mock to return null for the option value
        Mockito.when(commandLine.getOptionValues(Mockito.anyString())).thenReturn(null);

        // Call the method and verify the result
        String[] values = commandLine.getOptionValues("test");
        Assertions.assertNull(values);
    }

    @Test
    public void testGetOptionValuesSetNoArgument() throws ParseException {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the mock to return an empty array for the option value
        Mockito.when(commandLine.getOptionValues(Mockito.anyString())).thenReturn(new String[0]);

        // Call the method and verify the result
        String[] values = commandLine.getOptionValues("test");
        Assertions.assertEquals(0, values.length);
    }

    @Test
    public void testGetOptionValuesSetWithArgument() throws ParseException {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the mock to return an array with a single value for the option value
        Mockito.when(commandLine.getOptionValues(Mockito.anyString())).thenReturn(new String[] {"test"});

        // Call the method and verify the result
        String[] values = commandLine.getOptionValues("test");
        Assertions.assertEquals(1, values.length);
        Assertions.assertEquals("test", values[0]);
    }
}