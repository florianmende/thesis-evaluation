package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_129_Run_20231027_222616 {

    @Test
    public void testGetArgListEmpty() {
        CommandLine commandLine = new CommandLine();
        List<String> argList = commandLine.getArgList();
        assertTrue(argList.isEmpty());
    }

    @Test
    public void testGetArgListOneElement() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        List<String> argList = commandLine.getArgList();
        assertEquals(1, argList.size());
        assertEquals("arg1", argList.get(0));
    }

    @Test
    public void testGetArgListMultipleElements() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        commandLine.addArg("arg3");
        List<String> argList = commandLine.getArgList();
        assertEquals(3, argList.size());
        assertEquals("arg1", argList.get(0));
        assertEquals("arg2", argList.get(1));
        assertEquals("arg3", argList.get(2));
    }
}