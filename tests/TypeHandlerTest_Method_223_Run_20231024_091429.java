package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_223_Run_20231024_091429 {
    @Test
    public void testCreateStringValue() throws ParseException {
        String str = "hello";
        Class<String> clazz = String.class;
        String value = TypeHandler.createValue(str, clazz);
        Assertions.assertEquals(str, value);
    }

    @Test
    public void testCreateObjectValue() throws ParseException {
        String str = "java.lang.String";
        Class<Object> clazz = Object.class;
        Object value = TypeHandler.createValue(str, clazz);
        Assertions.assertNotNull(value);
    }

    @Test
    public void testCreateNumberValue() throws ParseException {
        String str = "42";
        Class<Number> clazz = Number.class;
        Number value = TypeHandler.createValue(str, clazz);
        Assertions.assertEquals(42, value.intValue());
    }
}