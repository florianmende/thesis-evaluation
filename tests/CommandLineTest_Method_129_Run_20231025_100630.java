package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import java.util.Arrays;

public class CommandLineTest_Method_129_Run_20231025_100630 {

    @Test
    public void testGetArgList() {
        // Case 1: The command line contains only unrecognized options and arguments.
        CommandLine commandLine = new CommandLine.Builder()
                .addArg("arg1")
                .addArg("arg2")
                .build();
        assertEquals(Arrays.asList("arg1", "arg2"), commandLine.getArgList());

        // Case 2: The command line contains recognized options and arguments.
        commandLine = new CommandLine.Builder()
                .addOption(new Option("option1", "description1"))
                .addArg("arg1")
                .addArg("arg2")
                .build();
        assertEquals(Arrays.asList("arg1", "arg2"), commandLine.getArgList());

        // Case 3: The command line contains a mix of recognized and unrecognized options and arguments.
        commandLine = new CommandLine.Builder()
                .addArg("arg1")
                .addOption(new Option("option1", "description1"))
                .addArg("arg2")
                .build();
        assertEquals(Arrays.asList("arg1", "arg2"), commandLine.getArgList());
    }
}