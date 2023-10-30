package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PatternOptionBuilderTest_Method_111_Run_20231027_232619 {

    @Test
    public void testGetValueClass_Number() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(Number.class, builder.getValueClass('%'));
    }

    @Test
    public void testGetValueClass_String() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(String.class, builder.getValueClass(':'));
    }

    @Test
    public void testGetValueClass_Object() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(Object.class, builder.getValueClass('@'));
    }

    @Test
    public void testGetValueClass_Date() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(Date.class, builder.getValueClass('#'));
    }

    @Test
    public void testGetValueClass_Class() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(Class.class, builder.getValueClass('+'));
    }

    @Test
    public void testGetValueClass_File() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(File.class, builder.getValueClass('>'));
    }

    @Test
    public void testGetValueClass_FileInputStream() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(FileInputStream.class, builder.getValueClass('<'));
    }

    @Test
    public void testGetValueClass_URL() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(URL.class, builder.getValueClass('/'));
    }

    @Test
    public void testGetValueClass_Null() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertNull(builder.getValueClass('x'));
    }
}