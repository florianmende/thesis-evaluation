package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_140_Run_20231023_214133 {

    @Mock
    private CommandLine commandLine;

    @Mock
    private Option option;

    @Test
    public void testGetOptionValue_OptionNotSet() {
        when(commandLine.getOptionValue(option)).thenReturn(null);
        assertNull(commandLine.getOptionValue(option));
    }

    @Test
    public void testGetOptionValue_OptionSetNoArgument() {
        when(commandLine.getOptionValue(option)).thenReturn("");
        assertEquals("", commandLine.getOptionValue(option));
    }

    @Test
    public void testGetOptionValue_OptionSetWithArgument() {
        when(commandLine.getOptionValue(option)).thenReturn("arg");
        assertEquals("arg", commandLine.getOptionValue(option));
    }
}