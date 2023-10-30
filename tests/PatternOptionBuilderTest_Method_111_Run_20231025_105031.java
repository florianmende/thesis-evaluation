package org.apache.commons.cli;

import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternOptionBuilderTest_Method_111_Run_20231025_105031 {

    @Test
    public void testGetValueClass() {
        assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueClass(':'));
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, PatternOptionBuilder.getValueClass('%'));
        assertEquals(PatternOptionBuilder.CLASS_VALUE, PatternOptionBuilder.getValueClass('+'));
        assertEquals(PatternOptionBuilder.DATE_VALUE, PatternOptionBuilder.getValueClass('#'));
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, PatternOptionBuilder.getValueClass('<'));
        assertEquals(PatternOptionBuilder.FILE_VALUE, PatternOptionBuilder.getValueClass('>'));
        assertEquals(PatternOptionBuilder.FILES_VALUE, PatternOptionBuilder.getValueClass('*'));
        assertEquals(PatternOptionBuilder.URL_VALUE, PatternOptionBuilder.getValueClass('/'));
        assertEquals(null, PatternOptionBuilder.getValueClass(' '));
    }
}