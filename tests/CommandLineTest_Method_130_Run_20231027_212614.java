package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_130_Run_20231027_212614 {

    @Test
    public void testGetArgsEmpty() {
        CommandLine commandLine = new CommandLine();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[0], args);
    }

    @Test
    public void testGetArgsOneElement() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("foo");
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"foo"}, args);
    }

    @Test
    public void testGetArgsMultipleElements() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("foo");
        commandLine.addArg("bar");
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"foo", "bar"}, args);
    }
}