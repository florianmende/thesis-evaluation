package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class CommandLineTest_Method_131_Run_20231023_204140 {

    @Test
    void testGetOptionObjectWithValidOptionCharacter() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option object
        Option option = mock(Option.class);

        // Set up the mock CommandLine object to return the mock Option object
        // when the getOptionObject method is called with the character 'a'
        when(commandLine.getOptionObject('a')).thenReturn(option);

        // Call the getOptionObject method with the character 'a'
        Object actual = commandLine.getOptionObject('a');

        // Assert that the actual object is equal to the mock Option object
        assertEquals(option, actual);
    }

    @Test
    void testGetOptionObjectWithInvalidOptionCharacter() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Call the getOptionObject method with an invalid option character
        Object actual = commandLine.getOptionObject('z');

        // Assert that the actual object is null
        assertNull(actual);
    }

    @Test
    void testGetOptionObjectWithValidOptionString() {
        // Create a mock CommandLine object
        CommandLine commandLine = mock(CommandLine.class);

        // Create a mock Option object
        Option option = mock(Option.class);

        // Set up the mock CommandLine object to return the mock Option object
        // when the getOptionObject method is called with the string "--option"
        when(commandLine.getOptionObject("--option")).thenReturn(option);

        // Call the getOptionObject method with the string "--option"
        Object actual = commandLine.getOptionObject("--option");

        // Assert that the actual object is equal to the mock Option object
        assertEquals(option, actual);
    }
}