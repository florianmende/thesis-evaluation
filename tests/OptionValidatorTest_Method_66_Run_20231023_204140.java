package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class OptionValidatorTest_Method_66_Run_20231023_204140 {
    @Test
    public void testNullOption() {
        assertEquals(null, OptionValidator.validate(null));
    }

    @Test
    public void testValidSingleCharacterOption() {
        assertEquals("a", OptionValidator.validate("a"));
    }

    @Test
    public void testInvalidSingleCharacterOption() {
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate("!"));
    }

    @Test
    public void testValidMultiCharacterOption() {
        assertEquals("abc", OptionValidator.validate("abc"));
    }

    @Test
    public void testInvalidMultiCharacterOption() {
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate("a!c"));
    }
}