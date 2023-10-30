package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CommandLineTest_Method_136_Run_20231024_151954 {

    @Test
    public void testGetOptionValueNotSet() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CommandLine commandLine = mock(CommandLine.class);
        Method method = CommandLine.class.getDeclaredMethod("getOptionValue", char.class);
        method.setAccessible(true);
        char option = 'a';
        String value = (String) method.invoke(commandLine, option);
        assertNull(value);
    }

    @Test
    public void testGetOptionValueSetWithArgument() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CommandLine commandLine = mock(CommandLine.class);
        Method method = CommandLine.class.getDeclaredMethod("getOptionValue", char.class);
        method.setAccessible(true);
        char option = 'a';
        String argument = "arg";
        when(commandLine.getOptionValue(option)).thenReturn(argument);
        String value = (String) method.invoke(commandLine, option);
        assertEquals(argument, value);
    }

    @Test
    public void testGetOptionValueSetWithoutArgument() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CommandLine commandLine = mock(CommandLine.class);
        Method method = CommandLine.class.getDeclaredMethod("getOptionValue", char.class);
        method.setAccessible(true);
        char option = 'a';
        when(commandLine.getOptionValue(option)).thenReturn(null);
        String value = (String) method.invoke(commandLine, option);
        assertNull(value);
    }
}