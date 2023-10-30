package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_130_Run_20231024_151954 {

    @Test
    public void testGetArgs_Empty() {
        CommandLine commandLine = new CommandLine.Builder().build();
        assertArrayEquals(new String[0], commandLine.getArgs());
    }

    @Test
    public void testGetArgs_OneElement() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").build();
        assertArrayEquals(new String[]{"arg1"}, commandLine.getArgs());
    }

    @Test
    public void testGetArgs_MultipleElements() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addArg("arg2").build();
        assertArrayEquals(new String[]{"arg1", "arg2"}, commandLine.getArgs());
    }
}