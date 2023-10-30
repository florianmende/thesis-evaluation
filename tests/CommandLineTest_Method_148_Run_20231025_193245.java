package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CommandLineTest_Method_148_Run_20231025_193245 {

    @Test
    void testHasOption() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Add an option to the command line
        commandLine.addOption(new Option("a", ""));

        // Test that the option has been set
        Assertions.assertTrue(commandLine.hasOption('a'));

        // Test that the option has not been set
        Assertions.assertFalse(commandLine.hasOption('b'));

        // Test that the option is not recognized
        Assertions.assertFalse(commandLine.hasOption('c'));
    }
}