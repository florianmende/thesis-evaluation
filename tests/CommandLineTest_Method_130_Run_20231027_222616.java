package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandLineTest_Method_130_Run_20231027_222616 {
    @Test
    public void testGetArgsEmpty() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getArgs()).thenReturn(new String[0]);

        String[] args = commandLine.getArgs();

        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgsOneElement() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getArgs()).thenReturn(new String[] {"arg1"});

        String[] args = commandLine.getArgs();

        assertEquals(1, args.length);
        assertEquals("arg1", args[0]);
    }

    @Test
    public void testGetArgsMultipleElements() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        Mockito.when(commandLine.getArgs()).thenReturn(new String[] {"arg1", "arg2", "arg3"});

        String[] args = commandLine.getArgs();

        assertEquals(3, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);
        assertEquals("arg3", args[2]);
    }
}