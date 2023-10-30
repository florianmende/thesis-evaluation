package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_150_Run_20231028_052637 {

    @Test
    public void testHasOption() {
        // Set up the mock CommandLine and Option objects
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.hasOption(option)).thenReturn(true);

        // Test that the method returns true when the option has been set
        assertTrue(commandLine.hasOption(option));

        // Test that the method returns false when the option has not been set
        assertFalse(commandLine.hasOption((Option) null));
    }

    @Test
    public void testHasOptionWithNullOption() {
        // Set up the mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Test that the method returns false when the option is null
        assertFalse(commandLine.hasOption((String) null));
    }
}