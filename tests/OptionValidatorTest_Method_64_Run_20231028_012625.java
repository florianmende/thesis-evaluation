package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OptionValidatorTest_Method_64_Run_20231028_012625 {

    @Test
    void testValidateSingleCharacterOption() {
        // Test a valid single character option
        assertEquals("a", OptionValidator.validate("a"));

        // Test a valid single character option with a special character
        assertEquals("b", OptionValidator.validate("b"));

        // Test an invalid single character option
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate("!"));
    }

    @Test
    void testValidateMultiCharacterOption() {
        // Test a valid multi character option
        assertEquals("abc", OptionValidator.validate("abc"));

        // Test a multi character option with invalid characters
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate("a!b"));
    }

    @Test
    void testValidateNullOption() {
        // Test a null option
        assertEquals(null, OptionValidator.validate(null));
    }
}