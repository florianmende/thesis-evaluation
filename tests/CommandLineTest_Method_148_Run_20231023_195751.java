package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_148_Run_20231023_195751 {

    @Test
    public void testHasOption_OptionSet() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "");
        commandLine.addOption(option);

        // Act
        boolean result = commandLine.hasOption('a');

        // Assert
        assertTrue(result);
    }

    @Test
    public void testHasOption_OptionNotSet() {
        // Arrange
        CommandLine commandLine = new CommandLine();

        // Act
        boolean result = commandLine.hasOption('a');

        // Assert
        assertFalse(result);
    }

    @Test
    public void testHasOption_InvalidOption() {
        // Arrange
        CommandLine commandLine = new CommandLine();

        // Act
        boolean result = commandLine.hasOption('z');

        // Assert
        assertFalse(result);
    }
}