package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231023_204140 {

    @Test
    public void testHasOption() {
        // Case 1: The option is set
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption('a'));

        // Case 2: The option is not set
        commandLine = new CommandLine();
        assertFalse(commandLine.hasOption('b'));

        // Case 3: The option is set but with a different case
        commandLine = new CommandLine();
        option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption('a'));
    }
}