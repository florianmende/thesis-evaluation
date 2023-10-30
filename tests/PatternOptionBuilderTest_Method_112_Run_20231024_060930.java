package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PatternOptionBuilderTest_Method_112_Run_20231024_060930 {
    @Test
    public void testIsValueCode() {
        // Case 1: The character is a value code
        char valueCode = '@';
        assertTrue(PatternOptionBuilder.isValueCode(valueCode));

        // Case 2: The character is not a value code
        char notValueCode = 'a';
        assertFalse(PatternOptionBuilder.isValueCode(notValueCode));

        // Case 3: The character is null
        char nullValue = '\0';
        assertFalse(PatternOptionBuilder.isValueCode(nullValue));
    }
}