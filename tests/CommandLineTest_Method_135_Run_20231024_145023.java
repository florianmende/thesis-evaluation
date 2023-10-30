package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_135_Run_20231024_145023 {
    @Test
    public void testGetOptionsEmpty() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return an empty list of options
        Mockito.when(commandLine.getOptions()).thenReturn(new Option[0]);

        // Call the getOptions method and verify that it returns an empty array
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptionsSingleOption() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return a list of options with a single element
        Option option = Mockito.mock(Option.class);
        Mockito.when(commandLine.getOptions()).thenReturn(new Option[] { option });

        // Call the getOptions method and verify that it returns an array with a single element
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
    }

    @Test
    public void testGetOptionsMultipleOptions() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set up the mock to return a list of options with multiple elements
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        Option option3 = Mockito.mock(Option.class);
        Mockito.when(commandLine.getOptions()).thenReturn(new Option[] { option1, option2, option3 });

        // Call the getOptions method and verify that it returns an array with multiple elements
        Option[] options = commandLine.getOptions();
        assertEquals(3, options.length);
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
        assertEquals(option3, options[2]);
    }
}