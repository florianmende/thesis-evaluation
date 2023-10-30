package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionValidatorTest_Method_64_Run_20231027_232619 {
    @Test
    void testNullOption() {
        // Setup
        String option = null;

        // Execute
        String result = OptionValidator.validate(option);

        // Verify
        Assertions.assertNull(result);
    }

    @Test
    void testSingleCharacterOption() {
        // Setup
        String option = "a";

        // Execute
        String result = OptionValidator.validate(option);

        // Verify
        Assertions.assertEquals("a", result);
    }

    @Test
    void testMultiCharacterOption() {
        // Setup
        String option = "abc";

        // Execute
        String result = OptionValidator.validate(option);

        // Verify
        Assertions.assertEquals("abc", result);
    }
}