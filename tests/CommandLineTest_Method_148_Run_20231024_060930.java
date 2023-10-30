package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

class CommandLineTest_Method_148_Run_20231024_060930 {

    @Test
    void testHasOption() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return true for the option 'a'
        Mockito.when(commandLine.hasOption('a')).thenReturn(true);

        // Test case 1: The option has been set and the method returns true
        Assertions.assertTrue(commandLine.hasOption('a'));

        // Test case 2: The option has not been set and the method returns false
        Assertions.assertFalse(commandLine.hasOption('b'));

        // Test case 3: The option has been set but the character passed to the method is different
        // and the method returns false
        Assertions.assertFalse(commandLine.hasOption('c'));
    }
}