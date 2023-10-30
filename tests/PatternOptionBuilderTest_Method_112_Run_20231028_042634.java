package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PatternOptionBuilderTest_Method_112_Run_20231028_042634 {
    @Test
    public void testIsValueCode() {
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

        assertFalse(PatternOptionBuilder.isValueCode('a'));
        assertFalse(PatternOptionBuilder.isValueCode(' '));
        assertFalse(PatternOptionBuilder.isValueCode('$'));
        assertFalse(PatternOptionBuilder.isValueCode('^'));
        assertFalse(PatternOptionBuilder.isValueCode('&'));
        assertFalse(PatternOptionBuilder.isValueCode('('));
        assertFalse(PatternOptionBuilder.isValueCode(')'));
        assertFalse(PatternOptionBuilder.isValueCode('-'));
        assertFalse(PatternOptionBuilder.isValueCode('='));
    }
}