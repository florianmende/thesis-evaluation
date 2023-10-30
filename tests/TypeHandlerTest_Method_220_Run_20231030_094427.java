package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_220_Run_20231030_094427 {
    @Test
    public void testCreateNumber() throws ParseException {
        assertEquals(1.0, TypeHandler.createNumber("1.0"));
        assertEquals(1L, TypeHandler.createNumber("1"));
        assertThrows(ParseException.class, () -> TypeHandler.createNumber("abc"));
    }
}