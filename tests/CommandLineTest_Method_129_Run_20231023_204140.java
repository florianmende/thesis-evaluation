package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_129_Run_20231023_204140 {
    @Test
    public void testGetArgList_NoArgs() {
        // Create a new CommandLine instance
        CommandLine cmd = new CommandLine();

        // Add some recognized options
        cmd.addOption(new Option("a", "first-option"));
        cmd.addOption(new Option("b", "second-option"));

        // Get the arg list
        List<String> args = cmd.getArgList();

        // Assert that the arg list is empty
        assertTrue(args.isEmpty());
    }

    @Test
    public void testGetArgList_OnlyRecognizedOptions() {
        // Create a new CommandLine instance
        CommandLine cmd = new CommandLine();

        // Add some recognized options
        cmd.addOption(new Option("a", "first-option"));
        cmd.addOption(new Option("b", "second-option"));

        // Add some unrecognized options
        cmd.addArg("--unrecognized-option");
        cmd.addArg("--another-unrecognized-option");

        // Get the arg list
        List<String> args = cmd.getArgList();

        // Assert that the arg list contains the unrecognized options
        assertEquals(2, args.size());
        assertTrue(args.contains("--unrecognized-option"));
        assertTrue(args.contains("--another-unrecognized-option"));
    }

    @Test
    public void testGetArgList_UnrecognizedOptions() {
        // Create a new CommandLine instance
        CommandLine cmd = new CommandLine();

        // Add some recognized options
        cmd.addOption(new Option("a", "first-option"));
        cmd.addOption(new Option("b", "second-option"));

        // Add some unrecognized options
        cmd.addArg("--unrecognized-option");
        cmd.addArg("--another-unrecognized-option");

        // Get the arg list
        List<String> args = cmd.getArgList();

        // Assert that the arg list contains the unrecognized options
        assertEquals(2, args.size());
        assertTrue(args.contains("--unrecognized-option"));
        assertTrue(args.contains("--another-unrecognized-option"));
    }
}