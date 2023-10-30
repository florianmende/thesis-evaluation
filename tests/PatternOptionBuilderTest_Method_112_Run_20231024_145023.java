package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PatternOptionBuilderTest_Method_112_Run_20231024_145023 {
    @Test
    void testIsValueCode_ValidValueCodes() {
        // Test all valid value codes
        assertTrue(PatternOptionBuilder.isValueCode('@'));
        assertTrue(PatternOptionBuilder.isValueCode(':'));
        assertTrue(PatternOptionBuilder.isValueCode('%'));
        assertTrue(PatternOptionBuilder.isValueCode('+'));
        assertTrue(PatternOptionBuilder.isValueCode('#'));
        assertTrue(PatternOptionBuilder.isValueCode('<'));
        assertTrue(PatternOptionBuilder.isValueCode('>'));
        assertTrue(PatternOptionBuilder.isValueCode('*'));
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    void testIsValueCode_InvalidValueCodes() {
        // Test all invalid value codes
        assertFalse(PatternOptionBuilder.isValueCode('a'));
        assertFalse(PatternOptionBuilder.isValueCode('b'));
        assertFalse(PatternOptionBuilder.isValueCode('c'));
        assertFalse(PatternOptionBuilder.isValueCode('d'));
        assertFalse(PatternOptionBuilder.isValueCode('e'));
        assertFalse(PatternOptionBuilder.isValueCode('f'));
        assertFalse(PatternOptionBuilder.isValueCode('g'));
        assertFalse(PatternOptionBuilder.isValueCode('h'));
        assertFalse(PatternOptionBuilder.isValueCode('i'));
        assertFalse(PatternOptionBuilder.isValueCode('j'));
        assertFalse(PatternOptionBuilder.isValueCode('k'));
        assertFalse(PatternOptionBuilder.isValueCode('l'));
        assertFalse(PatternOptionBuilder.isValueCode('m'));
        assertFalse(PatternOptionBuilder.isValueCode('n'));
        assertFalse(PatternOptionBuilder.isValueCode('o'));
        assertFalse(PatternOptionBuilder.isValueCode('p'));
        assertFalse(PatternOptionBuilder.isValueCode('q'));
        assertFalse(PatternOptionBuilder.isValueCode('r'));
        assertFalse(PatternOptionBuilder.isValueCode('s'));
        assertFalse(PatternOptionBuilder.isValueCode('t'));
        assertFalse(PatternOptionBuilder.isValueCode('u'));
        assertFalse(PatternOptionBuilder.isValueCode('v'));
        assertFalse(PatternOptionBuilder.isValueCode('w'));
        assertFalse(PatternOptionBuilder.isValueCode('x'));
        assertFalse(PatternOptionBuilder.isValueCode('y'));
        assertFalse(PatternOptionBuilder.isValueCode('z'));
    }

    @Test
    void testIsValueCode_NullCharacter() {
        // Test the null character
        assertFalse(PatternOptionBuilder.isValueCode('\0'));
    }
}