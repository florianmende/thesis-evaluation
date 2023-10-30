package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_8_Run_20231028_042634 {
    @Test
    public void testGetOptionWithShortName() {
        // Arrange
        String shortName = "h";
        String longName = "help";
        String description = "Display help";
        Option option = new Option(shortName, longName, false, description);
        Map<String, Option> shortOpts = new HashMap<>();
        shortOpts.put(shortName, option);
        Map<String, Option> longOpts = new HashMap<>();
        longOpts.put(longName, option);
        Options options = new Options();
        options.addOption(shortOpts.get(shortName));

        // Act
        Option actualOption = options.getOption(shortName);

        // Assert
        assertEquals(option, actualOption);
    }

    @Test
    public void testGetOptionWithLongName() {
        // Arrange
        String shortName = "h";
        String longName = "help";
        String description = "Display help";
        Option option = new Option(shortName, longName, false, description);
        Map<String, Option> shortOpts = new HashMap<>();
        shortOpts.put(shortName, option);
        Map<String, Option> longOpts = new HashMap<>();
        longOpts.put(longName, option);
        Options options = new Options();
        options.addOption(longOpts.get(longName));

        // Act
        Option actualOption = options.getOption(longName);

        // Assert
        assertEquals(option, actualOption);
    }

    @Test
    public void testGetOptionWithInvalidName() {
        // Arrange
        String shortName = "h";
        String longName = "help";
        String description = "Display help";
        Option option = new Option(shortName, longName, false, description);
        Map<String, Option> shortOpts = new HashMap<>();
        shortOpts.put(shortName, option);
        Map<String, Option> longOpts = new HashMap<>();
        longOpts.put(longName, option);
        Options options = new Options();
        options.addOption(shortOpts.get(shortName));
        options.addOption(longOpts.get(longName));

        // Act
        Option actualOption = options.getOption("invalid");

        // Assert
        assertNull(actualOption);
    }
}