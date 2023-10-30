package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_129_Run_20231027_212614 {

    @Test
    void testGetArgList_empty() {
        CommandLine commandLine = new CommandLine();
        List<String> args = commandLine.getArgList();
        assertTrue(args.isEmpty());
    }

    @Test
    void testGetArgList_oneArg() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        List<String> args = commandLine.getArgList();
        assertEquals(1, args.size());
        assertEquals("arg1", args.get(0));
    }

    @Test
    void testGetArgList_multipleArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        commandLine.addArg("arg3");
        List<String> args = commandLine.getArgList();
        assertEquals(3, args.size());
        assertEquals("arg1", args.get(0));
        assertEquals("arg2", args.get(1));
        assertEquals("arg3", args.get(2));
    }
}