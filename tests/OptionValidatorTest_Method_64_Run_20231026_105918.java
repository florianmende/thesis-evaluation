package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class OptionValidatorTest_Method_64_Run_20231026_105918 {
    @Test
    void testNullOption() {
        String option = null;
        String result = OptionValidator.validate(option);
        Assertions.assertNull(result, "Null option should return null");
    }

    @Test
    void testValidSingleCharacterOption() {
        String option = "a";
        String result = OptionValidator.validate(option);
        Assertions.assertEquals(option, result, "Valid single character option should return the option");
    }

    @Test
    void testInvalidMultiCharacterOption() {
        String option = "abc@";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate(option);
        }, "Invalid multi-character option should throw an exception");
    }
}