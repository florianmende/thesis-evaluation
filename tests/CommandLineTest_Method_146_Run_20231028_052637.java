package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.TypeHandler;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_146_Run_20231028_052637 {

    @Test
    void testGetParsedOptionValue() throws Exception {
        // Create a mock Option object
        Option option = mock(Option.class);
        when(option.getType()).thenReturn(String.class);

        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValue(option)).thenReturn("test");

        // Mock the behavior of the getParsedOptionValue method
        when(commandLine.getParsedOptionValue(option)).thenReturn("test");

        // Test the method
        Object result = commandLine.getParsedOptionValue(option);
        assertEquals("test", result);
    }
}