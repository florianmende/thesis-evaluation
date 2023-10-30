package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_148_Run_20231030_094427 {

    @Test
    public void testHasOption() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Option option = Mockito.mock(Option.class);

        // Case 1: The option is set
        Mockito.when(commandLine.hasOption(option)).thenReturn(true);
        assertTrue(commandLine.hasOption(option));

        // Case 2: The option is not set
        Mockito.when(commandLine.hasOption(option)).thenReturn(false);
        assertFalse(commandLine.hasOption(option));

        // Case 3: The option is set but with a different character
        Mockito.when(commandLine.hasOption(option)).thenReturn(true);
        assertFalse(commandLine.hasOption(Option.builder("d").build()));
    }
}