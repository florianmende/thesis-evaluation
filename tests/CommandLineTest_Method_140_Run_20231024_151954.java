package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class CommandLineTest_Method_140_Run_20231024_151954 {

    @Test
    public void testGetOptionValue_optionNotSet() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        String opt = "test";
        String value = commandLine.getOptionValue(opt);
        assertNull(value);
    }

    @Test
    public void testGetOptionValue_optionSetNoArgument() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        String opt = "test";
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn(opt);
        Mockito.when(commandLine.getOptionValue(opt)).thenReturn("");
        commandLine.addOption(option);
        String value = commandLine.getOptionValue(opt);
        assertEquals("", value);
    }

    @Test
    public void testGetOptionValue_optionSetWithArgument() {
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        String opt = "test";
        String arg = "arg";
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn(opt);
        Mockito.when(option.getValues()).thenReturn(new String[] {arg});
        Mockito.when(commandLine.getOptionValue(opt)).thenReturn(arg);
        commandLine.addOption(option);
        String value = commandLine.getOptionValue(opt);
        assertEquals(arg, value);
    }
}