package org.apache.commons.cli;


import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionGroupTest_Method_22_Run_20231025_224954 {
    @Test
    void testIsRequired() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    void testIsNotRequired() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    void testIsRequiredButNotSelected() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}