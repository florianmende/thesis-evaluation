package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_149_Run_20231024_004630 {

    @Test
    public void testHasOption() {
        // Case 1: The option is present in the CommandLine object
        CommandLine commandLine = new CommandLine.Builder()
                .addOption(new Option("option1", "option1 description"))
                .build();
        Option option = new Option("option1", "option1 description");
        Assertions.assertTrue(commandLine.hasOption(option));

        // Case 2: The option is not present in the CommandLine object
        commandLine = new CommandLine.Builder()
                .addOption(new Option("option2", "option2 description"))
                .build();
        option = new Option("option1", "option1 description");
        Assertions.assertFalse(commandLine.hasOption(option));

        // Case 3: The option is null
        commandLine = new CommandLine.Builder()
                .addOption(new Option("option1", "option1 description"))
                .build();
        option = null;
        Assertions.assertFalse(commandLine.hasOption(option));
    }
}