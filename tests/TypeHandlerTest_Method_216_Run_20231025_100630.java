package org.apache.commons.cli;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_216_Run_20231025_100630 {
    Class<?> clazz;

    @Test
    public void testCreateClassValidClassName() {
        // Given
        String className = "java.lang.String";

        // When
        try {
            clazz = TypeHandler.createClass(className);
        } catch (ParseException e) {
            // Then
            Assertions.fail("Unable to create class: " + className, e);
        }

        // Then
        Assertions.assertNotNull(clazz);
        Assertions.assertEquals(String.class, clazz);
    }

    @Test
    public void testCreateClassInvalidClassName() {
        // Given
        String className = "invalid.class.name";

        // When
        Exception exception = Assertions.assertThrows(ParseException.class, () -> {
            TypeHandler.createClass(className);
        });

        // Then
        Assertions.assertNotNull(exception);
        Assertions.assertEquals("Unable to find the class: invalid.class.name", exception.getMessage());
    }

    @Test
    public void testCreateClassValidClassNameButClassNotFound() {
        // Given
        String className = "com.example.NonExistentClass";

        // When
        Exception exception = Assertions.assertThrows(ParseException.class, () -> {
            TypeHandler.createClass(className);
        });

        // Then
        Assertions.assertNotNull(exception);
        Assertions.assertEquals("Unable to find the class: com.example.NonExistentClass", exception.getMessage());
    }
}