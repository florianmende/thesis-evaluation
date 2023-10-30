package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_149_Run_20231028_052637 {

    @Test
    void testHasOption() {
        Option option = mock(Option.class);
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        assertTrue(commandLine.hasOption(option));
    }

    @Test
    void testHasOption_noOption() {
        Option option = mock(Option.class);
        CommandLine commandLine = new CommandLine.Builder().build();

        assertFalse(commandLine.hasOption(option));
    }

    @Test
    void testHasOption_nullOption() {
        Option option = null;
        CommandLine commandLine = new CommandLine.Builder().build();

        assertFalse(commandLine.hasOption(option));
    }
}