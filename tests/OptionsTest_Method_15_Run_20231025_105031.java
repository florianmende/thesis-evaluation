package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionsTest_Method_15_Run_20231025_105031 {
    @Test
    public void testHasShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "beta");
        options.addOption("c", "gamma");

        Assertions.assertTrue(options.hasShortOption("a"));
        Assertions.assertTrue(options.hasShortOption("b"));
        Assertions.assertTrue(options.hasShortOption("c"));

        Assertions.assertFalse(options.hasShortOption("d"));
        Assertions.assertFalse(options.hasShortOption(null));
        Assertions.assertFalse(options.hasShortOption(""));
    }
}