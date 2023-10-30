package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_134_Run_20231023_214133 {

    @Test
    public void testGetOptionProperties_optionDoesNotExist() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionProperties("opt")).thenReturn(new Properties());
        assertEquals(new Properties(), commandLine.getOptionProperties("opt"));
    }

    @Test
    public void testGetOptionProperties_optionHasNoArguments() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList());
        when(commandLine.getOptionProperties("opt")).thenReturn(new Properties());
        assertEquals(new Properties(), commandLine.getOptionProperties("opt"));
    }

    @Test
    public void testGetOptionProperties_optionHasOneArgument() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("arg1"));
        when(commandLine.getOptionProperties("opt")).thenReturn(new Properties());
        assertEquals(new Properties(), commandLine.getOptionProperties("opt"));
    }
}