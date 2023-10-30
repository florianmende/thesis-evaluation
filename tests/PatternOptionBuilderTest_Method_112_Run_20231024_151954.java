package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PatternOptionBuilderTest_Method_112_Run_20231024_151954 {
    @Test
    public void testIsValueCode() {
        PatternOptionBuilder patternOptionBuilder = new PatternOptionBuilder();

        // Case 1: Input character is a value code
        assertTrue(patternOptionBuilder.isValueCode('@'));
        assertTrue(patternOptionBuilder.isValueCode(':'));
        assertTrue(patternOptionBuilder.isValueCode('%'));
        assertTrue(patternOptionBuilder.isValueCode('+'));
        assertTrue(patternOptionBuilder.isValueCode('#'));
        assertTrue(patternOptionBuilder.isValueCode('<'));
        assertTrue(patternOptionBuilder.isValueCode('>'));
        assertTrue(patternOptionBuilder.isValueCode('*'));
        assertTrue(patternOptionBuilder.isValueCode('/'));

        // Case 2: Input character is not a value code
        assertFalse(patternOptionBuilder.isValueCode('a'));
        assertFalse(patternOptionBuilder.isValueCode('b'));
        assertFalse(patternOptionBuilder.isValueCode('c'));

        // Case 3: Input character is null
        assertFalse(patternOptionBuilder.isValueCode(' '));
    }
}