package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import org.junit.jupiter.api.Test;

class TypeHandlerTest_Method_224_Run_20231025_183916 {

    @Test
    void testCreateValueWithClass() throws ParseException {
        String str = "hello";
        Class<?> clazz = String.class;
        Object obj = TypeHandler.createValue(str, clazz);
        assertEquals(str, obj);
    }

    @Test
    void testCreateValueWithObject() throws ParseException {
        String str = "hello";
        Class<?> clazz = String.class;
        Object obj = TypeHandler.createValue(str, clazz);
        assertEquals(str, obj);
    }

    @Test
    void testCreateValueWithInvalidValue() {
        String str = "hello";
        Class<?> clazz = Integer.class;
        assertThrows(ParseException.class, () -> TypeHandler.createValue(str, clazz));
    }
}