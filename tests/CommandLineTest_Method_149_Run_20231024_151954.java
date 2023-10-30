package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_149_Run_20231024_151954 {

    @Test
    public void testHasOption() {
        // Create a CommandLine object and add an Option object to it
        CommandLine commandLine = new CommandLine.Builder().addOption(new Option("a", "aaa")).build();

        // Test case 1: The option is set
        Option option = new Option("a", "aaa");
        Assertions.assertTrue(commandLine.hasOption(option));

        // Test case 2: The option is not set
        option = new Option("b", "bbb");
        Assertions.assertFalse(commandLine.hasOption(option));

        // Test case 3: The option is null
        option = null;
        Assertions.assertFalse(commandLine.hasOption(option));
    }
}