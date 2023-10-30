package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommandLineTest_Method_141_Run_20231030_094427 {

    @Mock
    private CommandLine commandLine;

    @Test
    public void testGetOptionValue_whenOptionNotSpecified_returnsDefaultValue() {
        // given
        String opt = "opt";
        String defaultValue = "defaultValue";
        when(commandLine.getOptionValue(opt, defaultValue)).thenReturn(defaultValue);

        // when
        String result = commandLine.getOptionValue(opt, defaultValue);

        // then
        assertEquals(defaultValue, result);
    }

    @Test
    public void testGetOptionValue_whenOptionSpecifiedButNoArgument_returnsEmptyString() {
        // given
        String opt = "opt";
        String defaultValue = "defaultValue";
        when(commandLine.getOptionValue(opt, defaultValue)).thenReturn("");

        // when
        String result = commandLine.getOptionValue(opt, defaultValue);

        // then
        assertEquals("", result);
    }

    @Test
    public void testGetOptionValue_whenOptionSpecifiedAndHasArgument_returnsArgumentValue() {
        // given
        String opt = "opt";
        String defaultValue = "defaultValue";
        String argumentValue = "argumentValue";
        when(commandLine.getOptionValue(opt, defaultValue)).thenReturn(argumentValue);

        // when
        String result = commandLine.getOptionValue(opt, defaultValue);

        // then
        assertEquals(argumentValue, result);
    }
}