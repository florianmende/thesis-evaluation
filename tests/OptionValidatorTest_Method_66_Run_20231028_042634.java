package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OptionValidatorTest_Method_66_Run_20231028_042634 {
    @Test
    void testNullInput() {
        assertEquals(null, OptionValidator.validate(null));
    }

    @Test
    void testEmptyInput() {
        try {
            OptionValidator.validate("");
        } catch (IllegalArgumentException e) {
            throw new AssertionError("Expected IllegalArgumentException to be thrown, but nothing was thrown.", e);
        }
    }

    @Test
    void testValidInput() {
        assertEquals("abc", OptionValidator.validate("abc"));
    }
}