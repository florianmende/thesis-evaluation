package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.apache.commons.cli.OptionValidator;

public class OptionValidatorTest_Method_65_Run_20231028_052637 {
    @Test
    public void testValidSingleCharacterOption() {
        // Test with a valid single-character option
        String option = "a";
        String expected = "a";
        assertEquals(expected, OptionValidator.validate(option));
    }

    @Test
    public void testValidMultiCharacterOption() {
        // Test with a valid multi-character option
        String option = "abc";
        String expected = "abc";
        assertEquals(expected, OptionValidator.validate(option));
    }

    @Test
    public void testInvalidOption() {
        // Test with an invalid option
        String option = "abc-";
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }
}