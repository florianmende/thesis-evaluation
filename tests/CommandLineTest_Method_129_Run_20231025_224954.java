package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_129_Run_20231025_224954 {

    @Test
    public void testGetArgList_empty() {
        CommandLine commandLine = new CommandLine();
        List<String> argList = commandLine.getArgList();
        assertNotNull(argList);
        assertTrue(argList.isEmpty());
    }

    @Test
    public void testGetArgList_oneElement() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("-a");
        List<String> argList = commandLine.getArgList();
        assertNotNull(argList);
        assertEquals(1, argList.size());
        assertEquals("-a", argList.get(0));
    }

    @Test
    public void testGetArgList_multipleElements() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("-a");
        commandLine.addArg("-b");
        List<String> argList = commandLine.getArgList();
        assertNotNull(argList);
        assertEquals(2, argList.size());
        assertEquals("-a", argList.get(0));
        assertEquals("-b", argList.get(1));
    }
}