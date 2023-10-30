package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_13_Run_20231027_222616 {
    @Test
    void testHasLongOption() {
        // Case 1: The option with the given long name is a member of the Options instance
        Options options = new Options();
        Option option = new Option("a", "long-name", false, "description");
        options.addOption(option);
        assertTrue(options.hasLongOption("long-name"));

        // Case 2: The option with the given long name is not a member of the Options instance
        options = new Options();
        assertFalse(options.hasLongOption("long-name"));

        // Case 3: The given long name is null or empty
        options = new Options();
        assertFalse(options.hasLongOption(null));
        assertFalse(options.hasLongOption(""));
    }
}