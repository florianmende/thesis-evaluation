package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231027_222616 {

    @Test
    public void testHasOption() {
        // Case 1: The option has been set
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption('a'));

        // Case 2: The option has not been set
        commandLine = new CommandLine();
        assertFalse(commandLine.hasOption('a'));

        // Case 3: The option has been set but with a different character
        commandLine = new CommandLine();
        option = mock(Option.class);
        when(option.getOpt()).thenReturn("b");
        commandLine.addOption(option);
        assertFalse(commandLine.hasOption('a'));
    }
}