package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandLineTest_Method_142_Run_20231024_082502 {

    @Test
    public void testGetOptionValues() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return an array of strings for the option "a"
        Mockito.when(commandLine.getOptionValues("a")).thenReturn(new String[]{"value1", "value2"});

        // Test that the method returns the expected array of strings
        String[] values = commandLine.getOptionValues("a");
        assertArrayEquals(new String[]{"value1", "value2"}, values);

        // Set up the mock to return null for the option "b"
        Mockito.when(commandLine.getOptionValues("b")).thenReturn(null);

        // Test that the method returns null
        values = commandLine.getOptionValues("b");
        assertNull(values);
    }
}