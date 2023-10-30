package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_83_Run_20231028_032631 {
    @Test
    public void testGetTypeNoArgument() {
        // Create an option with no argument
        Option option = new Option("option", false, "description");

        // Verify that the type is String.class
        assertEquals(String.class, option.getType());
    }

    @Test
    public void testGetTypeWithArgument() {
        // Create an option with an argument
        Option option = new Option("option", true, "description");

        // Set the type to Integer.class
        option.setType(Integer.class);

        // Verify that the type is Integer.class
        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void testGetTypeWithDefaultValue() {
        // Create an option with a default value
        Option option = new Option("option", true, "description");

        // Set the type to String.class
        option.setType(String.class);

        // Verify that the type is String.class
        assertEquals(String.class, option.getType());
    }
}