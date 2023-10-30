package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_3_Run_20231025_125643 {
    @Test
    public void testAddOptionWithExistingShortName() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("a", "alpha", false, "alpha option");
        assertEquals(1, options.getOptions().size());
        assertEquals("alpha", options.getOption("a").getLongOpt());
    }

    @Test
    public void testAddOptionWithNewShortName() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        assertEquals(2, options.getOptions().size());
        assertEquals("alpha", options.getOption("a").getLongOpt());
        assertEquals("beta", options.getOption("b").getLongOpt());
    }

    @Test
    public void testAddOptionWithLongName() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        assertEquals(2, options.getOptions().size());
        assertEquals("alpha", options.getOption("a").getLongOpt());
        assertEquals("beta", options.getOption("b").getLongOpt());
    }
}