package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_136_Run_20231025_125643 {

    @Test
    public void testGetOptionValue() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValue(option)).thenReturn("value");
        assertEquals("value", commandLine.getOptionValue(option));
    }

    @Test
    public void testGetOptionValueWhenOptionNotSet() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValue(option)).thenReturn(null);
        assertNull(commandLine.getOptionValue(option));
    }

    @Test
    public void testGetOptionValueWhenOptionSetButNoArgument() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValue(option)).thenReturn(null);
        assertNull(commandLine.getOptionValue(option));
    }
}