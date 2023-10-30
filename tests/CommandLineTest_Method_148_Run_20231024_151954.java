package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231024_151954 {

    @Test
    void testHasOption() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption(option)).thenReturn(true);
        assertTrue(commandLine.hasOption(option));
    }

    @Test
    void testHasOptionWithNullOption() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = null;
        when(commandLine.hasOption(option)).thenReturn(false);
        assertFalse(commandLine.hasOption(option));
    }

    @Test
    void testHasOptionWithUnsetOption() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption(option)).thenReturn(false);
        assertFalse(commandLine.hasOption(option));
    }
}