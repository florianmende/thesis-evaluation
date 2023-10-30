package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_106_Run_20231026_155023 {
    @Test
    public void testSetRequiredTrue() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void testSetRequiredSameValue() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
        option.setRequired(true);
        assertTrue(option.isRequired());
    }
}