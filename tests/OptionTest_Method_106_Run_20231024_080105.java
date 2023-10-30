package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OptionTest_Method_106_Run_20231024_080105 {
    @Test
    void testSetRequired() {
        Option option = new Option("a", "description");

        // case 1: the option is not mandatory by default, and setting it to mandatory should change its status
        option.setRequired(true);
        assertTrue(option.isRequired());

        // case 2: the option is already mandatory, and setting it to not mandatory should change its status
        option.setRequired(false);
        assertFalse(option.isRequired());

        // case 3: the option is not mandatory, and setting it to mandatory should not change its status if the same value is passed again
        option.setRequired(false);
        assertFalse(option.isRequired());
    }
}