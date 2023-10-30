package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.File;
import java.net.URL;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PatternOptionBuilderTest_Method_111_Run_20231027_222616 {
    @Test
    void testGetValueClass() {
        PatternOptionBuilder pob = new PatternOptionBuilder();

        // Test case 1:
        assertEquals(String.class, pob.getValueClass(':'));
        assertEquals(Number.class, pob.getValueClass('%'));
        assertEquals(Class.class, pob.getValueClass('+'));
        assertEquals(Date.class, pob.getValueClass('#'));
        assertEquals(FileInputStream.class, pob.getValueClass('<'));
        assertEquals(File.class, pob.getValueClass('>'));
        assertEquals(File[].class, pob.getValueClass('*'));
        assertEquals(URL.class, pob.getValueClass('/'));

        // Test case 2:
        assertNull(pob.getValueClass(' '));
        assertNull(pob.getValueClass('a'));
        assertNull(pob.getValueClass('Z'));

        // Test case 3:
        assertEquals(String.class, pob.getValueClass(':'));
        assertEquals(String.class, pob.getValueClass(':'));
    }
}