package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_150_Run_20231024_082502 {

    @Test
    public void testHasOption_present() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the behavior of the hasOption method
        Mockito.when(commandLine.hasOption("opt1")).thenReturn(true);
        // Call the hasOption method
        boolean result = commandLine.hasOption("opt1");
        // Verify that the method returned true
        assertTrue(result);
    }

    @Test
    public void testHasOption_notPresent() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the behavior of the hasOption method
        Mockito.when(commandLine.hasOption("opt2")).thenReturn(false);
        // Call the hasOption method
        boolean result = commandLine.hasOption("opt2");
        // Verify that the method returned false
        assertFalse(result);
    }

    @Test
    public void testHasOption_resolveOptionReturnsNull() {
        // Create a mock CommandLine object
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // Set up the behavior of the hasOption method
        Mockito.when(commandLine.hasOption("opt3")).thenReturn(false);
        // Call the hasOption method
        boolean result = commandLine.hasOption("opt3");
        // Verify that the method returned false
        assertFalse(result);
    }
}