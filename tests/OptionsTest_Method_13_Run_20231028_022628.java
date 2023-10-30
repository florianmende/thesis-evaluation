package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;

public class OptionsTest_Method_13_Run_20231028_022628 {
    @Test
    public void testHasLongOption() {
        Options options = new Options();
        options.addOption(Option.builder("a").longOpt("alpha").build());
        options.addOption(Option.builder("b").longOpt("beta").build());

        // Case 1: The Options class contains an option with the long name specified in the opt argument.
        Assertions.assertTrue(options.hasLongOption("alpha"));

        // Case 2: The Options class does not contain an option with the long name specified in the opt argument.
        Assertions.assertFalse(options.hasLongOption("gamma"));

        // Case 3: The opt argument is null or empty.
        Assertions.assertFalse(options.hasLongOption(null));
        Assertions.assertFalse(options.hasLongOption(""));
    }
}