package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Date;
import java.io.FileInputStream;
import java.io.File;
import java.net.URL;

public class PatternOptionBuilderTest_Method_111_Run_20231024_151954 {
    @Test
    public void testGetValueClass() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        assertEquals(String.class, builder.getValueClass(':'));
        assertEquals(Number.class, builder.getValueClass('%'));
        assertEquals(Date.class, builder.getValueClass('#'));
        assertEquals(Class.class, builder.getValueClass('+'));
        assertEquals(FileInputStream.class, builder.getValueClass('<'));
        assertEquals(File.class, builder.getValueClass('>'));
        assertEquals(File[].class, builder.getValueClass('*'));
        assertEquals(URL.class, builder.getValueClass('/'));
        assertNull(builder.getValueClass(' '));
    }
}