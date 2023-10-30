package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_137_Run_20231028_022628 {

    @Test
    public void testGetOptionValue_defaultValue() {
        CommandLine commandLine = new CommandLine();
        String defaultValue = "defaultValue";
        String actual = commandLine.getOptionValue('a', defaultValue);
        assertEquals(defaultValue, actual);
    }

    @Test
    public void testGetOptionValue_optionSpecified() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        when(option.getValue()).thenReturn("defaultValue");
        commandLine.addOption(option);
        String actual = commandLine.getOptionValue('a', "defaultValue");
        assertEquals("defaultValue", actual);
    }

    @Test
    public void testGetOptionValue_optionSpecifiedNoArgument() {
        CommandLine commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("a");
        commandLine.addOption(option);
        String actual = commandLine.getOptionValue('a', "defaultValue");
        assertEquals("defaultValue", actual);
    }
}