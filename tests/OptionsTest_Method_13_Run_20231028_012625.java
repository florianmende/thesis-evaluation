package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_13_Run_20231028_012625 {

    @Test
    public void testHasLongOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        options.addOption("c", "gamma", false, "gamma option");

        assertTrue(options.hasLongOption("alpha"));
        assertTrue(options.hasLongOption("beta"));
        assertTrue(options.hasLongOption("gamma"));

        assertFalse(options.hasLongOption("delta"));
        assertFalse(options.hasLongOption("epsilon"));
        assertFalse(options.hasLongOption("zeta"));
    }
}