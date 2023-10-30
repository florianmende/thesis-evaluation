package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionsTest_Method_15_Run_20231025_125643 {
    @Test
    public void testHasShortOptionValid() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "first option");
        options.addOption("b", "beta", false, "second option");
        options.addOption("c", "gamma", false, "third option");

        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasShortOption("b"));
        assertTrue(options.hasShortOption("c"));
    }

    @Test
    public void testHasShortOptionInvalid() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "first option");
        options.addOption("b", "beta", false, "second option");
        options.addOption("c", "gamma", false, "third option");

        assertFalse(options.hasShortOption("d"));
        assertFalse(options.hasShortOption("e"));
        assertFalse(options.hasShortOption("f"));
    }

    @Test
    public void testHasShortOptionLongOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "first option");
        options.addOption("b", "beta", false, "second option");
        options.addOption("c", "gamma", false, "third option");

        assertFalse(options.hasShortOption("alpha"));
        assertFalse(options.hasShortOption("beta"));
        assertFalse(options.hasShortOption("gamma"));
    }
}