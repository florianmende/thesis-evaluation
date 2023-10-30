package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_128_Run_20231030_094427 {

    @Test
    void testAddOption() {
        // Test that the method adds an option to the command line when the option is not null
        Option option = mock(Option.class);
        when(option.getValues()).thenReturn(new String[] { "value1", "value2" });
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        assertEquals(1, commandLine.getOptions().length);
        assertEquals(option, commandLine.getOptions()[0]);

        // Test that the method does not add an option to the command line when the option is null
        commandLine = new CommandLine();
        commandLine.addOption(null);
        assertEquals(0, commandLine.getOptions().length);

        // Test that the method stores the values of the option
        commandLine = new CommandLine();
        commandLine.addOption(option);
        String[] values = commandLine.getOptionValues("option");
        if (values != null) {
            assertEquals(2, values.length);
            assertEquals("value1", values[0]);
            assertEquals("value2", values[1]);
        } else {
            assertNull(values);
        }
    }
}