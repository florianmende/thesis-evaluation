package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_216_Run_20231024_082502 {
    @Test
    public void testCreateClass() throws ParseException {
        // Test case 1: valid class name
        final String className = "java.lang.String";
        Class<?> expectedClass = null;
        try {
            expectedClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<?> actualClass = TypeHandler.createClass(className);
        Assertions.assertEquals(expectedClass, actualClass);

        // Test case 2: invalid class name
        final String className2 = "java.lang.NonExistentClass";
        Assertions.assertThrows(ParseException.class, () -> TypeHandler.createClass(className2));

        // Test case 3: null class name
        final String className3 = null;
        Assertions.assertThrows(NullPointerException.class, () -> TypeHandler.createClass(className3));
    }
}