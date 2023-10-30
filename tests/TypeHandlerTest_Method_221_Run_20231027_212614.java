package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_221_Run_20231027_212614 {
    @Test
    public void testCreateObject() throws ParseException {
        // Test case 1: The class exists and can be created
        TypeHandler handler = new TypeHandler();
        Object obj = handler.createObject("java.lang.String");
        Assertions.assertNotNull(obj);
        Assertions.assertTrue(obj instanceof String);

        // Test case 2: The class does not exist
        Assertions.assertThrows(ParseException.class, () -> {
            handler.createObject("invalid.class.name");
        });

        // Test case 3: The class can be created but has no empty constructor
        Assertions.assertThrows(ParseException.class, () -> {
            handler.createObject("java.lang.Integer");
        });
    }
}