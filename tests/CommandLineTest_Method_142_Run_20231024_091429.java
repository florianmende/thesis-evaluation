package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_142_Run_20231024_091429 {

    @Mock
    private CommandLine commandLine;

    @Test
    public void testGetOptionValues_OptionSetAndHasArgument() {
        // Given
        String[] expectedValues = new String[]{"value1", "value2"};
        when(commandLine.getOptionValues("opt")).thenReturn(expectedValues);

        // When
        String[] actualValues = commandLine.getOptionValues("opt");

        // Then
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testGetOptionValues_OptionSetButNoArgument() {
        // Given
        String[] expectedValues = new String[]{};
        when(commandLine.getOptionValues("opt")).thenReturn(expectedValues);

        // When
        String[] actualValues = commandLine.getOptionValues("opt");

        // Then
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testGetOptionValues_OptionNotSet() {
        // Given
        String[] expectedValues = null;
        when(commandLine.getOptionValues("opt")).thenReturn(expectedValues);

        // When
        String[] actualValues = commandLine.getOptionValues("opt");

        // Then
        assertArrayEquals(expectedValues, actualValues);
    }
}