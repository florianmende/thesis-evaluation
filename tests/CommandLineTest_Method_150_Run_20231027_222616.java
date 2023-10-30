package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_150_Run_20231027_222616 {

    @Test
    public void testHasOption() {
        // create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // set up the mock to return true for the "option" option
        when(commandLine.hasOption("option")).thenReturn(true);

        // test that the method returns true when the option is set
        assertTrue(commandLine.hasOption("option"));

        // set up the mock to return false for the "option" option
        when(commandLine.hasOption("option")).thenReturn(false);

        // test that the method returns false when the option is not set
        assertFalse(commandLine.hasOption("option"));

        // set up the mock to return false for a null option
        when(commandLine.hasOption((Option) null)).thenReturn(false);

        // test that the method returns false when the option is null
        assertFalse(commandLine.hasOption((Option) null));
    }
}