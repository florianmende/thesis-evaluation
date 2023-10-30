package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_129_Run_20231024_091429 {

    @Test
    public void testGetArgListEmpty() {
        CommandLine commandLine = new CommandLine();
        assertNotNull(commandLine.getArgList());
        assertEquals(0, commandLine.getArgList().size());
    }

    @Test
    public void testGetArgListOneElement() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        assertNotNull(commandLine.getArgList());
        assertEquals(1, commandLine.getArgList().size());
        assertEquals("arg1", commandLine.getArgList().get(0));
    }

    @Test
    public void testGetArgListMultipleElements() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        commandLine.addArg("arg3");
        assertNotNull(commandLine.getArgList());
        assertEquals(3, commandLine.getArgList().size());
        assertEquals("arg1", commandLine.getArgList().get(0));
        assertEquals("arg2", commandLine.getArgList().get(1));
        assertEquals("arg3", commandLine.getArgList().get(2));
    }
}