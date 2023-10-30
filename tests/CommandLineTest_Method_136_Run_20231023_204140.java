package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_136_Run_20231023_204140 {

    @Test
    public void testGetOptionValue() {
        // Case 1: The option is not set
        CommandLine commandLine = new CommandLine();
        assertNull(commandLine.getOptionValue('a'));

        // Case 2: The option is set, but it doesn't have an argument
        commandLine = new CommandLine();
        commandLine.addOption(new Option("a", false, ""));
        assertNull(commandLine.getOptionValue('a'));

        // Case 3: The option is set and has an argument
        commandLine = new CommandLine();
        commandLine.addOption(new Option("a", false, ""));
        commandLine.addOption(new Option("b", true, ""));
        assertNull(commandLine.getOptionValue('b'));
    }
}