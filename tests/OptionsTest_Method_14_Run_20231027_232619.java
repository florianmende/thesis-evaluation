package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionsTest_Method_14_Run_20231027_232619 {
    @Test
    public void testHasOption() {
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "beta");
        options.addOption("c", "charlie");

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));

        assertFalse(options.hasOption("d"));
        assertFalse(options.hasOption("e"));
        assertFalse(options.hasOption("f"));
    }
}