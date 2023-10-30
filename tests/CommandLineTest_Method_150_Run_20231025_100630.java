package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_150_Run_20231025_100630 {
    @Test
    public void testHasOption() {
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        when(option.getOpt()).thenReturn("option");
        commandLine.addOption(option);

        // Case 1: The option is set and the method returns true.
        assertTrue(commandLine.hasOption("option"));

        // Case 2: The option is not set and the method returns false.
        assertFalse(commandLine.hasOption("notSetOption"));

        // Case 3: The option is null and the method returns false.
        assertFalse(commandLine.hasOption((String) null));
    }
}