package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TypeHandlerTest_Method_216_Run_20231024_165833 {
    @Test
    public void testCreateClass() {
        // Test case 1: Valid class name
        String className = "java.lang.String";
        try {
            Class<?> clazz = TypeHandler.createClass(className);
            assertEquals(String.class, clazz);
        } catch (ParseException e) {
            fail("Unexpected ParseException");
        }

        // Test case 2: Invalid class name
        className = "invalid.class.name";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Unable to find the class"));
        }

        // Test case 3: Class name not found
        className = "java.lang.NonExistentClass";
        try {
            TypeHandler.createClass(className);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Unable to find the class"));
        }
    }
}