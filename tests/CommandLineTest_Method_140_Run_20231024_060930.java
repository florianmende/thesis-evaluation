package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_140_Run_20231024_060930 {

    @Test
    public void testGetOptionValue_optionDoesNotExist() {
        // create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // set up the mock to return null when getOptionValue is called with "opt"
        when(commandLine.getOptionValue("opt")).thenReturn(null);

        // call the getOptionValue method with "opt"
        String result = commandLine.getOptionValue("opt");

        // assert that the result is null
        assertNull(result);
    }

    @Test
    public void testGetOptionValue_optionExistsNoArgument() {
        // create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // set up the mock to return an empty string when getOptionValue is called with "opt"
        when(commandLine.getOptionValue("opt")).thenReturn("");

        // call the getOptionValue method with "opt"
        String result = commandLine.getOptionValue("opt");

        // assert that the result is an empty string
        assertEquals("", result);
    }

    @Test
    public void testGetOptionValue_optionExistsWithArgument() {
        // create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // set up the mock to return "arg" when getOptionValue is called with "opt"
        when(commandLine.getOptionValue("opt")).thenReturn("arg");

        // call the getOptionValue method with "opt"
        String result = commandLine.getOptionValue("opt");

        // assert that the result is "arg"
        assertEquals("arg", result);
    }
}