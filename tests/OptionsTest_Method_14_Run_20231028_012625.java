package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;

public class OptionsTest_Method_14_Run_20231028_012625 {
    @Test
    public void testHasOption() {
        Options options = new Options();
        Option shortOption = new Option("s", "shortOption", false, "short option");
        Option longOption = new Option("l", "longOption", false, "long option");
        options.addOption(shortOption);
        options.addOption(longOption);

        // Case 1: The option is a member of the shortOpts map.
        Assertions.assertTrue(options.hasOption("s"));
        // Case 2: The option is a member of the longOpts map.
        Assertions.assertTrue(options.hasOption("longOption"));
        // Case 3: The option is not a member of either map.
        Assertions.assertFalse(options.hasOption("nonExistentOption"));
    }
}