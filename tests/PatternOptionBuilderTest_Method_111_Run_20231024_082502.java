package org.apache.commons.cli;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.util.Date;
import java.io.FileInputStream;
import java.io.File;
import java.net.URL;

public class PatternOptionBuilderTest_Method_111_Run_20231024_082502 {
    @Test
    public void testGetValueClass() {
        assertEquals(String.class, PatternOptionBuilder.getValueClass(':'));
        assertEquals(Number.class, PatternOptionBuilder.getValueClass('%'));
        assertEquals(Date.class, PatternOptionBuilder.getValueClass('#'));
        assertEquals(FileInputStream.class, PatternOptionBuilder.getValueClass('<'));
        assertEquals(File.class, PatternOptionBuilder.getValueClass('>'));
        assertEquals(File[].class, PatternOptionBuilder.getValueClass('*'));
        assertEquals(URL.class, PatternOptionBuilder.getValueClass('/'));
        assertNull(PatternOptionBuilder.getValueClass(' '));
    }
}