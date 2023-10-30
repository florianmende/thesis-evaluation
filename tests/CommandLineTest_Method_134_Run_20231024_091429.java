package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_134_Run_20231024_091429 {

    @Test
    public void testGetOptionPropertiesWithNoOption() {
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionProperties("foo")).thenReturn(new Properties());
        assertEquals(new Properties(), commandLine.getOptionProperties("foo"));
    }

    @Test
    public void testGetOptionPropertiesWithMultipleArguments() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("key", "value"));
        when(commandLine.getOptionProperties("foo")).thenReturn(new Properties());
        when(commandLine.getOptionProperties("foo")).thenReturn(new Properties());
        assertEquals(new Properties(), commandLine.getOptionProperties("foo"));
    }

    @Test
    public void testGetOptionPropertiesWithSingleArgument() {
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("key"));
        when(commandLine.getOptionProperties("foo")).thenReturn(new Properties());
        when(commandLine.getOptionProperties("foo")).thenReturn(new Properties());
        assertEquals(new Properties(), commandLine.getOptionProperties("foo"));
    }
}