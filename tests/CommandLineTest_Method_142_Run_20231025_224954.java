package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_142_Run_20231025_224954 {

    @Test
    public void testGetOptionValues() throws Exception {
        // Create a mock Option object
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(new String[] {"value1", "value2"});

        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);
        when(commandLine.getOptionValues(option)).thenReturn(new String[] {"value1", "value2"});

        // Test case 1: The option is set and has an argument
        String[] values = commandLine.getOptionValues(option);
        assertArrayEquals(new String[] {"value1", "value2"}, values);

        // Test case 2: The option is set but does not have an argument
        when(commandLine.getOptionValues(option)).thenReturn(null);
        values = commandLine.getOptionValues(option);
        assertNull(values);

        // Test case 3: The option is not set
        when(commandLine.getOptionValues(option)).thenReturn(null);
        values = commandLine.getOptionValues(option);
        assertNull(values);
    }
}