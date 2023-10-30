package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_143_Run_20231024_060930 {

    @Test
    void testGetOptionValues_OptionSetAndHasArgument() {
        // Arrange
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("value1", "value2"));
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);

        // Act
        String[] values = commandLine.getOptionValues(option);

        // Assert
        assertArrayEquals(new String[]{"value1", "value2"}, values);
    }

    @Test
    void testGetOptionValues_OptionSetButHasNoArgument() {
        // Arrange
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of());
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);

        // Act
        String[] values = commandLine.getOptionValues(option);

        // Assert
        assertNull(values);
    }

    @Test
    void testGetOptionValues_OptionNotSet() {
        // Arrange
        Option option = Mockito.mock(Option.class);
        CommandLine commandLine = new CommandLine();

        // Act
        String[] values = commandLine.getOptionValues(option);

        // Assert
        assertNull(values);
    }
}