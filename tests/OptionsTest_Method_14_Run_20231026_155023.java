package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionsTest_Method_14_Run_20231026_155023 {
    @Test
    public void testHasOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "charlie", false, "Charlie option");

        // Case 1: The option is a member of the shortOpts map.
        assertTrue(options.hasOption("a"));

        // Case 2: The option is a member of the longOpts map.
        assertTrue(options.hasOption("alpha"));

        // Case 3: The option is not a member of either map.
        assertFalse(options.hasOption("delta"));
    }
}