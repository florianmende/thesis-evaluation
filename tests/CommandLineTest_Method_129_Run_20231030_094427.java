package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CommandLineTest_Method_129_Run_20231030_094427 {

    @Test
    void testGetArgListEmpty() {
        CommandLine commandLine = new CommandLine();
        List<String> args = commandLine.getArgList();
        assertTrue(args.isEmpty());
    }

    @Test
    void testGetArgListSizeOne() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        List<String> args = commandLine.getArgList();
        assertEquals(1, args.size());
        assertEquals("arg1", args.get(0));
    }

    @Test
    void testGetArgListSizeGreaterThanOne() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        List<String> args = commandLine.getArgList();
        assertEquals(2, args.size());
        assertEquals("arg1", args.get(0));
        assertEquals("arg2", args.get(1));
    }
}