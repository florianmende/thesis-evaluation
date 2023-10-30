package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_149_Run_20231024_082502 {

    @Test
    public void testHasOption() {
        // Case 1: The option is not set
        CommandLine commandLine = new CommandLine.Builder().build();
        Option option = new Option("test", false, "This is a test option");
        assertFalse(commandLine.hasOption(option));

        // Case 2: The option is set
        commandLine = new CommandLine.Builder().addOption(option).build();
        assertTrue(commandLine.hasOption(option));

        // Case 3: The option is not set, but the CommandLine instance contains other options
        commandLine = new CommandLine.Builder().addArg("test").build();
        assertFalse(commandLine.hasOption(option));
    }
}