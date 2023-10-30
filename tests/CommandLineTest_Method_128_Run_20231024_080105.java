package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_128_Run_20231024_080105 {

    @Test
    void testAddOption() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Create a new Option instance
        Option option = new Option("test", "Test option");

        // Add the option to the command line
        commandLine.addOption(option);

        // Verify that the option was added to the command line
        List<Option> options = Arrays.asList(commandLine.getOptions());
        assertTrue(options.contains(option));
    }

    @Test
    void testAddOptionToEmptyCommandLine() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Create a new Option instance
        Option option = new Option("test", "Test option");

        // Add the option to the command line
        commandLine.addOption(option);

        // Verify that the option was added to the command line
        List<Option> options = Arrays.asList(commandLine.getOptions());
        assertTrue(options.contains(option));
    }

    @Test
    void testAddOptionToCommandLineWithOptions() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Create a new Option instance
        Option option1 = new Option("test1", "Test option 1");

        // Add the option to the command line
        commandLine.addOption(option1);

        // Verify that the option was added to the command line
        List<Option> options = Arrays.asList(commandLine.getOptions());
        assertTrue(options.contains(option1));

        // Create a new Option instance
        Option option2 = new Option("test2", "Test option 2");

        // Add the option to the command line
        commandLine.addOption(option2);

        // Verify that the option was added to the command line
        options = Arrays.asList(commandLine.getOptions());
        assertTrue(options.contains(option2));
    }

    @Test
    void testAddNullOption() {
        // Create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // Add a null option to the command line
        commandLine.addOption(null);

        // Verify that the option was not added to the command line
        List<Option> options = Arrays.asList(commandLine.getOptions());
        assertTrue(options.isEmpty());
    }
}