package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_15_Run_20231024_091429 {

    @Test
    public void testHasShortOption() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        options.addOption("v", "version", false, "Show version");

        // Check if the options have the expected short options
        assertTrue(options.hasShortOption("h"));
        assertTrue(options.hasShortOption("v"));

        // Check if the options do not have the unexpected short options
        assertFalse(options.hasShortOption("x"));
        assertFalse(options.hasShortOption(null));
        assertFalse(options.hasShortOption(""));
    }
}