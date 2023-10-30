package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_130_Run_20231024_165833 {
    @Test
    public void testGetArgs_noArgs() {
        CommandLine commandLine = new CommandLine();
        String[] args = commandLine.getArgs();
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_withArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);
    }

    @Test
    public void testGetArgs_withRecognizedAndUnrecognizedArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        commandLine.addOption(Mockito.mock(Option.class));
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);
    }
}