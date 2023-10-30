package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class CommandLineTest_Method_130_Run_20231024_080105 {
    @Test
    public void testGetArgs_empty() {
        // Given
        CommandLine commandLine = new CommandLine();

        // When
        String[] args = commandLine.getArgs();

        // Then
        Assertions.assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_withArgs() {
        // Given
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");

        // When
        String[] args = commandLine.getArgs();

        // Then
        Assertions.assertEquals(2, args.length);
        Assertions.assertEquals("arg1", args[0]);
        Assertions.assertEquals("arg2", args[1]);
    }

    @Test
    public void testGetArgs_withRecognizedOptions() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option opt1 = Mockito.mock(Option.class);
        Option opt2 = Mockito.mock(Option.class);
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        // When
        String[] args = commandLine.getArgs();

        // Then
        Assertions.assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_withUnrecognizedOptions() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option opt1 = Mockito.mock(Option.class);
        Option opt2 = Mockito.mock(Option.class);
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");

        // When
        String[] args = commandLine.getArgs();

        // Then
        Assertions.assertEquals(2, args.length);
        Assertions.assertEquals("arg1", args[0]);
        Assertions.assertEquals("arg2", args[1]);
    }
}