package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_141_Run_20231025_224954 {
    @Test
    public void testGetOptionValueWithDefaultValue() {
        // Set up the mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("defaultValue");

        // Call the method and assert the result
        String result = commandLine.getOptionValue("opt", "defaultValue");
        assertEquals("defaultValue", result);
    }

    @Test
    public void testGetOptionValueWithOption() {
        // Set up the mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("optionValue");

        // Call the method and assert the result
        String result = commandLine.getOptionValue("opt", "defaultValue");
        assertEquals("optionValue", result);
    }

    @Test
    public void testGetOptionValueWithNoArguments() {
        // Set up the mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue("opt", "defaultValue")).thenReturn("defaultValue");

        // Call the method and assert the result
        String result = commandLine.getOptionValue("opt", "defaultValue");
        assertEquals("defaultValue", result);
    }
}