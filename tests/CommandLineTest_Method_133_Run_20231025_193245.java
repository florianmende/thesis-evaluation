package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_133_Run_20231025_193245 {

    @Test
    public void testGetOptionPropertiesWithNoArguments() {
        // Create a mock Option object with no arguments
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(new ArrayList<>());

        // Create a CommandLine object with the mock Option object
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        // Call the getOptionProperties method with the mock Option object
        Properties properties = commandLine.getOptionProperties(option);

        // Assert that the returned Properties object is empty
        assertEquals(0, properties.size());
    }

    @Test
    public void testGetOptionPropertiesWithOneArgument() {
        // Create a mock Option object with one argument
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("arg1"));

        // Create a CommandLine object with the mock Option object
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        // Call the getOptionProperties method with the mock Option object
        Properties properties = commandLine.getOptionProperties(option);

        // Assert that the returned Properties object contains a single key-value pair
        assertEquals(1, properties.size());

        // Assert that the key is the first argument and the value is "true"
        assertEquals("true", properties.get("arg1"));
    }

    @Test
    public void testGetOptionPropertiesWithTwoArguments() {
        // Create a mock Option object with two arguments
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("arg1", "arg2"));

        // Create a CommandLine object with the mock Option object
        CommandLine commandLine = new CommandLine.Builder().addOption(option).build();

        // Call the getOptionProperties method with the mock Option object
        Properties properties = commandLine.getOptionProperties(option);

        // Assert that the returned Properties object contains a single key-value pair
        assertEquals(1, properties.size());

        // Assert that the key is the first argument and the value is the second argument
        assertEquals("arg2", properties.get("arg1"));
    }
}