package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_15_Run_20231025_215329 {
    @Test
    void testHasShortOption() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);

        assertTrue(options.hasShortOption("a"));
        assertFalse(options.hasShortOption("b"));
        assertFalse(options.hasShortOption(null));
    }
}