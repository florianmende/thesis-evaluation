package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Util;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_130_Run_20231025_100630 {

    @Test
    public void testGetArgs_NoLeftOvers() {
        CommandLine commandLine = new CommandLine();
        String[] expected = {};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgs_OneLeftOver() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        String[] expected = {"arg1"};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgs_MultipleLeftOvers() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] expected = {"arg1", "arg2"};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgs_WithOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        String[] expected = {};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }
}