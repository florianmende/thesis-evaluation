package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TypeHandlerTest_Method_224_Run_20231025_193245 {

    @Mock
    private TypeHandler typeHandler;

    @Test
    public void testCreateValueWithValidClass() throws ParseException {
        // Arrange
        String str = "test";
        Class<?> clazz = String.class;

        // Act
        Object result = typeHandler.createValue(str, clazz);

        // Assert
        assertEquals(str, result);
    }

    @Test
    public void testCreateValueWithInvalidClass() {
        // Arrange
        String str = "test";
        Class<?> clazz = null;

        // Act
        assertThrows(ParseException.class, () -> typeHandler.createValue(str, clazz));
    }

    @Test
    public void testCreateValueWithValidClassAndValue() throws ParseException {
        // Arrange
        String str = "test";
        Class<?> clazz = String.class;

        // Act
        Object result = typeHandler.createValue(str, clazz);

        // Assert
        assertEquals(str, result);
    }
}