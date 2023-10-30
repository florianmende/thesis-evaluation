package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_87_Run_20231024_091429 {
    @Test
    public void testGetValuesWithNoValues() throws NoSuchFieldException, IllegalAccessException {
        // Create an Option object with no values
        Option option = new Option("test", false, "This is a test option");

        // Use reflection to set the values field to an empty list
        Field valuesField = Option.class.getDeclaredField("values");
        valuesField.setAccessible(true);
        valuesField.set(option, new ArrayList<>());

        // Check that the method returns null
        assertNull(option.getValues());
    }

    @Test
    public void testGetValuesWithOneValue() throws NoSuchFieldException, IllegalAccessException {
        // Create an Option object with one value
        Option option = new Option("test", true, "This is a test option");

        // Use reflection to set the values field to a list with one element
        Field valuesField = Option.class.getDeclaredField("values");
        valuesField.setAccessible(true);
        valuesField.set(option, new ArrayList<>(List.of("value1")));

        // Check that the method returns an array with one element
        assertArrayEquals(new String[]{"value1"}, option.getValues());
    }

    @Test
    public void testGetValuesWithMultipleValues() throws NoSuchFieldException, IllegalAccessException {
        // Create an Option object with multiple values
        Option option = new Option("test", true, "This is a test option");

        // Use reflection to set the values field to a list with multiple elements
        Field valuesField = Option.class.getDeclaredField("values");
        valuesField.setAccessible(true);
        valuesField.set(option, new ArrayList<>(List.of("value1", "value2", "value3")));

        // Check that the method returns an array with all the values
        assertArrayEquals(new String[]{"value1", "value2", "value3"}, option.getValues());
    }
}