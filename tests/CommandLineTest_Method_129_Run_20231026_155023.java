package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_129_Run_20231026_155023 {

    @Test
    public void testGetArgList_Empty() {
        CommandLine commandLine = new CommandLine();
        List<String> argList = commandLine.getArgList();
        assertTrue(argList.isEmpty());
    }

    @Test
    public void testGetArgList_OneArg() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        List<String> argList = commandLine.getArgList();
        assertEquals(1, argList.size());
        assertEquals("arg1", argList.get(0));
    }

    @Test
    public void testGetArgList_MultipleArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        List<String> argList = commandLine.getArgList();
        assertEquals(2, argList.size());
        assertEquals("arg1", argList.get(0));
        assertEquals("arg2", argList.get(1));
    }

}