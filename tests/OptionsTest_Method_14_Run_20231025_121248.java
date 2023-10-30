package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionsTest_Method_14_Run_20231025_121248 {
    @Test
    public void testHasOptionShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "This is option a");
        options.addOption("b", "beta", false, "This is option b");
        options.addOption("c", "charlie", false, "This is option c");

        Assertions.assertTrue(options.hasOption("a"));
        Assertions.assertTrue(options.hasOption("b"));
        Assertions.assertTrue(options.hasOption("c"));
    }

    @Test
    public void testHasOptionLongOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "This is option a");
        options.addOption("b", "beta", false, "This is option b");
        options.addOption("c", "charlie", false, "This is option c");

        Assertions.assertTrue(options.hasOption("alpha"));
        Assertions.assertTrue(options.hasOption("beta"));
        Assertions.assertTrue(options.hasOption("charlie"));
    }

    @Test
    public void testHasOptionNotMember() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "This is option a");
        options.addOption("b", "beta", false, "This is option b");
        options.addOption("c", "charlie", false, "This is option c");

        Assertions.assertFalse(options.hasOption("d"));
        Assertions.assertFalse(options.hasOption("delta"));
        Assertions.assertFalse(options.hasOption("echo"));
    }
}