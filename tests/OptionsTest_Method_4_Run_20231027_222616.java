package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OptionsTest_Method_4_Run_20231027_222616 {
    @Test
    public void testAddOptionWithShortAndLongName() {
        Options options = new Options();
        String shortName = "s";
        String longName = "long";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(shortName, longName, hasArg, description);
        assertTrue(options.hasOption(shortName));
        assertTrue(options.hasOption(longName));
        assertEquals(1, options.getOptions().size());
    }

    @Test
    public void testAddOptionWithShortNameOnly() {
        Options options = new Options();
        String shortName = "s";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(shortName, null, hasArg, description);
        assertTrue(options.hasOption(shortName));
        assertEquals(1, options.getOptions().size());
    }

    @Test
    public void testAddOptionWithLongNameOnly() {
        Options options = new Options();
        String longName = "long";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(null, longName, hasArg, description);
        assertTrue(options.hasOption(longName));
        assertEquals(1, options.getOptions().size());
    }
}