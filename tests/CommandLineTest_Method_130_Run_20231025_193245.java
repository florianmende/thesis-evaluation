package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CommandLineTest_Method_130_Run_20231025_193245 {

    @Test
    public void testGetArgs_noArgumentsOrOptions() {
        // create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);
        // set up the mock behavior
        when(commandLine.getArgs()).thenReturn(new String[0]);
        // test the method
        String[] args = commandLine.getArgs();
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_onlyArguments() {
        // create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);
        // set up the mock behavior
        when(commandLine.getArgs()).thenReturn(new String[]{"arg1", "arg2"});
        // test the method
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);
    }

    @Test
    public void testGetArgs_onlyOptions() {
        // create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);
        // set up the mock behavior
        when(commandLine.getArgs()).thenReturn(new String[]{"-a", "-b"});
        // test the method
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("-a", args[0]);
        assertEquals("-b", args[1]);
    }

    @Test
    public void testGetArgs_bothArgumentsAndOptions() {
        // create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);
        // set up the mock behavior
        when(commandLine.getArgs()).thenReturn(new String[]{"arg1", "-a", "arg2", "-b"});
        // test the method
        String[] args = commandLine.getArgs();
        assertEquals(4, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("-a", args[1]);
        assertEquals("arg2", args[2]);
        assertEquals("-b", args[3]);
    }
}