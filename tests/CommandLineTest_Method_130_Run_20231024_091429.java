package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class CommandLineTest_Method_130_Run_20231024_091429 {

    @Test
    public void testGetArgs_noArgsOrOptions() {
        CommandLine commandLine = new CommandLine.Builder().build();
        String[] args = commandLine.getArgs();
        Assertions.assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_someArgs() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addArg("arg2").build();
        String[] args = commandLine.getArgs();
        Assertions.assertEquals(2, args.length);
        Assertions.assertEquals("arg1", args[0]);
        Assertions.assertEquals("arg2", args[1]);
    }

    @Test
    public void testGetArgs_someOptions() {
        CommandLine commandLine = new CommandLine.Builder().addOption(Mockito.mock(Option.class)).build();
        String[] args = commandLine.getArgs();
        Assertions.assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_mixOfArgsAndOptions() {
        CommandLine commandLine = new CommandLine.Builder().addArg("arg1").addOption(Mockito.mock(Option.class)).build();
        String[] args = commandLine.getArgs();
        Assertions.assertEquals(1, args.length);
        Assertions.assertEquals("arg1", args[0]);
    }
}