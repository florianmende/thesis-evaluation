package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_75_Run_20231025_125643 {

    @Test
    public void testEqualsSameProperties() {
        // Create two Option objects with the same properties
        Option option1 = Option.builder("a").required(true).longOpt("arg-name").build();
        Option option2 = Option.builder("a").required(true).longOpt("arg-name").build();

        // Test that the equals method returns true
        assertTrue(option1.equals(option2));
    }

    @Test
    public void testEqualsDifferentProperties() {
        // Create two Option objects with different properties
        Option option1 = Option.builder("a").required(true).longOpt("arg-name").build();
        Option option2 = Option.builder("b").required(false).longOpt("arg-name").build();

        // Test that the equals method returns false
        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEqualsDifferentObject() {
        // Create an Option object and a String object
        Option option = Option.builder("a").required(true).longOpt("arg-name").build();
        String string = "a";

        // Test that the equals method returns false
        assertFalse(option.equals(string));
    }
}