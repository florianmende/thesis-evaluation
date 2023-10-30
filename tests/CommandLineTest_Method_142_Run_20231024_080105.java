package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_142_Run_20231024_080105 {
    @Test
    public void testGetOptionValues() {
        // Case 1: The option is set and has an argument
        CommandLine commandLine = mock(CommandLine.class);
        Option option = mock(Option.class);
        when(commandLine.getOptionValues(option)).thenReturn(new String[]{"arg1", "arg2"});
        String[] values = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{"arg1", "arg2"}, values);

        // Case 2: The option is set but has no argument
        commandLine = mock(CommandLine.class);
        option = mock(Option.class);
        when(commandLine.getOptionValues(option)).thenReturn(null);
        values = commandLine.getOptionValues(option);
        assertNull(values);

        // Case 3: The option is not set
        commandLine = mock(CommandLine.class);
        option = mock(Option.class);
        when(commandLine.getOptionValues(option)).thenReturn(null);
        values = commandLine.getOptionValues(option);
        assertNull(values);
    }
}