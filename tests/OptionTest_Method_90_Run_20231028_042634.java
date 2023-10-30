package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_90_Run_20231028_042634 {
    @Test
    void testHasArg() throws NoSuchFieldException, IllegalAccessException {
        Option option = Mockito.mock(Option.class);
        Field argCountField = Option.class.getDeclaredField("argCount");
        argCountField.setAccessible(true);

        // Test when argCount is 0
        argCountField.set(option, 0);
        Mockito.when(option.hasArg()).thenReturn(false);
        assertFalse(option.hasArg());

        // Test when argCount is 1
        argCountField.set(option, 1);
        Mockito.when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());

        // Test when argCount is Option.UNLIMITED_VALUES
        argCountField.set(option, Option.UNLIMITED_VALUES);
        Mockito.when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }
}