package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatternOptionBuilderTest_Method_112_Run_20231024_082502 {
    @Test
    public void testIsValueCode() {
        // Case 1: ch is one of the value codes
        assertTrue(PatternOptionBuilder.isValueCode('@'));
        assertTrue(PatternOptionBuilder.isValueCode(':'));
        assertTrue(PatternOptionBuilder.isValueCode('%'));
        assertTrue(PatternOptionBuilder.isValueCode('+'));
        assertTrue(PatternOptionBuilder.isValueCode('#'));
        assertTrue(PatternOptionBuilder.isValueCode('<'));
        assertTrue(PatternOptionBuilder.isValueCode('>'));
        assertTrue(PatternOptionBuilder.isValueCode('*'));
        assertTrue(PatternOptionBuilder.isValueCode('/'));
        assertTrue(PatternOptionBuilder.isValueCode('!'));

        // Case 2: ch is not one of the value codes
        assertFalse(PatternOptionBuilder.isValueCode('a'));
        assertFalse(PatternOptionBuilder.isValueCode('b'));
        assertFalse(PatternOptionBuilder.isValueCode('c'));
        assertFalse(PatternOptionBuilder.isValueCode('d'));
        assertFalse(PatternOptionBuilder.isValueCode('e'));
        assertFalse(PatternOptionBuilder.isValueCode('f'));
        assertFalse(PatternOptionBuilder.isValueCode('g'));
        assertFalse(PatternOptionBuilder.isValueCode('h'));
        assertFalse(PatternOptionBuilder.isValueCode('i'));
    }
}