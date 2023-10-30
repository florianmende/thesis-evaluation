package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class OptionTest_Method_80_Run_20231025_215329 {
    @Test
    void testGetKey() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        // create an Option instance with a short option
        Option option = new Option("a", "arg-name", false, "description");

        // get the private field "option" using reflection
        Field field = Option.class.getDeclaredField("option");
        field.setAccessible(true);
        String shortOption = (String) field.get(option);

        // assert that the short option is returned
        assertEquals("a", shortOption);

        // create an Option instance with a long option
        option = new Option(null, "long-option", false, "description");

        // get the private field "longOption" using reflection
        field = Option.class.getDeclaredField("longOption");
        field.setAccessible(true);
        String longOption = (String) field.get(option);

        // assert that the long option is returned
        assertEquals("long-option", longOption);

        // create an Option instance with both a short and long option
        option = new Option("a", "long-option", false, "description");

        // get the private fields using reflection
        field = Option.class.getDeclaredField("option");
        field.setAccessible(true);
        shortOption = (String) field.get(option);
        field = Option.class.getDeclaredField("longOption");
        field.setAccessible(true);
        longOption = (String) field.get(option);

        // assert that the short option is returned
        assertEquals("a", shortOption);
        // assert that the long option is not returned
        assertEquals("long-option", longOption);
    }
}