package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionValidatorTest_Method_64_Run_20231024_080105 {
    @Test
    public void testSingleCharacterLetter() {
        String option = "a";
        String expected = "a";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleCharacterSpecial() {
        String option = "?";
        String expected = "?";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiCharacter() {
        String option = "abc";
        String expected = "abc";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidCharacter() {
        String option = "a b";
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }

    @Test
    public void testNullOption() {
        String option = null;
        String expected = null;
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }
}