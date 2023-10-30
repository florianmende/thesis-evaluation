package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_136_Run_20231028_022628 {

    @Test
    public void testGetOptionValueNotSet() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValue('a')).thenReturn(null);
        assertNull(commandLine.getOptionValue('a'));
    }

    @Test
    public void testGetOptionValueSetNoArg() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        when(commandLine.getOptionValue('a')).thenReturn(null);
        assertNull(commandLine.getOptionValue('a'));
    }

    @Test
    public void testGetOptionValueSetWithArg() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        when(option.getArgName()).thenReturn("arg");
        when(commandLine.getOptionValue('a')).thenReturn("value");
        assertEquals("value", commandLine.getOptionValue('a'));
    }
}