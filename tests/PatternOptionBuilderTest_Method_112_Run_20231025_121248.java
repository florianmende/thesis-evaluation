package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_112_Run_20231025_121248 {
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