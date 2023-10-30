package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_127_Run_20231023_204140 {

    @Test
    public void testAddArg() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        assertEquals(1, commandLine.getArgs().length);
        assertEquals("arg1", commandLine.getArgs()[0]);
    }

    @Test
    public void testAddNullArg() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg(null);
        assertEquals(0, commandLine.getArgs().length);
    }

    @Test
    public void testAddMultipleArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        assertEquals(2, commandLine.getArgs().length);
        assertEquals("arg1", commandLine.getArgs()[0]);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }

    @Test
    public void testAddOption() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("long-option");
        commandLine.addOption(option);
        assertEquals(1, commandLine.getOptions().length);
        assertEquals("long-option", commandLine.getOptions()[0].getLongOpt());
    }

    @Test
    public void testBuild() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addOption(mock(Option.class));
        assertEquals(1, commandLine.getArgs().length);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    public void testGetArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);
    }

    @Test
    public void testGetOptions() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("long-option");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
        assertEquals("long-option", options[0].getLongOpt());
    }
}