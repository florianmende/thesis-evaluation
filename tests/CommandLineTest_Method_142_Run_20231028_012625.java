package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_142_Run_20231028_012625 {

    @Test
    public void testGetOptionValues() {
        // Create a mock CommandLine instance
        CommandLine commandLine = mock(CommandLine.class);

        // Set up the mock behavior for the getOptionValues method
        doReturn(new String[] {"value1", "value2"}).when(commandLine).getOptionValues("a");

        // Test the getOptionValues method
        String[] values = commandLine.getOptionValues("a");
        assertArrayEquals(new String[] {"value1", "value2"}, values);
    }
}