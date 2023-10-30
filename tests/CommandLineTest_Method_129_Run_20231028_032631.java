package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_129_Run_20231028_032631 {

    @Test
    public void testGetArgList_EmptyList() {
        CommandLine commandLine = new CommandLine();
        List<String> args = commandLine.getArgList();
        assertNotNull(args);
        assertEquals(0, args.size());
    }

    @Test
    public void testGetArgList_NonEmptyList() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        List<String> args = commandLine.getArgList();
        assertNotNull(args);
        assertEquals(2, args.size());
        assertEquals("arg1", args.get(0));
        assertEquals("arg2", args.get(1));
    }

    @Test
    public void testGetArgList_CorrectOrder() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        List<String> args = commandLine.getArgList();
        assertNotNull(args);
        assertEquals(2, args.size());
        assertEquals("arg1", args.get(0));
        assertEquals("arg2", args.get(1));

        commandLine.addArg("arg3");
        args = commandLine.getArgList();
        assertEquals(3, args.size());
        assertEquals("arg1", args.get(0));
        assertEquals("arg2", args.get(1));
        assertEquals("arg3", args.get(2));
    }
}