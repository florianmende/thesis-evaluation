package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class OptionValidatorTest_Method_66_Run_20231024_082502 {
    @Test
    public void testNullOption() {
        OptionValidator validator = new OptionValidator();
        assertEquals(null, validator.validate(null));
    }

    @Test
    public void testInvalidSingleCharacterOption() {
        OptionValidator validator = new OptionValidator();
        assertThrows(IllegalArgumentException.class, () -> validator.validate("#"));
    }

    @Test
    public void testInvalidMultiCharacterOption() {
        OptionValidator validator = new OptionValidator();
        assertThrows(IllegalArgumentException.class, () -> validator.validate("abc#"));
    }
}