package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Constructor;

public class TypeHandlerTest_Method_221_Run_20231028_012625 {

    @Test
    public void testCreateObject_InvalidClassName() {
        assertThrows(ParseException.class, new Executable() {
            public void execute() throws Throwable {
                TypeHandler.createObject("InvalidClassName");
            }
        });
    }

    @Test
    public void testCreateObject_ValidClassName() throws ParseException {
        Object obj = TypeHandler.createObject("java.lang.String");
        assertEquals(String.class, obj.getClass());
    }

    @Test
    public void testCreateObject_NoEmptyConstructor() throws ParseException {
        assertThrows(ParseException.class, new Executable() {
            public void execute() throws Throwable {
                TypeHandler.createObject("java.lang.Integer");
            }
        });
    }
}