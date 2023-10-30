package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_129_Run_20231025_125643 {

    @Test
    void testGetArgList_NoArgs() {
        CommandLine commandLine = new CommandLine();
        assertEquals(0, commandLine.getArgList().size());
    }

    @Test
    void testGetArgList_OneArg() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        assertEquals(1, commandLine.getArgList().size());
        assertEquals("arg1", commandLine.getArgList().get(0));
    }

    @Test
    void testGetArgList_MultipleArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        commandLine.addArg("arg3");
        assertEquals(3, commandLine.getArgList().size());
        assertEquals("arg1", commandLine.getArgList().get(0));
        assertEquals("arg2", commandLine.getArgList().get(1));
        assertEquals("arg3", commandLine.getArgList().get(2));
    }
}