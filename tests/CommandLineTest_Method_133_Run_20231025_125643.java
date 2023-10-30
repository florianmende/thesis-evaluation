package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class CommandLineTest_Method_133_Run_20231025_125643 {

    @Test
    void testGetOptionProperties_optionNotPresent() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValuesList()).thenReturn(new ArrayList<>());

        // When
        Properties properties = commandLine.getOptionProperties(option);

        // Then
        Assertions.assertTrue(properties.isEmpty());
    }

    @Test
    void testGetOptionProperties_optionPresentButNoValues() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValuesList()).thenReturn(new ArrayList<>());
        commandLine.addOption(option);

        // When
        Properties properties = commandLine.getOptionProperties(option);

        // Then
        Assertions.assertTrue(properties.isEmpty());
    }

    @Test
    void testGetOptionProperties_optionPresentWithValues() {
        // Given
        CommandLine commandLine = new CommandLine();
        Option option = Mockito.mock(Option.class);
        List<String> values = new ArrayList<>();
        values.add("key");
        values.add("value");
        Mockito.when(option.getValuesList()).thenReturn(values);
        commandLine.addOption(option);

        // When
        Properties properties = commandLine.getOptionProperties(option);

        // Then
        Assertions.assertEquals(1, properties.size());
        Assertions.assertTrue(properties.containsKey("key"));
        Assertions.assertEquals("value", properties.get("key"));
    }
}