package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_149_Run_20231024_165833 {

    @Test
    public void testHasOption() {
        Option option = Mockito.mock(Option.class);
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();
        assertTrue(commandLine.hasOption(option));
    }

    @Test
    public void testHasOption_notInList() {
        Option option = Mockito.mock(Option.class);
        CommandLine commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption(option));
    }

    @Test
    public void testHasOption_emptyList() {
        Option option = Mockito.mock(Option.class);
        CommandLine commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption(option));
    }
}