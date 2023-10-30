package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_130_Run_20231026_105918 {

    @Test
    public void testGetArgsEmpty() {
        CommandLine commandLine = new CommandLine();
        String[] expected = {};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgsSome() {
        CommandLine commandLine = new CommandLine();
        String[] expected = {"arg1", "arg2"};
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgsOnly() {
        CommandLine commandLine = new CommandLine();
        String[] expected = {"arg1", "arg2"};
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgsWithOptions() {
        CommandLine commandLine = new CommandLine();
        String[] expected = {"arg1", "arg2"};
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(Option.builder("a").longOpt("arg1").build());
        optionGroup.addOption(Option.builder("b").longOpt("arg2").build());
        Options options = new Options();
        options.addOptionGroup(optionGroup);
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }
}