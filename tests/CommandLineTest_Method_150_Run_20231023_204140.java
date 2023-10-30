package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_150_Run_20231023_204140 {

    @Test
    public void testHasOption_OptionSet() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(new Option("opt", "option"));

        // Act
        boolean result = commandLine.hasOption("opt");

        // Assert
        assertTrue(result);
    }

    @Test
    public void testHasOption_OptionNotSet() {
        // Arrange
        CommandLine commandLine = new CommandLine();

        // Act
        boolean result = commandLine.hasOption("opt");

        // Assert
        assertFalse(result);
    }

    @Test
    public void testHasOption_OptionSetButValueIsNull() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(new Option("opt", "option"));

        // Act
        boolean result = commandLine.hasOption("opt");

        // Assert
        assertTrue(result);
    }
}