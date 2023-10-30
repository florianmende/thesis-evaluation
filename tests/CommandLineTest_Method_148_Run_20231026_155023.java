package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_148_Run_20231026_155023 {
    private CommandLine commandLine = new CommandLine();

    @Test
    public void testHasOption_optionSet() {
        // Set up: create a new CommandLine instance and add an option
        commandLine.addOption(new Option("a", "optionA"));

        // Test: check if the option has been set
        assertTrue(commandLine.hasOption('a'));
    }

    @Test
    public void testHasOption_optionNotSet() {
        // Test: check if the option has not been set
        assertFalse(commandLine.hasOption('b'));
    }

    @Test
    public void testHasOption_optionSetButDifferentCharacter() {
        // Set up: create a new CommandLine instance and add an option
        commandLine.addOption(new Option("a", "optionA"));

        // Test: check if the option has been set with a different character
        assertFalse(commandLine.hasOption('b'));
    }
}