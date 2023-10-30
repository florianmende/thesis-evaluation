package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_15_Run_20231025_183916 {
    @Test
    public void testHasShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "bravo");

        // Case 1: The Options instance contains a short option with the specified name.
        assertTrue(options.hasShortOption("a"));

        // Case 2: The Options instance does not contain a short option with the specified name.
        assertFalse(options.hasShortOption("c"));

        // Case 3: The specified name is null or empty.
        assertFalse(options.hasShortOption(null));
        assertFalse(options.hasShortOption(""));
    }
}