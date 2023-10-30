package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_143_Run_20231030_094427 {

    @Test
    public void testGetOptionValues_noValues() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(new ArrayList<>());
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();
        String[] values = commandLine.getOptionValues(option);
        assertNull(values);
    }

    @Test
    public void testGetOptionValues_withValues() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("value1", "value2"));
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();
        String[] values = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{"value1", "value2"}, values);
    }

    @Test
    public void testGetOptionValues_optionNotFound() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(new ArrayList<>());
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();
        String[] values = commandLine.getOptionValues(mock(Option.class));
        assertNull(values);
    }
}