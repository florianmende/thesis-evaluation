package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_149_Run_20231028_032631 {

    @Test
    public void testHasOption() {
        // Set up the mock objects
        Option option = mock(Option.class);
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior
        when(commandLine.hasOption(option)).thenReturn(true);

        // Test case 1: The option has been set
        assertTrue(commandLine.hasOption(option));

        // Test case 2: The option has not been set
        when(commandLine.hasOption(option)).thenReturn(false);
        assertFalse(commandLine.hasOption(option));

        // Test case 3: The option is null
        when(commandLine.hasOption((Option) null)).thenReturn(false);
        assertFalse(commandLine.hasOption((Option) null));
    }
}