package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_150_Run_20231025_121248 {

    @Test
    public void testHasOptionNotSet() {
        CommandLine commandLine = new CommandLine();
        assertFalse(commandLine.hasOption("opt"));
    }

    @Test
    public void testHasOptionSet() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("opt"));
    }

    @Test
    public void testHasOptionNotValid() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "option");
        commandLine.addOption(option);
        assertFalse(commandLine.hasOption("invalid"));
    }
}