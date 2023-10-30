package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandLineTest_Method_130_Run_20231025_125643 {

    @Test
    public void testGetArgsWithNoArgs() {
        CommandLine commandLine = new CommandLine.Builder().build();
        assertArrayEquals(new String[0], commandLine.getArgs());
    }

    @Test
    public void testGetArgsWithOneArg() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").build();
        assertArrayEquals(new String[]{"arg1"}, commandLine.getArgs());
    }

    @Test
    public void testGetArgsWithMultipleArgs() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addArg("arg2").build();
        assertArrayEquals(new String[]{"arg1", "arg2"}, commandLine.getArgs());
    }
}