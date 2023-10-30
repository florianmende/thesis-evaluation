package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_111_Run_20231023_204140 {
    @Test
    public void testGetValueClass() {
        // Test case 1
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueClass('@'));

        // Test case 2
        assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueClass(':'));

        // Test case 3
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, PatternOptionBuilder.getValueClass('%'));
    }
}