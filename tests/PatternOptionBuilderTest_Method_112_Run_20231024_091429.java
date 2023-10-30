package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PatternOptionBuilderTest_Method_112_Run_20231024_091429 {
    @Test
    public void testIsValueCode() {
        // Test valid value codes
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

        // Test invalid characters
        assertFalse(PatternOptionBuilder.isValueCode('A'));
        assertFalse(PatternOptionBuilder.isValueCode('B'));
        assertFalse(PatternOptionBuilder.isValueCode('C'));
        assertFalse(PatternOptionBuilder.isValueCode('D'));
        assertFalse(PatternOptionBuilder.isValueCode('E'));
        assertFalse(PatternOptionBuilder.isValueCode('F'));
        assertFalse(PatternOptionBuilder.isValueCode('G'));
        assertFalse(PatternOptionBuilder.isValueCode('H'));
        assertFalse(PatternOptionBuilder.isValueCode('I'));
        assertFalse(PatternOptionBuilder.isValueCode('J'));

        // Test null character
        assertFalse(PatternOptionBuilder.isValueCode(' '));
    }
}