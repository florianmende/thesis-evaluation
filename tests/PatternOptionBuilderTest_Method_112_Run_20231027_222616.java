package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_112_Run_20231027_222616 {
    @Test
    public void testIsValueCode() {
        // Test case 1: The character is a value code
        assertTrue(PatternOptionBuilder.isValueCode('@'));
        assertTrue(PatternOptionBuilder.isValueCode(':'));
        assertTrue(PatternOptionBuilder.isValueCode('%'));
        assertTrue(PatternOptionBuilder.isValueCode('+'));
        assertTrue(PatternOptionBuilder.isValueCode('#'));
        assertTrue(PatternOptionBuilder.isValueCode('<'));
        assertTrue(PatternOptionBuilder.isValueCode('>'));
        assertTrue(PatternOptionBuilder.isValueCode('*'));
        assertTrue(PatternOptionBuilder.isValueCode('/'));

        // Test case 2: The character is not a value code
        assertFalse(PatternOptionBuilder.isValueCode('A'));
        assertFalse(PatternOptionBuilder.isValueCode('B'));
        assertFalse(PatternOptionBuilder.isValueCode('C'));

        // Test case 3: The character is null
        assertFalse(PatternOptionBuilder.isValueCode(' '));
    }
}