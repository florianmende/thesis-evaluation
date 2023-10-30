package org.apache.commons.cli;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_149_Run_20231024_060930 {

    @Test
    public void testHasOption() {
        CommandLine commandLine = new CommandLine.Builder().build();
        Option option = new Option("test", "Test option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption(option));
    }

    @Test
    public void testHasOptionFalse() {
        CommandLine commandLine = new CommandLine.Builder().build();
        Option option = new Option("test", "Test option");
        assertFalse(commandLine.hasOption(option));
    }

    @Test
    public void testHasOptionNull() {
        CommandLine commandLine = new CommandLine.Builder().build();
        assertFalse(commandLine.hasOption((Option) null));
    }
}