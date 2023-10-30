package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TypeHandlerTest_Method_224_Run_20231025_105031 {
    @Test
    public void testCreateValueWithValidString() throws ParseException {
        String str = "foo";
        Object obj = TypeHandler.createValue(str, String.class);
        assertEquals(str, obj);
    }

    @Test
    public void testCreateValueWithInvalidString() {
        String str = "foo";
        assertThrows(ParseException.class, () -> TypeHandler.createValue(str, Integer.class));
    }

    @Test
    public void testCreateValueWithValidStringAndSubclass() throws ParseException {
        String str = "foo";
        Object obj = TypeHandler.createValue(str, String.class);
        assertEquals(str, obj);
    }
}