package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PatternOptionBuilderTest_Method_111_Run_20231024_145023 {

    @Test
    public void testGetValueClass() {
        // Test that the method returns the correct class for each possible input character
        assertEquals(String.class, PatternOptionBuilder.getValueClass(':'));
        assertEquals(Number.class, PatternOptionBuilder.getValueClass('%'));
        assertEquals(Object.class, PatternOptionBuilder.getValueClass('@'));
        assertEquals(Date.class, PatternOptionBuilder.getValueClass('#'));
        assertEquals(FileInputStream.class, PatternOptionBuilder.getValueClass('<'));
        assertEquals(File.class, PatternOptionBuilder.getValueClass('>'));
        assertEquals(File[].class, PatternOptionBuilder.getValueClass('*'));
        assertEquals(URL.class, PatternOptionBuilder.getValueClass('/'));

        // Test that the method returns null if the input character is not a valid value code
        assertNull(PatternOptionBuilder.getValueClass('a'));

        // Test that the method returns null if the input character is a valid value code but the corresponding class is not available
        assertNull(PatternOptionBuilder.getValueClass('!'));
    }
}