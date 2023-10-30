package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionTest_Method_94_Run_20231027_212614 {
    @Test
    public void testHasLongOpt() {
        Option option = new Option("a", "arg-name", false, "description");
        assertTrue(option.hasLongOpt());

        option = new Option("a", null, false, "description");
        assertFalse(option.hasLongOpt());

        option = new Option("a", "a", false, "description");
        assertTrue(option.hasLongOpt());
    }
}