package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionTest_Method_97_Run_20231025_100630 {
    @Test
    public void testHasValueSeparator() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());

        option = new Option("a", "arg-name", false, "description");
        assertFalse(option.hasValueSeparator());

        option = new Option("a", "arg-name", true, "description");
        assertFalse(option.hasValueSeparator());
    }
}