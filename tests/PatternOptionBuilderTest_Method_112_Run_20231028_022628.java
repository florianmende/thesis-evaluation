package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatternOptionBuilderTest_Method_112_Run_20231028_022628 {

    @Test
    void testIsValueCode() {
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

        assertFalse(PatternOptionBuilder.isValueCode(' '));
    }
}