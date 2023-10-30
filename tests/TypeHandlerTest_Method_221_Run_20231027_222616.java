package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_221_Run_20231027_222616 {
    @Test
    public void testCreateObjectValidClass() {
        // Test case 1: valid class name
        try {
            Object obj = TypeHandler.createObject("java.lang.String");
            Assertions.assertNotNull(obj);
            Assertions.assertTrue(obj instanceof String);
        } catch (ParseException e) {
            Assertions.fail("Unexpected ParseException thrown");
        }
    }

    @Test
    public void testCreateObjectInvalidClass() {
        // Test case 2: invalid class name
        Assertions.assertThrows(ParseException.class, () -> {
            TypeHandler.createObject("invalid.class.name");
        });
    }

    @Test
    public void testCreateObjectNoEmptyConstructor() {
        // Test case 3: valid class name, but no empty constructor
        Assertions.assertThrows(ParseException.class, () -> {
            TypeHandler.createObject("java.lang.Integer");
        });
    }
}