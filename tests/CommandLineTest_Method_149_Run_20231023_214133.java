package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CommandLineTest_Method_149_Run_20231023_214133 {

    @Test
    public void hasOption_optionPresent() {
        CommandLine commandLine = new CommandLine.Builder().addOption(new Option("test", "test option")).build();
        assertTrue(commandLine.hasOption(new Option("test", "test option")));
    }

    @Test
    public void hasOption_optionNotPresent() {
        CommandLine commandLine = new CommandLine.Builder().addOption(new Option("test", "test option")).build();
        assertFalse(commandLine.hasOption(new Option("test2", "test option 2")));
    }

    @Test
    public void hasOption_optionNull() {
        CommandLine commandLine = new CommandLine.Builder().addOption(new Option("test", "test option")).build();
        assertFalse(commandLine.hasOption((Option) null));
    }
}