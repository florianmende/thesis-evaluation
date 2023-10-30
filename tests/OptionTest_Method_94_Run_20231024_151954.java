package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_94_Run_20231024_151954 {

    @Test
    public void testHasLongOptNullOption() {
        Option option = new Option(null, null, false, null);
        assertFalse(option.hasLongOpt());
    }

    @Test
    public void testHasLongOptNullLongOption() {
        Option option = new Option("a", null, false, null);
        assertFalse(option.hasLongOpt());
    }

    @Test
    public void testHasLongOpt() {
        Option option = new Option("a", "long-a", false, null);
        assertTrue(option.hasLongOpt());
    }
}