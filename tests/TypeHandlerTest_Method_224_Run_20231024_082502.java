package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_224_Run_20231024_082502 {

    @Test
    public void testCreateValue() throws ParseException {
        // Case 1: The method should return an object of the given type with the given value.
        final String value = "test";
        final Class<?> type = String.class;
        Object result = TypeHandler.createValue(value, type);
        assertEquals(value, result);

        // Case 2: The method should throw a ParseException if the given type is not supported.
        final Class<?> type2 = Integer.class;
        assertThrows(ParseException.class, () -> TypeHandler.createValue(value, type2));

        // Case 3: The method should throw a ParseException if the given value is not valid for the given type.
        final String value2 = "invalid";
        final Class<?> type3 = Integer.class;
        assertThrows(ParseException.class, () -> TypeHandler.createValue(value2, type3));
    }
}