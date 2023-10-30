package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_142_Run_20231023_195751 {

    @Test
    void testGetOptionValuesNotSet() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValues("a")).thenReturn(null);
        assertNull(commandLine.getOptionValues("a"));
    }

    @Test
    void testGetOptionValuesSetNoArg() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValues("a")).thenReturn(new String[0]);
        assertArrayEquals(new String[0], commandLine.getOptionValues("a"));
    }

    @Test
    void testGetOptionValuesSetWithArg() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValues("a")).thenReturn(new String[] {"arg1"});
        assertArrayEquals(new String[] {"arg1"}, commandLine.getOptionValues("a"));
    }
}