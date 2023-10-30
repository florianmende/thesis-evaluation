package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CommandLineTest_Method_149_Run_20231028_042634 {
    @Test
    void testHasOption() {
        // Case 1: The option is present in the list of options
        Option option = Mockito.mock(Option.class);
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption(option));

        // Case 2: The option is not present in the list of options
        Option option2 = Mockito.mock(Option.class);
        assertFalse(commandLine.hasOption(option2));

        // Case 3: The list of options is empty
        CommandLine commandLine2 = new CommandLine();
        assertFalse(commandLine2.hasOption(option));
    }
}