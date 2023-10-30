package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class OptionTest_Method_76_Run_20231024_060930 {
    @Test
    public void testGetArgName() throws Exception {
        Option option = Mockito.mock(Option.class);
        when(option.getArgName()).thenCallRealMethod();

        // Test case 1: argName is set to a non-null value
        String argName = "argName";
        Field argNameField = Option.class.getDeclaredField("argName");
        argNameField.setAccessible(true);
        argNameField.set(option, argName);
        assertEquals(argName, option.getArgName());

        // Test case 2: argName is set to null
        argNameField.set(option, null);
        assertEquals(null, option.getArgName());

        // Test case 3: argName is set to an empty string
        argNameField.set(option, "");
        assertEquals("", option.getArgName());
    }
}