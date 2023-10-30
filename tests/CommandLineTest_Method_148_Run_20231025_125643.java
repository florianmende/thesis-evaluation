package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

class CommandLineTest_Method_148_Run_20231025_125643 {

    @Test
    void testHasOptionWithMatchingOption() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);

        // Act
        boolean result = commandLine.hasOption('a');

        // Assert
        assertTrue(result);
    }

    @Test
    void testHasOptionWithNonMatchingOption() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);

        // Act
        boolean result = commandLine.hasOption('b');

        // Assert
        assertFalse(result);
    }

    @Test
    void testHasOptionWithNoOption() {
        // Arrange
        CommandLine commandLine = new CommandLine();

        // Act
        boolean result = commandLine.hasOption('a');

        // Assert
        assertFalse(result);
    }
}