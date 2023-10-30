package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

public class CommandLineTest_Method_140_Run_20231024_082502 {

    @Test
    public void testGetOptionValue_optionNotSet() {
        // create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // create a mock Option instance
        Option option = Mockito.mock(Option.class);
        // when the option is not set, the method should return null
        Mockito.when(commandLine.getOptionValue(option)).thenReturn(null);
        // call the method and verify the result
        assertNull(commandLine.getOptionValue(option));
    }

    @Test
    public void testGetOptionValue_optionSetNoArgument() {
        // create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // create a mock Option instance
        Option option = Mockito.mock(Option.class);
        // when the option is set but has no argument, the method should return an empty string
        Mockito.when(commandLine.getOptionValue(option)).thenReturn("");
        // call the method and verify the result
        assertEquals("", commandLine.getOptionValue(option));
    }

    @Test
    public void testGetOptionValue_optionSetWithArgument() {
        // create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);
        // create a mock Option instance
        Option option = Mockito.mock(Option.class);
        // when the option is set and has an argument, the method should return the value of the argument
        Mockito.when(commandLine.getOptionValue(option)).thenReturn("argument");
        // call the method and verify the result
        assertEquals("argument", commandLine.getOptionValue(option));
    }
}