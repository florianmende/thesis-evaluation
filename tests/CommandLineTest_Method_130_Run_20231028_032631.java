package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_130_Run_20231028_032631 {

    @Test
    public void testGetArgsEmpty() {
        CommandLine commandLine = new CommandLine.Builder().build();
        String[] args = commandLine.getArgs();
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgsOneElement() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").build();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"arg1"}, args);
    }

    @Test
    public void testGetArgsMultipleElements() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addArg("arg2").build();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }
}