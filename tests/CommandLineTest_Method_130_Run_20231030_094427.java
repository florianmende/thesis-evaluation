package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_130_Run_20231030_094427 {

    @Test
    public void testGetArgsNoArgumentsOrOptions() {
        CommandLine commandLine = new CommandLine.Builder().build();
        String[] expectedArgs = {};
        assertArrayEquals(expectedArgs, commandLine.getArgs());
    }

    @Test
    public void testGetArgsOnlyArguments() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addArg("arg2").build();
        String[] expectedArgs = {"arg1", "arg2"};
        assertArrayEquals(expectedArgs, commandLine.getArgs());
    }

    @Test
    public void testGetArgsOnlyOptions() {
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getOpt()).thenReturn("option1");
        when(option2.getOpt()).thenReturn("option2");
        CommandLine commandLine = new CommandLine.Builder().addOption(option1).addOption(option2).build();
        String[] expectedArgs = {};
        assertArrayEquals(expectedArgs, commandLine.getArgs());
    }
}