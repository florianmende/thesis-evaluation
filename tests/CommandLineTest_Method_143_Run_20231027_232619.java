package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class CommandLineTest_Method_143_Run_20231027_232619 {

    @Test
    public void testGetOptionValues() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Case 1: The option is not found in the list of processed options
        Mockito.when(commandLine.getOptionValues(option)).thenReturn(null);
        Assertions.assertNull(commandLine.getOptionValues(option));

        // Case 2: The option is found in the list of processed options, but it has no values
        Mockito.when(commandLine.getOptionValues(option)).thenReturn(new String[0]);
        Assertions.assertArrayEquals(new String[0], commandLine.getOptionValues(option));

        // Case 3: The option is found in the list of processed options, and it has values
        Mockito.when(commandLine.getOptionValues(option)).thenReturn(new String[]{"value1", "value2"});
        Assertions.assertArrayEquals(new String[]{"value1", "value2"}, commandLine.getOptionValues(option));
    }
}