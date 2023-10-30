package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_75_Run_20231023_204140 {
    @Test
    public void testEqualsSameObject() {
        Option option = new Option("test", true, "Test option");
        assertEquals(option, option);
    }

    @Test
    public void testEqualsSameNameAndArg() {
        Option option1 = new Option("test", true, "Test option");
        Option option2 = new Option("test", true, "Test option");
        assertEquals(option1, option2);
    }

    @Test
    public void testEqualsDifferentName() {
        Option option1 = new Option("test", true, "Test option");
        Option option2 = new Option("test2", true, "Test option");
        assertNotEquals(option1, option2);
    }

    @Test
    public void testEqualsDifferentArg() {
        Option option1 = new Option("test", true, "Test option");
        Option option2 = new Option("test", false, "Test option");
        assertEquals(option1, option2);
    }

    @Test
    public void testEqualsNull() {
        Option option = new Option("test", true, "Test option");
        assertNotEquals(option, null);
    }

    @Test
    public void testEqualsDifferentClass() {
        Option option = new Option("test", true, "Test option");
        String string = "test";
        assertNotEquals(option, string);
    }
}