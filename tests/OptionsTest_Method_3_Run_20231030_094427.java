package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class OptionsTest_Method_3_Run_20231030_094427 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("test");
        when(option.hasLongOpt()).thenReturn(false);
        when(option.isRequired()).thenReturn(false);

        options.addOption(option);

        // Verify that the option was added to the shortOpts map
        Map<String, Option> shortOpts = getPrivateField(options, "shortOpts");
        assertTrue(shortOpts.containsKey("test"));
        assertEquals(option, shortOpts.get("test"));

        // Verify that the option was not added to the longOpts map
        Map<String, Option> longOpts = getPrivateField(options, "longOpts");
        assertFalse(longOpts.containsKey("test"));

        // Verify that the option was not added to the requiredOpts list
        List<Object> requiredOpts = getPrivateField(options, "requiredOpts");
        assertFalse(requiredOpts.contains(option));
    }

    private <T> T getPrivateField(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return (T) field.get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}