package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_143_Run_20231024_080105 {

    @Test
    void testGetOptionValues_optionSetAndHasValues() {
        // Arrange
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("value1", "value2"));
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        // Act
        String[] values = commandLine.getOptionValues(option);

        // Assert
        assertArrayEquals(new String[]{"value1", "value2"}, values);
    }

    @Test
    void testGetOptionValues_optionSetButNoValues() {
        // Arrange
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of());
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        // Act
        String[] values = commandLine.getOptionValues(option);

        // Assert
        assertNull(values);
    }

    @Test
    void testGetOptionValues_optionNotSet() {
        // Arrange
        Option option = mock(Option.class);
        CommandLine commandLine = new CommandLine.Builder().build();

        // Act
        String[] values = commandLine.getOptionValues(option);

        // Assert
        assertNull(values);
    }
}