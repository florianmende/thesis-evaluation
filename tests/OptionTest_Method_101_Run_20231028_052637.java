package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest_Method_101_Run_20231028_052637 {

    @Test
    void testSetArgName() throws NoSuchFieldException, IllegalAccessException {
        Option option = new Option("a", "arg-name");
        option.setArgName("new-arg-name");

        // Use reflection to access the argName field
        Field argNameField = Option.class.getDeclaredField("argName");
        argNameField.setAccessible(true);
        String argName = (String) argNameField.get(option);

        assertEquals("new-arg-name", argName);
    }
}