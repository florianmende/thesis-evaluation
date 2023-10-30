package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_15_Run_20231024_145023 {

    @Test
    public void testHasShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "bravo");
        options.addOption("c", "charlie");

        // Test if options has short option "a"
        assertTrue(options.hasShortOption("a"));
        // Test if options has short option "b"
        assertTrue(options.hasShortOption("b"));
        // Test if options has short option "c"
        assertTrue(options.hasShortOption("c"));

        // Test if options does not have short option "d"
        assertFalse(options.hasShortOption("d"));
        // Test if options does not have short option "e"
        assertFalse(options.hasShortOption("e"));
        // Test if options does not have short option "f"
        assertFalse(options.hasShortOption("f"));

        // Test if options does not have short option null
        assertFalse(options.hasShortOption(null));
        // Test if options does not have short option ""
        assertFalse(options.hasShortOption(""));
    }
}