package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_150_Run_20231024_060930 {

    @Test
    void testHasOption() {
        // Case 1: The option has been set
        CommandLine commandLine = new CommandLine.Builder().addOption(new Option("opt", "option")).build();
        assertTrue(commandLine.hasOption("opt"));

        // Case 2: The option has not been set
        commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption("opt"));

        // Case 3: The option is null
        commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption((String) null));
    }
}