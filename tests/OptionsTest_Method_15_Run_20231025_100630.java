package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionsTest_Method_15_Run_20231025_100630 {
    @Test
    public void testHasShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "beta");
        options.addOption("c", "gamma");

        // Case 1: The option with the specified short name exists in the `shortOpts` map
        assertTrue(options.hasShortOption("a"));

        // Case 2: The option with the specified short name does not exist in the `shortOpts` map
        assertFalse(options.hasShortOption("d"));

        // Case 3: The method is called with a null or empty string argument
        assertFalse(options.hasShortOption(null));
        assertFalse(options.hasShortOption(""));
    }
}