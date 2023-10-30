package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_137_Run_20231024_151954 {

    @Test
    void testGetOptionValueNotSet() {
        CommandLine commandLine = new CommandLine();
        String defaultValue = "default";
        String result = commandLine.getOptionValue('a', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    void testGetOptionValueSetNoArg() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);
        String defaultValue = "default";
        String result = commandLine.getOptionValue('a', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    void testGetOptionValueSetWithArg() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        when(option.getArgName()).thenReturn("arg");
        commandLine.addOption(option);
        String defaultValue = "default";
        String result = commandLine.getOptionValue('a', defaultValue);
        assertEquals("arg", option.getArgName());
    }
}