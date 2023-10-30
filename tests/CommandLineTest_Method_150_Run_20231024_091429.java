package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class CommandLineTest_Method_150_Run_20231024_091429 {

    @Test
    public void testHasOptionNotSet() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.hasOption("opt")).thenReturn(false);
        Assertions.assertFalse(commandLine.hasOption("opt"));
    }

    @Test
    public void testHasOptionSet() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.hasOption("opt")).thenReturn(true);
        Assertions.assertTrue(commandLine.hasOption("opt"));
    }

    @Test
    public void testHasOptionSetWithValue() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.hasOption("opt")).thenReturn(true);
        Mockito.when(commandLine.getOptionValue("opt")).thenReturn("value");
        Assertions.assertTrue(commandLine.hasOption("opt"));
        Assertions.assertEquals("value", commandLine.getOptionValue("opt"));
    }
}