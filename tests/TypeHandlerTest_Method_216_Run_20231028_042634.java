package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_216_Run_20231028_042634 {
    @Test
    public void testCreateClassValidClassName() {
        // Test that the method returns the correct Class object for a valid class name
        Class<?> cl = null;
        try {
            cl = TypeHandler.createClass("java.lang.String");
        } catch (ParseException e) {
            Assertions.fail("Unexpected ParseException thrown");
        }
        Assertions.assertEquals(String.class, cl);
    }

    @Test
    public void testCreateClassInvalidClassName() {
        // Test that the method throws a ParseException if the class name is invalid
        Assertions.assertThrows(ParseException.class, () -> TypeHandler.createClass("invalidClassName"));
    }

    @Test
    public void testCreateClassNotFound() {
        // Test that the method throws a ParseException if the class name is not found
        Assertions.assertThrows(ParseException.class, () -> TypeHandler.createClass("nonExistentClassName"));
    }
}