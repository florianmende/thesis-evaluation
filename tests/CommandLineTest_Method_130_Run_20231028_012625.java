package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_130_Run_20231028_012625 {

    @Test
    public void testGetArgsEmpty() throws ParseException {
        CommandLine commandLine = new CommandLine.Builder().build();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[0], args);
    }

    @Test
    public void testGetArgsOneElement() throws ParseException {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").build();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[] {"arg1"}, args);
    }

    @Test
    public void testGetArgsMultipleElements() throws ParseException {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addArg("arg2").build();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[] {"arg1", "arg2"}, args);
    }
}