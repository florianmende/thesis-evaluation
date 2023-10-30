package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionsTest_Method_14_Run_20231028_042634 {
    @Test
    public void testHasOptionPresentInShortOpts() {
        Options options = new Options();
        options.addOption("short", "long", false, "description");
        Assertions.assertTrue(options.hasOption("short"));
    }

    @Test
    public void testHasOptionPresentInLongOpts() {
        Options options = new Options();
        options.addOption("short", "long", false, "description");
        Assertions.assertTrue(options.hasOption("long"));
    }

    @Test
    public void testHasOptionPresentInBothOpts() {
        Options options = new Options();
        options.addOption("short", "long", false, "description");
        Assertions.assertTrue(options.hasOption("short"));
        Assertions.assertTrue(options.hasOption("long"));
    }
}