package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_144_Run_20231026_155023 {

    @Mock
    private CommandLine commandLine;

    @Mock
    private Option option;

    @Test
    public void testGetOptionValues_null() {
        when(commandLine.getOptionValues(option)).thenReturn(null);
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    public void testGetOptionValues_empty() {
        when(commandLine.getOptionValues(option)).thenReturn(new String[0]);
        assertEquals(0, commandLine.getOptionValues(option).length);
    }

    @Test
    public void testGetOptionValues_values() {
        String[] values = {"value1", "value2"};
        when(commandLine.getOptionValues(option)).thenReturn(values);
        assertEquals(values, commandLine.getOptionValues(option));
    }
}