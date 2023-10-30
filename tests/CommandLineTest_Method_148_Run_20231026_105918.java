package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231026_105918 {

    @Test
    public void testHasOption_OptionSet() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption(option.getOpt())).thenReturn(true);
        assertTrue(commandLine.hasOption(option.getOpt()));
    }

    @Test
    public void testHasOption_OptionNotSet() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption(option.getOpt())).thenReturn(false);
        assertFalse(commandLine.hasOption(option.getOpt()));
    }

    @Test
    public void testHasOption_OptionSetMultipleTimes() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption(option.getOpt())).thenReturn(true, true, false);
        assertTrue(commandLine.hasOption(option.getOpt()));
        assertTrue(commandLine.hasOption(option.getOpt()));
        assertFalse(commandLine.hasOption(option.getOpt()));
    }
}