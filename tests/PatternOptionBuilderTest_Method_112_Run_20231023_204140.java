package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PatternOptionBuilderTest_Method_112_Run_20231023_204140 {
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
        assertFalse(PatternOptionBuilder.isValueCode('b'));
        assertFalse(PatternOptionBuilder.isValueCode('c'));
        assertFalse(PatternOptionBuilder.isValueCode('d'));
        assertFalse(PatternOptionBuilder.isValueCode('e'));
        assertFalse(PatternOptionBuilder.isValueCode('f'));
        assertFalse(PatternOptionBuilder.isValueCode('g'));
        assertFalse(PatternOptionBuilder.isValueCode('h'));
        assertFalse(PatternOptionBuilder.isValueCode('i'));
        assertFalse(PatternOptionBuilder.isValueCode('j'));
    }
}