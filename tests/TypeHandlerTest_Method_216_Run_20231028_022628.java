package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_216_Run_20231028_022628 {
    @Test
    public void testCreateClass() {
        String className = "java.lang.String";
        Class<?> clazz = null;
        try {
            clazz = TypeHandler.createClass(className);
        } catch (ParseException e) {
            Assertions.fail("Expected ParseException");
        }
        Assertions.assertEquals(String.class, clazz);
    }

    @Test
    public void testCreateInvalidClass() {
        String className = "invalid.class.name";
        try {
            TypeHandler.createClass(className);
            Assertions.fail("Expected ParseException");
        } catch (ParseException e) {
            Assertions.assertEquals("Unable to find the class: " + className, e.getMessage());
        }
    }

    @Test
    public void testCreateNonExistentClass() {
        String className = "non.existent.class";
        try {
            TypeHandler.createClass(className);
            Assertions.fail("Expected ParseException");
        } catch (ParseException e) {
            Assertions.assertEquals("Unable to find the class: " + className, e.getMessage());
        }
    }
}