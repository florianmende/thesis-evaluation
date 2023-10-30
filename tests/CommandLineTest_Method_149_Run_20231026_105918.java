package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest_Method_149_Run_20231026_105918 {

    @Test
    public void testHasOption() {
        Option option = new Option("a", "test option");
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();
        assertTrue(commandLine.hasOption(option));
    }

    @Test
    public void testHasOption_notPresent() {
        Option option = new Option("a", "test option");
        CommandLine commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption(option));
    }

    @Test
    public void testHasOption_emptyOptionsList() {
        Option option = new Option("a", "test option");
        CommandLine commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption(option));
    }
}