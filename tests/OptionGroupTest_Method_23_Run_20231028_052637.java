package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_23_Run_20231028_052637 {
    @Test
    void testSetRequiredTrue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    void testSetRequiredFalse() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    void testSetRequiredSameValue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}