package org.apache.commons.cli;

import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionGroupTest_Method_22_Run_20231025_125643 {

    @Test
    void testIsRequired_required() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }

    @Test
    void testIsRequired_notRequired() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());
    }

    @Test
    void testIsRequired_empty() {
        OptionGroup optionGroup = new OptionGroup();
        assertFalse(optionGroup.isRequired());
    }
}