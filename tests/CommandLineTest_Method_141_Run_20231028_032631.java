package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_141_Run_20231028_032631 {

    @Mock
    private CommandLine commandLine;

    @Mock
    private Option option;

    @Test
    public void testGetOptionValue_optionNotSpecified() {
        when(commandLine.getOptionValue("opt", "default")).thenReturn("default");
        assertEquals("default", commandLine.getOptionValue("opt", "default"));
    }

    @Test
    public void testGetOptionValue_optionSpecified_noArgument() {
        when(commandLine.getOptionValue("opt", "default")).thenReturn("");
        assertEquals("", commandLine.getOptionValue("opt", "default"));
    }

    @Test
    public void testGetOptionValue_optionSpecified_withArgument() {
        when(commandLine.getOptionValue("opt", "default")).thenReturn("arg");
        assertEquals("arg", commandLine.getOptionValue("opt", "default"));
    }
}