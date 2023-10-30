package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_128_Run_20231025_100630 {

    @Test
    public void testAddOption() {
        // Test that the method adds an option to the command line when the option is not null
        Option option1 = mock(Option.class);
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option1);
        List<Option> options = Arrays.asList(commandLine.getOptions());
        assertEquals(1, options.size());
        assertTrue(options.contains(option1));

        // Test that the method does not add an option to the command line when the option is null
        Option option2 = null;
        commandLine.addOption(option2);
        options = Arrays.asList(commandLine.getOptions());
        assertEquals(1, options.size());
        assertTrue(options.contains(option1));

        // Test that the method stores the values of the option
        Option option3 = mock(Option.class);
        when(option3.getValues()).thenReturn(new String[] { "value1", "value2" });
        commandLine.addOption(option3);
        options = Arrays.asList(commandLine.getOptions());
        assertEquals(2, options.size());
        assertTrue(options.contains(option1));
        assertTrue(options.contains(option3));
    }
}