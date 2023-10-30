package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_14_Run_20231028_022628 {
    @Test
    void testHasOptionWithShortOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        assertTrue(options.hasOption("a"));
    }

    @Test
    void testHasOptionWithLongOption() {
        Options options = new Options();
        options.addOption("alpha", "a");
        assertTrue(options.hasOption("alpha"));
    }

    @Test
    void testHasOptionWithNonMemberOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        assertFalse(options.hasOption("b"));
    }
}