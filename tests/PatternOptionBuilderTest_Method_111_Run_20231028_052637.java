package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternOptionBuilderTest_Method_111_Run_20231028_052637 {
    @Test
    public void testGetValueClass() {
        PatternOptionBuilder builder = new PatternOptionBuilder();

        // Test that the method returns String.class for ':'
        assertEquals(String.class, builder.getValueClass(':'));

        // Test that the method returns Number.class for '%'
        assertEquals(Number.class, builder.getValueClass('%'));

        // Test that the method returns null for ' '
        assertEquals(null, builder.getValueClass(' '));
    }
}