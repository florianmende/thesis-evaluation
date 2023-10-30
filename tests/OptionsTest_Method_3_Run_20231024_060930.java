package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionsTest_Method_3_Run_20231024_060930 {
    @Test
    public void testAddOption_shortName_longName_noArgumentRequired() {
        // Arrange
        Options options = new Options();
        String shortName = "s";
        String longName = "long";
        boolean argumentRequired = false;
        String description = "Self-documenting description";

        // Act
        options.addOption(shortName, longName, argumentRequired, description);

        // Assert
        Option option = options.getOption(shortName);
        assertEquals(shortName, option.getOpt());
        assertEquals(longName, option.getLongOpt());
        assertEquals(argumentRequired, option.hasArg());
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testAddOption_shortName_longName_argumentRequired() {
        // Arrange
        Options options = new Options();
        String shortName = "s";
        String longName = "long";
        boolean argumentRequired = true;
        String description = "Self-documenting description";

        // Act
        options.addOption(shortName, longName, argumentRequired, description);

        // Assert
        Option option = options.getOption(shortName);
        assertEquals(shortName, option.getOpt());
        assertEquals(longName, option.getLongOpt());
        assertEquals(argumentRequired, option.hasArg());
        assertEquals(description, option.getDescription());
    }

    @Test
    public void testAddOption_shortName_noArgumentRequired() {
        // Arrange
        Options options = new Options();
        String shortName = "s";
        boolean argumentRequired = false;
        String description = "Self-documenting description";

        // Act
        options.addOption(shortName, null, argumentRequired, description);

        // Assert
        Option option = options.getOption(shortName);
        assertEquals(shortName, option.getOpt());
        assertEquals(null, option.getLongOpt());
        assertEquals(argumentRequired, option.hasArg());
        assertEquals(description, option.getDescription());
    }
}