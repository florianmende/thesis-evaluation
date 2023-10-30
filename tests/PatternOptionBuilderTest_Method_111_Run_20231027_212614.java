package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_111_Run_20231027_212614 {
    @Test
    public void testGetValueClass() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(String.class, builder.getValueClass(':'));
        assertEquals(Number.class, builder.getValueClass('%'));
        assertEquals(Object.class, builder.getValueClass('@'));
        assertEquals(Date.class, builder.getValueClass('#'));
        assertEquals(Class.class, builder.getValueClass('+'));
        assertEquals(FileInputStream.class, builder.getValueClass('<'));
        assertEquals(File.class, builder.getValueClass('>'));
        assertEquals(File[].class, builder.getValueClass('*'));
        assertEquals(URL.class, builder.getValueClass('/'));
        assertNull(builder.getValueClass('a'));
    }
}