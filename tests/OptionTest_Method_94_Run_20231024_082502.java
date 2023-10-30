package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_94_Run_20231024_082502 {
    @Test
    public void testHasLongOpt() throws Exception {
        // Mock the Option class and its private fields
        Option option = mock(Option.class);
        Field longOptionField = Option.class.getDeclaredField("longOption");
        longOptionField.setAccessible(true);

        // Case 1: When the long name is null, the method should return false
        when(option.hasLongOpt()).thenReturn(false);
        assertFalse(option.hasLongOpt());

        // Case 2: When the long name is an empty string, the method should return false
        longOptionField.set(option, "");
        when(option.hasLongOpt()).thenReturn(false);
        assertFalse(option.hasLongOpt());

        // Case 3: When the long name is a non-empty string, the method should return true
        longOptionField.set(option, "long-option");
        when(option.hasLongOpt()).thenReturn(true);
        assertTrue(option.hasLongOpt());
    }
}