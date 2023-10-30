package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

class CommandLineTest_Method_143_Run_20231027_212614 {

    @org.junit.jupiter.api.Test
    void testGetOptionValues_optionNotPresent() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);

        // When
        String[] values = commandLine.getOptionValues(option);

        // Then
        assertNull(values);
    }

    @org.junit.jupiter.api.Test
    void testGetOptionValues_optionPresentButNoValues() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        commandLine.addOption(option);

        // When
        String[] values = commandLine.getOptionValues(option);

        // Then
        assertNull(values);
    }

    @org.junit.jupiter.api.Test
    void testGetOptionValues_optionPresentAndHasValues() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        commandLine.addOption(option);
        when(option.getValuesList()).thenReturn(java.util.Arrays.asList("value1", "value2"));

        // When
        String[] values = commandLine.getOptionValues(option);

        // Then
        assertArrayEquals(new String[]{"value1", "value2"}, values);
    }
}