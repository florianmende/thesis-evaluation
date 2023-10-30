package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_149_Run_20231027_222616 {

    @Test
    public void testHasOption() {
        // Case 1: The option is present in the list of processed options.
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption(option));

        // Case 2: The option is not present in the list of processed options.
        commandLine = new CommandLine();
        Option option2 = mock(Option.class);
        when(option2.getOpt()).thenReturn("option2");
        assertFalse(commandLine.hasOption(option2));

        // Case 3: The list of processed options is empty.
        commandLine = new CommandLine();
        assertFalse(commandLine.hasOption(option));
    }
}