package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_129_Run_20231025_105031 {

    @Test
    public void testGetArgList() {
        // Case 1: No unrecognized options and arguments
        CommandLine commandLine = new CommandLine();
        List<String> argList = commandLine.getArgList();
        assertTrue(argList.isEmpty());

        // Case 2: One unrecognized option and argument
        Option option = OptionBuilder.withLongOpt("option").hasArg().create();
        commandLine = new CommandLine();
        commandLine.addOption(option);
        commandLine.addArg("arg");
        argList = commandLine.getArgList();
        assertEquals(1, argList.size());
        assertEquals("arg", argList.get(0));

        // Case 3: Multiple unrecognized options and arguments
        commandLine = new CommandLine();
        commandLine.addOption(option);
        commandLine.addOption(OptionBuilder.withLongOpt("option2").hasArg().create());
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        argList = commandLine.getArgList();
        assertEquals(2, argList.size());
        assertEquals("arg1", argList.get(0));
        assertEquals("arg2", argList.get(1));
    }
}