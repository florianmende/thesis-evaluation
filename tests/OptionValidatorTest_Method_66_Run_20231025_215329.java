package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionValidatorTest_Method_66_Run_20231025_215329 {
    @Test
    public void testValidateNull() {
        OptionValidator validator = new OptionValidator();
        Assertions.assertNull(validator.validate(null));
    }

    @Test
    public void testValidateInvalidSingleCharacter() {
        OptionValidator validator = new OptionValidator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> validator.validate("#"));
    }

    @Test
    public void testValidateValidSingleCharacter() {
        OptionValidator validator = new OptionValidator();
        Assertions.assertEquals("a", validator.validate("a"));
    }

    @Test
    public void testValidateInvalidMultiCharacter() {
        OptionValidator validator = new OptionValidator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> validator.validate("a#"));
    }

    @Test
    public void testValidateValidMultiCharacter() {
        OptionValidator validator = new OptionValidator();
        Assertions.assertEquals("abc", validator.validate("abc"));
    }
}