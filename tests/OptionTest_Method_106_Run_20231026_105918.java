package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_106_Run_20231026_105918 {
    @Test
    public void testSetRequired() throws Exception {
        // Test case 1: setRequired(true)
        Option option = new Option("a", "arg-name", false, "description");
        option.setRequired(true);
        Field field = Option.class.getDeclaredField("required");
        field.setAccessible(true);
        assertTrue((Boolean) field.get(option));

        // Test case 2: setRequired(false)
        option = new Option("a", "arg-name", false, "description");
        option.setRequired(false);
        field = Option.class.getDeclaredField("required");
        field.setAccessible(true);
        assertFalse((Boolean) field.get(option));

        // Test case 3: setRequired(null)
        option = new Option("a", "arg-name", false, "description");
        option.setRequired(Boolean.FALSE);
        field = Option.class.getDeclaredField("required");
        field.setAccessible(true);
        assertFalse((Boolean) field.get(option));
    }
}