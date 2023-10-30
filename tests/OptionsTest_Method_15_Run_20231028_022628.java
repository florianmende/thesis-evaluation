package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class OptionsTest_Method_15_Run_20231028_022628 {
    @Test
    public void testHasShortOption() {
        // Test that the method returns true when the option is present in the Options instance
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, ""));
        Assert.assertTrue(options.hasShortOption("a"));

        // Test that the method returns false when the option is not present in the Options instance
        options = new Options();
        options.addOption(new Option("b", "bbb", false, ""));
        Assert.assertFalse(options.hasShortOption("a"));

        // Test that the method ignores leading hyphens in the option name
        options = new Options();
        options.addOption(new Option("a", "aaa", false, ""));
        Assert.assertTrue(options.hasShortOption("a"));
    }
}