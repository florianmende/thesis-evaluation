package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_15_Run_20231028_012625 {
    @Test
    public void testHasShortOption_emptyMap() {
        Options options = new Options();
        assertFalse(options.hasShortOption("a"));
    }

    @Test
    public void testHasShortOption_validShortOption() {
        Options options = new Options();
        Option option = new Option("a", "aaa");
        options.addOption(option);
        assertTrue(options.hasShortOption("a"));
    }

    @Test
    public void testHasShortOption_invalidShortOption() {
        Options options = new Options();
        Option option = new Option("a", "aaa");
        options.addOption(option);
        assertFalse(options.hasShortOption("b"));
    }
}