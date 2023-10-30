package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231025_100630 {

    @Test
    void testGetOptionsEmpty() {
        // Given
        CommandLine commandLine = new CommandLine();

        // When
        Option[] options = commandLine.getOptions();

        // Then
        assertArrayEquals(new Option[0], options);
    }

    @Test
    void testGetOptions() {
        // Given
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option1);
        commandLine.addOption(option2);

        // When
        Option[] options = commandLine.getOptions();

        // Then
        assertArrayEquals(new Option[] { option1, option2 }, options);
    }

    @Test
    void testGetOptionsOrder() {
        // Given
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option1);
        commandLine.addOption(option2);

        // When
        Option[] options = commandLine.getOptions();

        // Then
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
    }
}