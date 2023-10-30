package org.apache.commons.cli;

import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternOptionBuilderTest_Method_111_Run_20231023_214133 {
    @Test
    void testGetValueClass() {
        // Test case 1: Object value
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueClass('@'));

        // Test case 2: String value
        assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueClass(':'));

        // Test case 3: Number value
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, PatternOptionBuilder.getValueClass('%'));

        // Test case 4: Class value
        assertEquals(PatternOptionBuilder.CLASS_VALUE, PatternOptionBuilder.getValueClass('+'));

        // Test case 5: Date value
        assertEquals(PatternOptionBuilder.DATE_VALUE, PatternOptionBuilder.getValueClass('#'));

        // Test case 6: Existing file value
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, PatternOptionBuilder.getValueClass('<'));

        // Test case 7: File value
        assertEquals(PatternOptionBuilder.FILE_VALUE, PatternOptionBuilder.getValueClass('>'));

        // Test case 8: File array value
        assertEquals(PatternOptionBuilder.FILES_VALUE, PatternOptionBuilder.getValueClass('*'));

        // Test case 9: URL value
        assertEquals(PatternOptionBuilder.URL_VALUE, PatternOptionBuilder.getValueClass('/'));

        // Test case 10: Invalid value
        assertEquals(null, PatternOptionBuilder.getValueClass('?'));
    }
}