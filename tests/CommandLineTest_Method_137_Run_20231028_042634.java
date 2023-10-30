package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_137_Run_20231028_042634 {

    @Test
    public void testGetOptionValueNotSpecified() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue('a', "defaultValue")).thenReturn("defaultValue");
        assertEquals("defaultValue", commandLine.getOptionValue('a', "defaultValue"));
    }

    @Test
    public void testGetOptionValueSpecifiedNoArgument() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue('a', "defaultValue")).thenReturn("");
        assertEquals("", commandLine.getOptionValue('a', "defaultValue"));
    }

    @Test
    public void testGetOptionValueSpecifiedWithArgument() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getOptionValue('a', "defaultValue")).thenReturn("argument");
        assertEquals("argument", commandLine.getOptionValue('a', "defaultValue"));
    }
}