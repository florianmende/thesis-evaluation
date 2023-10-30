package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_221_Run_20231027_232619 {
    @Test
    public void testCreateObject() throws ParseException {
        TypeHandler handler = new TypeHandler();
        Object obj = handler.createObject("java.lang.String");
        assertEquals("java.lang.String", obj.getClass().getName());
    }

    @Test
    public void testCreateObjectWithInvalidClass() {
        TypeHandler handler = new TypeHandler();
        assertThrows(ParseException.class, () -> handler.createObject("invalid.class.name"));
    }

    @Test
    public void testCreateObjectWithInvalidConstructor() {
        TypeHandler handler = new TypeHandler();
        assertThrows(ParseException.class, () -> handler.createObject("java.lang.Integer"));
    }
}