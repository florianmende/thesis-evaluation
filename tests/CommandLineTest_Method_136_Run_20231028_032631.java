package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_136_Run_20231028_032631 {
    @Test
    public void testGetOptionValueWithArgument() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValue("a")).thenReturn("value");
        assertEquals("value", commandLine.getOptionValue("a"));
    }

    @Test
    public void testGetOptionValueWithoutArgument() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValue("a")).thenReturn(null);
        assertNull(commandLine.getOptionValue("a"));
    }

    @Test
    public void testGetOptionValueWithoutOption() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValue("a")).thenReturn(null);
        assertNull(commandLine.getOptionValue("b"));
    }
}