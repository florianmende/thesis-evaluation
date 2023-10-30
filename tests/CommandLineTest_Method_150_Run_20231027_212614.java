package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CommandLineTest_Method_150_Run_20231027_212614 {

    @Test
    public void testHasOption_optionSet() {
        // Set up
        CommandLine commandLine = new CommandLine();
        Option option = new Option("testOption", "testOption");
        commandLine.addOption(option);

        // Test
        assertTrue(commandLine.hasOption("testOption"));
    }

    @Test
    public void testHasOption_optionNotSet() {
        // Set up
        CommandLine commandLine = new CommandLine();

        // Test
        assertFalse(commandLine.hasOption("testOption"));
    }

    @Test
    public void testHasOption_optionNull() {
        // Set up
        CommandLine commandLine = new CommandLine();

        // Test
        assertFalse(commandLine.hasOption(""));
    }
}