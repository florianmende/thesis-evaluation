package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231025_121248 {

    @Test
    public void testHasOption_optionSet() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("option"));
    }

    @Test
    public void testHasOption_optionNotSet() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("option");
        assertFalse(commandLine.hasOption("option"));
    }

    @Test
    public void testHasOption_invalidOption() {
        CommandLine commandLine = new CommandLine();
        assertFalse(commandLine.hasOption("invalidOption"));
    }
}