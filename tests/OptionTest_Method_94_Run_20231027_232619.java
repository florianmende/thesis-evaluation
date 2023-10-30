package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_94_Run_20231027_232619 {
    @Test
    public void testHasLongOpt() {
        Option option = new Option("a", "arg-name", true, "description");
        assertTrue(option.hasLongOpt());

        option = new Option("a", null, true, "description");
        assertFalse(option.hasLongOpt());

        option = null;
        assertFalse(option != null && option.hasLongOpt());
    }
}