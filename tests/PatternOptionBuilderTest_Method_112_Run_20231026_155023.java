package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_112_Run_20231026_155023 {
    @Test
    void testValidValueCodes() {
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
    }

    @Test
    void testInvalidValueCodes() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
        assertFalse(PatternOptionBuilder.isValueCode('b'));
        assertFalse(PatternOptionBuilder.isValueCode('c'));
        // Add more test cases as needed
    }

    @Test
    void testNullValueCode() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
    }
}