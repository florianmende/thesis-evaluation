package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_129_Run_20231024_145023 {

    @Test
    public void testGetArgList_Empty() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Call the getArgList() method
        List<String> args = commandLine.getArgList();

        // Verify that the returned list is empty
        assertTrue(args.isEmpty());
    }

    @Test
    public void testGetArgList_OneArg() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Add an unrecognized option to the command line
        commandLine.addArg("--help");

        // Call the getArgList() method
        List<String> args = commandLine.getArgList();

        // Verify that the returned list contains the unrecognized option
        assertEquals(1, args.size());
        assertEquals("--help", args.get(0));
    }

    @Test
    public void testGetArgList_MultipleArgs() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Add multiple unrecognized options to the command line
        commandLine.addArg("--help");
        commandLine.addArg("--version");

        // Call the getArgList() method
        List<String> args = commandLine.getArgList();

        // Verify that the returned list contains all unrecognized options
        assertEquals(2, args.size());
        assertEquals("--help", args.get(0));
        assertEquals("--version", args.get(1));
    }
}