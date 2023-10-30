package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PatternOptionBuilderTest_Method_112_Run_20231027_212614 {
    @Test
    public void testIsValueCode() {
        // Test case 1
        assertTrue(PatternOptionBuilder.isValueCode('@'));

        // Test case 2
        assertFalse(PatternOptionBuilder.isValueCode('a'));

        // Test case 3
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }
}