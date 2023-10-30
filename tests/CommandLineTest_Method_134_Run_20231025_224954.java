package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_134_Run_20231025_224954 {

    @Test
    public void testGetOptionProperties() {
        // Case 1: Option has two arguments
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        when(option.getValuesList()).thenReturn(Arrays.asList("arg1", "arg2"));

        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);

        Properties props = commandLine.getOptionProperties("opt");
        assertEquals(1, props.size());
        assertEquals("arg2", props.getProperty("arg1"));

        // Case 2: Option has one argument
        option = mock(Option.class);
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        when(option.getValuesList()).thenReturn(Arrays.asList("arg1"));

        commandLine = new CommandLine();
        commandLine.addOption(option);

        props = commandLine.getOptionProperties("opt");
        assertEquals(1, props.size());
        assertEquals("true", props.getProperty("arg1"));

        // Case 3: Option has no arguments
        option = mock(Option.class);
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        when(option.getValuesList()).thenReturn(Arrays.asList());

        commandLine = new CommandLine();
        commandLine.addOption(option);

        props = commandLine.getOptionProperties("opt");
        assertTrue(props.isEmpty());
    }
}