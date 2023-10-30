package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OptionGroupTest_Method_22_Run_20231027_222616 {
    @Test
    void isRequired_whenRequired_returnsTrue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    void isRequired_whenNotRequired_returnsFalse() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    void isRequired_whenEmpty_returnsFalse() {
        OptionGroup group = new OptionGroup();
        assertFalse(group.isRequired());
    }
}