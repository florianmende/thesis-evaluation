package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_142_Run_20231028_022628 {

    @Mock
    private CommandLine commandLine;

    @Test
    public void testGetOptionValues_optionNotSet() {
        // Given
        when(commandLine.getOptionValues('a')).thenReturn(null);

        // When
        String[] actual = commandLine.getOptionValues('a');

        // Then
        assertArrayEquals(null, actual);
    }

    @Test
    public void testGetOptionValues_optionSetNoArgument() {
        // Given
        when(commandLine.getOptionValues('a')).thenReturn(new String[0]);

        // When
        String[] actual = commandLine.getOptionValues('a');

        // Then
        assertArrayEquals(new String[0], actual);
    }

    @Test
    public void testGetOptionValues_optionSetWithArgument() {
        // Given
        when(commandLine.getOptionValues('a')).thenReturn(new String[]{"arg1"});

        // When
        String[] actual = commandLine.getOptionValues('a');

        // Then
        assertArrayEquals(new String[]{"arg1"}, actual);
    }
}