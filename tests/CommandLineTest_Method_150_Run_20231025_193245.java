package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CommandLineTest_Method_150_Run_20231025_193245 {

    @Test
    public void testHasOption_optionSet() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "aaa");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("a"));
    }

    @Test
    public void testHasOption_optionNotSet() {
        CommandLine commandLine = new CommandLine();
        assertFalse(commandLine.hasOption("a"));
    }

    @Test
    public void testHasOption_optionSetWithDifferentValue() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "aaa");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("a"));
    }
}