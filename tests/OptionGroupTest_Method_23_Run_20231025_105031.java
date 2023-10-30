package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionGroupTest_Method_23_Run_20231025_105031 {
    @Test
    public void testSetRequiredTrue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Assertions.assertTrue(group.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Assertions.assertFalse(group.isRequired());
    }

    @Test
    public void testSetRequiredSameValue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.setRequired(true);
        Assertions.assertTrue(group.isRequired());
    }
}