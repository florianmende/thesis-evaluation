package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Properties;

class CommandLineTest_Method_133_Run_20231025_105031 {

    @Test
    void testGetOptionProperties() {
        // Create a mock Option object
        Option mockOption = Mockito.mock(Option.class);

        // Create a mock CommandLine object
        CommandLine mockCommandLine = Mockito.mock(CommandLine.class);

        // Set up the behavior of the mock CommandLine object
        Mockito.when(mockCommandLine.getOptionProperties(mockOption)).thenReturn(new Properties());

        // Test case 1: The method returns an empty Properties object when the option passed as a parameter has no arguments.
        assertTrue(mockCommandLine.getOptionProperties(mockOption).isEmpty());

        // Set up the behavior of the mock CommandLine object
        Mockito.when(mockCommandLine.getOptionProperties(mockOption)).thenReturn(new Properties());

        // Test case 2: The method returns a Properties object with a single key-value pair when the option passed as a parameter has two arguments.
        Properties expectedProperties = new Properties();
        expectedProperties.put("key", "value");
        Mockito.when(mockCommandLine.getOptionProperties(mockOption)).thenReturn(expectedProperties);
        assertEquals(expectedProperties, mockCommandLine.getOptionProperties(mockOption));

        // Set up the behavior of the mock CommandLine object
        Mockito.when(mockCommandLine.getOptionProperties(mockOption)).thenReturn(new Properties());

        // Test case 3: The method returns a Properties object with a single key-value pair where the value is "true" when the option passed as a parameter has only one argument.
        Properties expectedProperties2 = new Properties();
        expectedProperties2.put("key", "true");
        Mockito.when(mockCommandLine.getOptionProperties(mockOption)).thenReturn(expectedProperties2);
        assertEquals(expectedProperties2, mockCommandLine.getOptionProperties(mockOption));
    }
}