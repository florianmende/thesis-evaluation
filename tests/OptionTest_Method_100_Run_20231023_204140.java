package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_100_Run_20231023_204140 {
    @Test
    public void testRequiresArg1() {
        Option option = new Option("a", false, "description");
        assertFalse(option.requiresArg());
    }

    @Test
    public void testRequiresArg2() {
        Option option = new Option("a", true, "description");
        assertTrue(option.requiresArg());
    }

    @Test
    public void testRequiresArg3() {
        Option option = new Option("a", true, "description");
        option.setOptionalArg(true);
        assertFalse(option.requiresArg());
    }
}