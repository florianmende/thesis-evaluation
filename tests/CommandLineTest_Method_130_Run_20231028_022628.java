package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_130_Run_20231028_022628 {

    @Test
    public void testGetArgs_NoArgs() {
        CommandLine commandLine = new CommandLine();
        String[] expected = new String[0];
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgs_WithArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] expected = new String[]{"arg1", "arg2"};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetArgs_WithRecognizedAndUnrecognizedArgs() {
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(mock(Option.class));
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] expected = new String[]{"arg1", "arg2"};
        String[] actual = commandLine.getArgs();
        assertArrayEquals(expected, actual);
    }
}