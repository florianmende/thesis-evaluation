package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_150_Run_20231025_125643 {

    @Test
    void testHasOption() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Case 1: The option has been set
        Option option = new Option("a", "test option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("a"));

        // Case 2: The option has not been set
        assertFalse(commandLine.hasOption("b"));

        // Case 3: The option is not recognized
        assertFalse(commandLine.hasOption("c"));
    }
}