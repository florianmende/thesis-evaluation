package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_23_Run_20231027_212614 {
    @Test
    void testSetRequired() {
        OptionGroup group = new OptionGroup();

        // Case 1: set required to true
        group.setRequired(true);
        assertTrue(group.isRequired());

        // Case 2: set required to false
        group.setRequired(false);
        assertFalse(group.isRequired());

        // Case 3: set required to same value twice
        group.setRequired(true);
        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}