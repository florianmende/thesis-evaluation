package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OptionValidatorTest_Method_66_Run_20231023_214133 {
    @Test
    void testValidateNullOption() {
        assertEquals(null, OptionValidator.validate(null));
    }

    @Test
    void testValidateInvalidSingleCharacterOption() {
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate("!"));
    }

    @Test
    void testValidateInvalidMultiCharacterOption() {
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate("abc!"));
    }
}