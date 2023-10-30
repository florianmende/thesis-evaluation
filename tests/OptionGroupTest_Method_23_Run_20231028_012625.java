package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionGroupTest_Method_23_Run_20231028_012625 {
    @Test
    public void testSetRequired() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertEquals(true, group.isRequired());
        group.setRequired(false);
        assertEquals(false, group.isRequired());
        assertFalse(group.isRequired());
    }
}