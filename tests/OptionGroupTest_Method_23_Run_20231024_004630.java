package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

class OptionGroupTest_Method_23_Run_20231024_004630 {
    @Test
    void testSetRequiredTrue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Assertions.assertTrue(group.isRequired());
    }

    @Test
    void testSetRequiredFalse() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Assertions.assertFalse(group.isRequired());
    }

    @Test
    void testSetRequiredNull() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
    }
}