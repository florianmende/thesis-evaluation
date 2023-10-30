package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_149_Run_20231025_183916 {

    @Test
    public void testHasOption() {
        // Case 1: The option is present in the options list
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption(option));

        // Case 2: The option is not present in the options list
        commandLine = new CommandLine();
        option = mock(Option.class);
        assertFalse(commandLine.hasOption(option));

        // Case 3: The option is null
        commandLine = new CommandLine();
        assertFalse(commandLine.hasOption((Option) null));
    }
}