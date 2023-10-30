package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_130_Run_20231024_060930 {

    @Test
    public void testGetArgsNoArguments() {
        CommandLine commandLine = new CommandLine();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[0], args);
    }

    @Test
    public void testGetArgsSomeArgumentsNotRecognized() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }

    @Test
    public void testGetArgsSomeArgumentsRecognized() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("option1");
        commandLine.addOption(option);
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }
}