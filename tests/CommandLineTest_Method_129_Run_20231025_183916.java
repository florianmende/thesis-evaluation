package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_129_Run_20231025_183916 {

    @Test
    public void testGetArgList() {
        // Create a CommandLine instance with some unrecognized options and arguments
        CommandLine commandLine = new CommandLine.Builder()
                .addArg("--unrecognized-option")
                .addArg("--unrecognized-argument")
                .build();

        // Get the list of unrecognized options and arguments
        List<String> argList = commandLine.getArgList();

        // Assert that the list is not null and has the expected size
        assertNotNull(argList);
        assertEquals(2, argList.size());

        // Assert that the list contains the expected elements
        assertEquals("--unrecognized-option", argList.get(0));
        assertEquals("--unrecognized-argument", argList.get(1));
    }

    @Test
    public void testGetArgListWithNoArgs() {
        // Create a CommandLine instance with no unrecognized options or arguments
        CommandLine commandLine = new CommandLine.Builder().build();

        // Get the list of unrecognized options and arguments
        List<String> argList = commandLine.getArgList();

        // Assert that the list is not null and has the expected size
        assertNotNull(argList);
        assertEquals(0, argList.size());
    }

    @Test
    public void testGetArgListWithRecognizedOptions() {
        // Create a CommandLine instance with some recognized options
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getOpt()).thenReturn("option1");
        when(option2.getOpt()).thenReturn("option2");
        CommandLine commandLine = new CommandLine.Builder()
                .addOption(option1)
                .addOption(option2)
                .build();

        // Get the list of unrecognized options and arguments
        List<String> argList = commandLine.getArgList();

        // Assert that the list is not null and has the expected size
        assertNotNull(argList);
        assertEquals(0, argList.size());
    }
}