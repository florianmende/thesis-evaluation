package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_134_Run_20231025_121248 {

    @Test
    void testGetOptionProperties() {
        // Case 1: The option is not found in the CommandLine instance.
        CommandLine commandLine = new CommandLine();
        Properties properties = commandLine.getOptionProperties("-Dparam1=value1");
        assertTrue(properties.isEmpty());

        // Case 2: The option has only one argument, and the value is set to "true".
        commandLine = new CommandLine();
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("-Dparam1");
        when(option.getValuesList()).thenReturn(new ArrayList<String>(Arrays.asList("value1")));
        commandLine.addOption(option);
        properties = commandLine.getOptionProperties("-Dparam1");
        assertEquals("true", properties.getProperty("value1"));

        // Case 3: The option has more than one argument, and the values are stored in the Properties object.
        commandLine = new CommandLine();
        option = mock(Option.class);
        when(option.getOpt()).thenReturn("-Dparam1");
        when(option.getValuesList()).thenReturn(new ArrayList<String>(Arrays.asList("value1", "value2")));
        commandLine.addOption(option);
        properties = commandLine.getOptionProperties("-Dparam1");
        assertEquals("value2", properties.getProperty("value1"));
    }
}