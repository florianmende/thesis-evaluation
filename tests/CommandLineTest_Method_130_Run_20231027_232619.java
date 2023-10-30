package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_130_Run_20231027_232619 {

    @Test
    void testGetArgs() {
        // Create a CommandLine object and add some options and arguments
        CommandLine commandLine = new CommandLine.Builder()
                .addOption(Option.builder("a").longOpt("--arg1").hasArg().build())
                .addOption(Option.builder("b").longOpt("--arg2").hasArg().build())
                .addArg("arg3")
                .addArg("arg4")
                .build();

        // Use the getArgs() method to retrieve the unrecognized options and arguments
        String[] args = commandLine.getArgs();

        // Check that the returned array contains the expected values
        assertArrayEquals(new String[] { "arg3", "arg4" }, args);
    }
}