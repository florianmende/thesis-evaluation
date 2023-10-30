package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_112_Run_20231027_232619 {
    @Test
    void testValidValueCode() {
        PatternOptionBuilder pob = new PatternOptionBuilder();
        assertTrue(pob.isValueCode('@'));
        assertTrue(pob.isValueCode(':'));
        assertTrue(pob.isValueCode('%'));
        assertTrue(pob.isValueCode('+'));
        assertTrue(pob.isValueCode('#'));
        assertTrue(pob.isValueCode('<'));
        assertTrue(pob.isValueCode('>'));
        assertTrue(pob.isValueCode('*'));
        assertTrue(pob.isValueCode('/'));
    }

    @Test
    void testInvalidValueCode() {
        PatternOptionBuilder pob = new PatternOptionBuilder();
        assertFalse(pob.isValueCode('a'));
        assertFalse(pob.isValueCode('b'));
        assertFalse(pob.isValueCode('c'));
        assertFalse(pob.isValueCode('d'));
        assertFalse(pob.isValueCode('e'));
        assertFalse(pob.isValueCode('f'));
        assertFalse(pob.isValueCode('g'));
        assertFalse(pob.isValueCode('h'));
        assertFalse(pob.isValueCode('i'));
    }

    @Test
    void testNonCharacterInput() {
        PatternOptionBuilder pob = new PatternOptionBuilder();
        assertFalse(Boolean.valueOf(pob.isValueCode((char) 1)));
        assertFalse(Boolean.valueOf(pob.isValueCode((char) 1.0)));
    }
}