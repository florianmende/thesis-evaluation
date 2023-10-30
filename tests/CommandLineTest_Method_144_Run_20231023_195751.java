package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_144_Run_20231023_195751 {
    @Test
    public void testGetOptionValues_OptionNotSet() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValues("opt")).thenReturn(null);
        assertNull(commandLine.getOptionValues("opt"));
    }

    @Test
    public void testGetOptionValues_OptionSetNoArguments() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValues("opt")).thenReturn(new String[0]);
        when(option.getValues()).thenReturn(new String[0]);
        assertArrayEquals(new String[0], commandLine.getOptionValues("opt"));
    }

    @Test
    public void testGetOptionValues_OptionSetWithArguments() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValues("opt")).thenReturn(new String[] {"arg1", "arg2"});
        when(option.getValues()).thenReturn(new String[] {"arg1", "arg2"});
        assertArrayEquals(new String[] {"arg1", "arg2"}, commandLine.getOptionValues("opt"));
    }
}