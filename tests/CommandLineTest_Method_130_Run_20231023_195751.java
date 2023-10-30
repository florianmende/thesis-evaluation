package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_130_Run_20231023_195751 {

    @Test
    public void testGetArgs_NoOptionsOrArguments() {
        // Arrange
        CommandLine commandLine = new CommandLine();

        // Act
        String[] args = commandLine.getArgs();

        // Assert
        assertArrayEquals(new String[0], args);
    }

    @Test
    public void testGetArgs_SomeOptionsOrArguments() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");

        // Act
        String[] args = commandLine.getArgs();

        // Assert
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }

    @Test
    public void testGetArgs_MixedOptionsAndArguments() {
        // Arrange
        CommandLine commandLine = new CommandLine();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");

        // Act
        String[] args = commandLine.getArgs();

        // Assert
        assertArrayEquals(new String[]{"arg1", "arg2"}, args);
    }
}