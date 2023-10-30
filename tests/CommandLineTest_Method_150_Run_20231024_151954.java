package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CommandLineTest_Method_150_Run_20231024_151954 {
    @Test
    public void testHasOption() {
        // create a new CommandLine instance
        CommandLine commandLine = new CommandLine();

        // add an option to the command line
        Option option = new Option("test", "test option");
        commandLine.addOption(option);

        // test that the option has been set
        assertTrue(commandLine.hasOption("test"));

        // test that a non-existent option has not been set
        assertFalse(commandLine.hasOption("nonexistent"));

        // test that a null or empty option has not been set
        assertFalse(commandLine.hasOption((String) null));
        assertFalse(commandLine.hasOption(""));
    }
}