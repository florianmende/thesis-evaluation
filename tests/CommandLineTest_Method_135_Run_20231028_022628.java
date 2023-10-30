package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;
import java.util.List;
import java.util.ArrayList;

public class CommandLineTest_Method_135_Run_20231028_022628 {

    @Test
    public void testGetOptions() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Create a mock Option instance
        Option option = Mockito.mock(Option.class);

        // Add the mock Option instance to the options list
        Option[] options = new Option[] { option };

        // Set the options list to the mock CommandLine instance
        Mockito.when(commandLine.getOptions()).thenReturn(options);

        // Call the getOptions method on the mock CommandLine instance
        Option[] optionsArray = commandLine.getOptions();

        // Verify that the options list contains the mock Option instance
        assertEquals(1, optionsArray.length);
        assertSame(option, optionsArray[0]);
    }

    @Test
    public void testGetOptionsEmpty() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set the options list to an empty array
        Option[] options = new Option[] {};
        Mockito.when(commandLine.getOptions()).thenReturn(options);

        // Call the getOptions method on the mock CommandLine instance
        Option[] optionsArray = commandLine.getOptions();

        // Verify that the options list is empty
        assertEquals(0, optionsArray.length);
    }

    @Test
    public void testGetOptionsNull() {
        // Create a mock CommandLine instance
        CommandLine commandLine = Mockito.mock(CommandLine.class);

        // Set the options list to null
        Option[] options = null;
        Mockito.when(commandLine.getOptions()).thenReturn(options);

        // Call the getOptions method on the mock CommandLine instance
        Option[] optionsArray = commandLine.getOptions();

        // Verify that the options list is null
        assertNull(optionsArray);
    }
}