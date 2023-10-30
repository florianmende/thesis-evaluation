package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.junit.Test;

public class TypeHandlerTest_Method_224_Run_20231024_165833 {
    @Test
    public void testCreateValue_CorrectClass() throws ParseException {
        String str = "test";
        Class<String> clazz = String.class;
        String value = TypeHandler.createValue(str, clazz);
        assertEquals(str, value);
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_ClassNotFound() throws ParseException {
        String str = "test";
        Class<String> clazz = null;
        TypeHandler.createValue(str, clazz);
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_InvalidValue() throws ParseException {
        String str = "test";
        Class<Integer> clazz = Integer.class;
        TypeHandler.createValue(str, clazz);
    }
}