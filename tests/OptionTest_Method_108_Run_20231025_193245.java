package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionTest_Method_108_Run_20231025_193245 {
    @Test
    public void testSetType_ClassCastException() throws NoSuchFieldException, IllegalAccessException {
        // Arrange
        Option option = new Option("test", "desc");
        Object inputType = new Object();

        // Act
        assertThrows(ClassCastException.class, () -> option.setType(inputType));
    }

    @Test
    public void testSetType_CorrectType() throws NoSuchFieldException, IllegalAccessException {
        // Arrange
        Option option = new Option("test", "desc");
        Class<?> inputType = String.class;

        // Act
        option.setType(inputType);

        // Assert
        Field typeField = Option.class.getDeclaredField("type");
        typeField.setAccessible(true);
        assertEquals(inputType, typeField.get(option));
    }

    @Test
    public void testSetType_SameType() throws NoSuchFieldException, IllegalAccessException {
        // Arrange
        Option option = new Option("test", "desc");
        Class<?> inputType = String.class;
        option.setType(inputType);

        // Act
        option.setType(inputType);

        // Assert
        Field typeField = Option.class.getDeclaredField("type");
        typeField.setAccessible(true);
        assertEquals(inputType, typeField.get(option));
    }
}