package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_97_Run_20231023_214133 {
    @Test
    void testHasValueSeparator() {
        // Case 1: The option has a value separator and the method returns true.
        Option option = new Option("a", true, "description");
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());

        // Case 2: The option does not have a value separator and the method returns false.
        option = new Option("a", false, "description");
        assertFalse(option.hasValueSeparator());

        // Case 3: The option has a value separator but the separator is not the default '=' character and the method returns true.
        option = new Option("a", true, "description");
        option.setValueSeparator(':');
        assertTrue(option.hasValueSeparator());
    }
}